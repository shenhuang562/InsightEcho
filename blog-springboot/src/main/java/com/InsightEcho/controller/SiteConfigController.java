package com.InsightEcho.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.InsightEcho.annotation.OptLogger;
import com.InsightEcho.entity.SiteConfig;
import com.InsightEcho.model.vo.Result;
import com.InsightEcho.service.SiteConfigService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import static com.InsightEcho.constant.OptTypeConstant.UPDATE;
import static com.InsightEcho.constant.OptTypeConstant.UPLOAD;
/**
 * ClassName:SiteConfigController
 * Package:com.InsightEcho.controller
 * Description:网站配置控制器
 *
 * @Author:mind-king
 * @Create:2024/7/3 - 上午9:45
 * @Version:v1.0
 */
@Api(tags = "网站配置模块")
@RestController
public class SiteConfigController {

    @Autowired
    private SiteConfigService siteConfigService;

    /**
     * 获取网站配置
     *
     * @return {@link Result<SiteConfig>} 网站配置
     */
    @ApiOperation(value = "获取网站配置")
    @SaCheckPermission("web:site:list")
    @GetMapping("/admin/site/list")
    public Result<SiteConfig> getSiteConfig() {
        return Result.success(siteConfigService.getSiteConfig());
    }

    /**
     * 更新网站配置
     *
     * @param siteConfig 网站配置
     * @return {@link Result<>}
     */
    @OptLogger(value = UPDATE)
    @ApiOperation(value = "更新网站配置")
    @SaCheckPermission("web:site:update")
    @PutMapping("/admin/site/update")
    public Result<?> updateSiteConfig(@RequestBody SiteConfig siteConfig) {
        siteConfigService.updateSiteConfig(siteConfig);
        return Result.success();
    }

    /**
     * 上传网站配置图片
     *
     * @param file 图片
     * @return {@link Result<String>} 图片路径
     */
    @OptLogger(value = UPLOAD)
    @ApiOperation(value = "上传网站配置图片")
    @ApiImplicitParam(name = "file", value = "配置图片", required = true, dataType = "MultipartFile")
    @SaCheckPermission("web:site:upload")
    @PostMapping("/admin/site/upload")
    public Result<String> uploadSiteImg(@RequestParam("file") MultipartFile file) {
        return Result.success(siteConfigService.uploadSiteImg(file));
    }

}
