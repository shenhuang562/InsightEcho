<template>
    <div class="page-slogan">
        <h1 class="page-title">关于</h1>

    </div>
    <div class="bg">
        <div class="page-container">
        <div class="avatar-box">
            <img class="author-avatar" src="https://avatars.githubusercontent.com/u/127128064?v=4" />
        </div>
        <v-md-preview class="md" text="华中科技大学22级专业实训 小组成员：姜浩原 曹华军 王思维 周唯"></v-md-preview>
        </div>
    </div>
</template>

<style scoped>
.page-slogan {
  background-image: url("https://s21.ax1x.com/2024/07/01/pkgkDDH.jpg");
  background-repeat: no-repeat;
  background-size: cover;
  background-position: center;
  height: 50vh;
  display: flex;
  justify-content: center;
  align-items: center;
  margin-bottom: 10px;
}
.page-slogan h1 {
  font-size: 50px;
  color: aliceblue;
}

.author-avatar {
    width: 110px;
    height: 110px;
    border-radius: 50%;
    transition: all 0.5s;
}

.author-avatar:hover {
    transform: rotate(360deg);
}
</style>
