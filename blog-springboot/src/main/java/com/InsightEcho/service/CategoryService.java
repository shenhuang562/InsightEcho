package com.InsightEcho.service;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.lang.Assert;
import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeNodeConfig;
import cn.hutool.core.lang.tree.TreeUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.InsightEcho.entity.Article;
import com.InsightEcho.entity.Category;
import com.InsightEcho.mapper.ArticleMapper;
import com.InsightEcho.mapper.CategoryMapper;
import com.InsightEcho.model.vo.response.*;
import com.InsightEcho.model.vo.PageResult;
import com.InsightEcho.model.vo.query.ArticleConditionQuery;
import com.InsightEcho.model.vo.query.CategoryQuery;
import com.InsightEcho.model.vo.request.CategoryReq;
import com.InsightEcho.utils.BeanCopyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 分类服务
 *
 * @author ican
 * @date 2022/12/02 17:35
 **/
@Service
public class CategoryService extends ServiceImpl<CategoryMapper, Category> {

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private ArticleMapper articleMapper;

    private static final int maxDeep = 3;

    public PageResult<CategoryBackResp> listCategoryBackVO(CategoryQuery categoryQuery) {
        // 查询分类数量
        Long count = categoryMapper.selectCount(new LambdaQueryWrapper<Category>()
                .like(StringUtils.hasText(categoryQuery.getKeyword()), Category::getCategoryName,
                        categoryQuery.getKeyword()));
        if (count == 0) {
            return new PageResult<>();
        }
        // 分页查询分类列表
        List<CategoryBackResp> categoryList = categoryMapper.selectBackCategoryList(categoryQuery);
        // 当前分类id列表
        Set<Integer> categoryIdList = categoryList.stream()
                .map(CategoryBackResp::getId)
                .collect(Collectors.toSet());
        // 执行分页
        int fromIndex = categoryQuery.getCurrent();
        int size = categoryQuery.getSize();
        int toIndex = categoryList.size() - fromIndex > size ? fromIndex + size : categoryList.size();
        return new PageResult<>(categoryList.subList(fromIndex, toIndex), (long) categoryList.size());
    }

    public void addCategory(CategoryReq category) {
        // 分类是否存在
        Category existCategory = categoryMapper.selectOne(new LambdaQueryWrapper<Category>()
                .select(Category::getId)
                .eq(Category::getCategoryName, category.getCategoryName()));
        Assert.isNull(existCategory, category.getCategoryName() + "分类已存在");
        // 添加新分类
        Category newCategory = Category.builder()
                .categoryName(category.getCategoryName())
                .build();
        baseMapper.insert(newCategory);
    }

    public void deleteCategory(List<Integer> categoryIdList) {
        // 分类下是否有文章
        Long count = articleMapper.selectCount(new LambdaQueryWrapper<Article>()
                .in(Article::getCategoryId, categoryIdList));
        Assert.isFalse(count > 0, "删除失败，分类下存在文章");
        // 批量删除分类
        categoryMapper.deleteBatchIds(categoryIdList);
    }

    public void updateCategory(CategoryReq category) {
        // 分类是否存在
        Category existCategory = categoryMapper.selectOne(new LambdaQueryWrapper<Category>()
                .select(Category::getId)
                .eq(Category::getCategoryName, category.getCategoryName()));
        Assert.isFalse(Objects.nonNull(existCategory) && !existCategory.getId().equals(category.getId()),
                category.getCategoryName() + "分类已存在");
        // 修改分类
        Category newCategory = Category.builder()
                .id(category.getId())
                .categoryName(category.getCategoryName())
                .build();
        baseMapper.updateById(newCategory);
    }

    public List<CategoryOptionResp> listCategoryOption() {
        // 查询分类
        List<Category> categoryList = categoryMapper.selectList(new LambdaQueryWrapper<Category>()
                .orderByDesc(Category::getId));
        return BeanCopyUtils.copyBeanList(categoryList, CategoryOptionResp.class);
    }

    public List<CategoryResp> listCategoryVO() {
        return categoryMapper.selectCategoryVO();
    }

    public ArticleConditionList listArticleCategory(ArticleConditionQuery articleConditionQuery) {
        List<ArticleConditionResp> articleConditionList = articleMapper.selectArticleListByCondition(articleConditionQuery);
        String name = categoryMapper.selectOne(new LambdaQueryWrapper<Category>()
                        .select(Category::getCategoryName)
                        .eq(Category::getId, articleConditionQuery.getCategoryId()))
                .getCategoryName();
        return ArticleConditionList.builder()
                .articleConditionVOList(articleConditionList)
                .name(name)
                .build();
    }



}