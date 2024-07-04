<template>
    <el-card class="page-container">
        <template #header>
            <div class="header">
            <span>文章列表</span>
            <div class="extra">
                <el-button type="primary" @click="navigateTo('/article/write')">添加文章</el-button>
                <el-button type="primary" @click="console.log(articleList)">打印信息</el-button>
            </div>
            </div>
        </template>

        <el-table :data="tableData" style="width: 100%" border>
            <el-table-column align="center" label="缩略图" width="240px">
                <template #default="{ row }">
                    <img :src="row.cover" alt="" width="200px" align="center" style="margin:0 ;"/>
                </template>
            </el-table-column>
            <el-table-column align="center" label="标题" prop="title" />
            <el-table-column align="center" label="分类" prop="category" width="100px"/>
            <el-table-column align="center" label="标签" prop="tags" width="150px">
                <template #default="{ row }">
                    <el-tag type="primary" v-for="item of row.tags" style="margin:2px;">{{ item }}</el-tag>
                </template>
                
            </el-table-column>
            <el-table-column align="center" label="浏览量" prop="views" width="70px"/>
            <el-table-column align="center" label="点赞量" prop="likes" width="70px"/>

            <!-- 置顶属性栏 -->
            <el-table-column align="center" label="置顶" prop="isTop" width="100px">
                <template #default="{ row }">
                    <el-switch v-model="row.isTop" class="ml-2" style="--el-switch-on-color: #13ce66;" @change="handleTop(row)" />
                </template>
            </el-table-column>

            <!-- 推荐属性栏 -->
            <el-table-column align="center" label="推荐" prop="isRecommend" width="100px">
                <template #default="{ row }">
                    <el-switch v-model="row.isRecommend" class="ml-2" style="--el-switch-on-color: #13ce66;"  />
                </template>
            </el-table-column>

            <!-- 创建时间栏 -->
            <el-table-column prop="date" width="130" label="创建时间" align="center">
                <template #default="{row}">
                    <div class="create-time">
                        <el-icon>
                            <clock />
                        </el-icon>
                        <span style="margin-left: 10px">{{ row.date }}</span>
                    </div>
                </template>
            </el-table-column>

            <!-- 操作 -->
            <el-table-column  label="操作" align="center" width="220px">
                <template #default="{row}">
                    <el-button type="primary" :icon="Edit" circle plain @click="handleEdit(row.id)"/>
                    <el-button type="danger" :icon="Delete" circle plain @click="handleDelete(row.id)"/>
                </template>
            </el-table-column>
        </el-table>
        <!-- 分页条 -->
        <el-pagination v-if="articleList.length >0" v-model:current-page="pageNum" v-model:page-size="pageSize" :page-sizes="[3, 5 ,10]"
            layout="jumper, total, sizes, prev, pager, next" background :total="total" @size-change="onSizeChange"
            @current-change="onCurrentChange" style="margin-top: 20px; justify-content: flex-end" />
    </el-card>
</template>


<script lang="ts" setup>
import {
    Clock,
    Edit,
    Delete
} from '@element-plus/icons-vue'
import {useRouter} from 'vue-router'
let router = useRouter();
const navigateTo = (path) => {
  router.push(path);
};

import { ref,computed,watch } from 'vue'
import { Article} from '@/api/article/types';

let articleList = <Article[]>([
    {id:3,cover:"https://s21.ax1x.com/2024/06/30/pkc0NrD.jpg",title:"文章1",category:"算法",tags:["tag1","tag2"],views:1000,likes:200,isTop:true,isRecommend:false,date:'2024-01-01'},
    {id:34,cover:"https://s21.ax1x.com/2024/06/30/pkc0NrD.jpg",title:"文章2",category:"项目",tags:["aa","bb"],views:1500,likes:300,isTop:false,isRecommend:false,date:'2024-02-02'},
    {id:57,cover:"https://s21.ax1x.com/2024/06/30/pkc0NrD.jpg",title:"文章3",category:"测试",tags:["c"],views:1600,likes:400,isTop:true,isRecommend:true,date:'2024-03-03'},
    {id:57,cover:"https://s21.ax1x.com/2024/06/30/pkc0NrD.jpg",title:"文章3",category:"测试",tags:["c"],views:1600,likes:400,isTop:true,isRecommend:true,date:'2024-04-04'},
    {id:57,cover:"https://s21.ax1x.com/2024/06/30/pkc0NrD.jpg",title:"文章3",category:"测试",tags:["c"],views:1600,likes:400,isTop:true,isRecommend:true,date:'2024-05-05'},
    {id:57,cover:"https://s21.ax1x.com/2024/06/30/pkc0NrD.jpg",title:"文章3",category:"测试",tags:["c"],views:1600,likes:400,isTop:true,isRecommend:true,date:'2024-06-06'},
    {id:57,cover:"https://s21.ax1x.com/2024/06/30/pkc0NrD.jpg",title:"文章3",category:"测试",tags:["c"],views:1600,likes:400,isTop:true,isRecommend:true,date:'2024-07-07'},
])

//分页条数据模型
const pageNum = ref(1)//当前页
const total = ref(articleList.length)//总条数
const pageSize = ref(5)//每页条数

// 定义一个 ref 变量来存储分页后的数据
const tableData = ref<Article[]>([]);

// 定义一个计算属性，根据 pageNum 和 pageSize 计算分页后的数据

const computedTableData = computed(() => {
  const start = (pageNum.value - 1) * pageSize.value;
  const end = start + pageSize.value;

  return articleList.slice(start, end);
});
tableData.value = computedTableData.value;
watch([pageNum, pageSize], () => {
  console.log(tableData);
  tableData.value = computedTableData.value;
});

//当每页条数发生了变化，调用此函数
const onSizeChange = (size) => {
    pageSize.value = size
}
//当前页码发生变化，调用此函数
const onCurrentChange = (num) => {
    pageNum.value = num
}

const handleTop = (article: Article) => {
    let text = article.isTop === 0 ? "取消置顶" : "置顶";
    // updateArticleTop({ id: article.id, isTop: article.isTop }).then(({ data }) => {
    //     if (data.flag) {
    //         notifySuccess(data.msg);
    //     } else {
    //         article.isTop = article.isTop === 0 ? 1 : 0;
    //     }
    // });
};
const handleRecommend = (article: Article) => {
    let text = article.isRecommend === 0 ? "取消推荐" : "推荐";
    // updateArticleRecommend({ id: article.id, isRecommend: article.isRecommend }).then(({ data }) => {
    //     if (data.flag) {
    //         notifySuccess(data.msg);
    //     } else {
    //         article.isRecommend = article.isRecommend === 0 ? 1 : 0;
    //     }
    // });
};
const handleEdit = (id: number) => {
    router.push({ path: `/article/write/${id}` });
};

const handleDelete = (id?: number) => {
    alert("删除元素id:"+id);
};


</script>

<style scoped>
  .page-container {
    min-height: 100%;
    box-sizing: border-box;
  }

  .header {
    display: flex;
    align-items: center;
    justify-content: space-between;
  }

  .el-table th.gutter {
    display: table-cell !important;
  }

  .el-table--border th.gutter {
    border-right: none !important;
  }

  .el-table td.gutter {
    background-color: transparent !important;
  }

  .el-table__body tr:hover > td {
    background-color: inherit !important;
  }

</style>