<template>
  <section class="slogan">
    <h1>Hello World!</h1>
    <img src="../../assets/icon/down.svg" @click="scrollToMainContent" class="scroll-to-main-img" />
  </section>
  <main ref="mainContent">
    <MainContent />
    <Sidebar />
  </main>

</template>

<script>
import Sidebar from '@/components/Sidebar/Sidebar.vue';
import MainContent from '@/components/MainContent/MainContent.vue';

export default {
  components: { Sidebar, MainContent },
  methods: {
    scrollToMainContent() {
      const mainContentElement = this.$refs.mainContent;
      mainContentElement.scrollIntoView({ behavior: 'smooth' });
    }
  }
};
</script>

<style scoped>
.slogan {
  background-image: url("https://s21.ax1x.com/2024/06/30/pkc0NrD.jpg");
  background-repeat: no-repeat;
  background-size: cover;
  background-position: center;
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  margin-bottom: 10px;
}
.slogan h1 {
  font-size: 50px;
  color: aliceblue;
}
main{
  display:flex;
  justify-content: center;
  align-items:flex-start;
}

.scroll-to-main-img {
  width:50px;
  height:50px;
  cursor: pointer; /* 鼠标移上时显示手型 */
  position: absolute; /* 图片组件绝对定位，便于覆盖在背景图片上 */
  bottom: 5vh; /* 调整图片组件在 slogan 中的位置 */
  /* 动画样式 */
  animation: scroll 1.5s infinite; /* 持续时间和无限循环 */
}
@keyframes scroll{
  /* 定义关键帧动画 */
  0%, 100% {
    transform: translateY(0); /* 在动画开始和结束时，回到原始位置 */
  }
  50% {
    transform: translateY(-10px); /* 在动画中间位置，向上移动10px */
  }
}
</style>
