<template>
  <div class="main-content">
    <!-- 导览标题 -->
    <div>
      <h2>最新文章</h2>
    </div>
    
    <!-- 文章主内容 -->
    <div class="article-list-container">
      <ArticleList/>
    </div>
  </div>
</template>

<style scoped>
.main-content {
  width: 60%;
  float: left;
  display:flex;
  flex-direction:column;
  justify-content: center;
}
.main-content > div{
  margin: 10px; /* 设置每个子元素（即每个盒子）的下边距为10px */
  
}
.main-content > div > h2 {
  background-color: aqua;  
  border-radius: 10px;
  height: 80px;
  line-height:80px;
  text-align: center; /* 文字水平居中 */
}
</style>

<script>
import ArticleList from '@/components/MainContent/ArticleList.vue';

export default {
  components: { ArticleList}
};
</script>