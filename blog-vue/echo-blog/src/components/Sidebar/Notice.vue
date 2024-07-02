<template>
    <div class="notice">
        <div class="notice-title">
            <h2>
                <i class="shake-image" style="color: red; font-size: 1.1875rem;"></i>
                公告
            </h2>
        </div>
        <div class="notice-content">
            <text v-html="noticeContent"></text>
            <a :href="projectUrl" target="_blank">项目地址</a>
        </div>
    </div>
</template>

<script>
export default {
props: {
    noticeContent: String,
    projectUrl: String,
},
};
</script>

<style scoped>
.notice {
    background-color: #f5f5f5;
    padding: 20px;
    border-radius: 4px;
}

.notice-title {
    font-size: 16px;
    margin-bottom: 8px;
}

.notice-content {
    color: #777;
    font-size: 20px;
    text-align: left;
}

.shake-image {
  display: inline-block;
  width: 25px; /* 图标宽度 */
  height: 25px; /* 图标高度 */
  background-image: url('../../assets/icon/notice.svg'); /* 图标路径 */
  background-size: cover; /* 图片大小适应 */
  color: transparent; /* 隐藏原有文本内容 */
  animation: shake 1s infinite; /* 持续时间和无限循环 */
}

@keyframes shake {
  0% {
    transform: rotate(-15deg);
  }

  4% {
    transform: rotate(15deg);
  }

  16% {
    transform: rotate(-22deg);
  }

  20% {
    transform: rotate(22deg);
  }

  8%,
  24% {
    transform: rotate(-18deg);
  }

  12%,
  28% {
    transform: rotate(18deg);
  }

  32% {
    transform: rotate(-12deg);
  }

  36% {
    transform: rotate(12deg);
  }

  40%,
  100% {
    transform: rotate(0deg);
  }
}


</style>