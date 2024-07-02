<template>
  <div class="sidebar">
    <div class="recommended">
      <h2>推荐文章</h2>
      <!-- 在这里插入推荐文章的数据 -->
    </div>
    <Notice :notice-content="noticeContent" :project-url="projectUrl" />
    <LatestComments :comments="latestComments" />
  </div>
</template>

<script>
import Notice from './Notice.vue';
import LatestComments from './LatestComments.vue';

export default {
  components: { Notice, LatestComments },
  data() {
    return {
      noticeContent:
        '本博客采用Vue3前端开发，SpringBoot后端开发，',
      projectUrl: 'https://github.com/shenhuang562/InsightEcho',
      latestComments: [
        {
          avatar: 'https://example.com/avatar1.png',
          user:'1',
          text: '好好好',
          date: '2024-06-01',
        },
        {
          avatar: 'https://example.com/avatar2.png',
          user:'2',
          text: 'eeeee',
          date: '2024-06-10',
        },
        {
          avatar: 'https://example.com/avatar2.png',
          user:'3',
          text: 'hihihihi',
          date: '2024-06-29',
        },
      ],
    };
  },
};
</script>

<style scoped>
.sidebar {
  width: 20%;
  float: right;
  margin-left: 2%;
  display: flex;
  flex-direction: column;
}

.sidebar > div {
  border-radius: 10px;
  margin: 10px;
  box-shadow: 2px 2px 10px rgba(0, 0, 0, 0.2);
}

.recommended {
  background-color: beige;
}

.notice {
  background-color: rgb(222, 245, 220);
}
</style>