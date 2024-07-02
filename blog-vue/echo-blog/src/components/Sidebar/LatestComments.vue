<template>
    <div class="latest-comments">
      <div class="latest-comments-header">
        <h2>最新评论</h2>
      </div>
      <ul>
        <li v-for="(comment, index) in comments" :key="index" class="">
          <img :src="comment.avatar" alt="Avatar" />
          <div class="comment-user">{{ comment.user }}</div>
          <div class="comment-date">{{ comment.date }}</div>
          <div class="comment-text">{{ comment.text }}</div>
        </li>
      </ul>
    </div>
  </template>
  
  <script>
  export default {
    props: {
      comments: Array,
    },
  };
  </script>
  
  <style scoped>
  .latest-comments {
    margin-top: 20px;
  }
  
  .latest-comments-header {
    font-size: 16px;
    margin-bottom: 8px;
  }
  
  .comment {
    display: flex;
    align-items: center;
    margin-bottom: 10px;
  }
  
  .comment img {
    width: 40px;
    height: 40px;
    object-fit: cover;
    border-radius: 50%;
    margin-right: 10px;
  }
  
  .comment-text {
    font-size: 14px;
  }
  
  .comemnt-user, .comment-date {
    font-size: 12px;
    color: #999;
  }
  </style>