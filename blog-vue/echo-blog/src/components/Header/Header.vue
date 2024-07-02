<template>
  <!-- 水平导航栏 -->
  <header class="header">
    <!-- 博客名 -->
    <h1 class="title">InsightEcho</h1>
    <!-- 按键选项 -->
    <nav class="menu">
      <template v-for="menu of menuList" :key="menu.name">
        <div v-if="!menu.children" class="menu-item" :class="{ active: $route.path === menu.path }">
          <router-link :to="menu.path" class="menu-btn">
            <img :src="menu.icon" width="15px" height="15px"> {{ menu.name }}
          </router-link>
        </div>
        <div v-else class="menu-item dropdown">
          <a class="menu-btn drop"> 
            <img :src="menu.icon" width="15px" height="15px"> {{ menu.name }}
          </a>
          <ul class="submenu">
            <li class="subitem" v-for="submenu of menu.children" :key="submenu.name"
              :class="{ active: $route.path === submenu.path }">
              <router-link class="link" :to="submenu.path">
                <img :src="submenu.icon" width="15px" height="15px"> {{ submenu.name }}
              </router-link>
            </li>
          </ul>
        </div>
      </template>
      <div class="menu-item">
        <a  @click="app.loginFlag = true" class="menu-btn">
          <img src="../../assets/icon/login.svg" width="15px" height="15px"> 登录
        </a>
        <!-- <template v-else>
          <img class="user-avatar drop" :src="user.avatar" />
          <ul class="submenu">
            <li class="subitem" :class="{ active: route.meta.title === '个人中心' }">
              <router-link to="/user" class="link">
                <svg-icon icon-class="author"></svg-icon> 个人中心
              </router-link>
            </li>
            <li class="subitem">
              <a class="link" @click="logout"><svg-icon icon-class="logout"></svg-icon> 退出 </a>
            </li>
          </ul>
        </template> -->
      </div>
    </nav>
  </header>
</template>

<script setup>
const login = () =>{
  alert('login')
}
const menuList = [
  {
    name: "首页",
    icon: new URL("@/assets/icon/home.svg",import.meta.url),
    path: "/"
  },
  {
    name: "文章",
    icon: new URL("@/assets/icon/article.svg",import.meta.url),
    path: "/article"
  },
  {
    name: "娱乐",
    icon: new URL("@/assets/icon/entertainment.svg",import.meta.url),
    children: [
      {
        name: "说说",
        icon: new URL("@/assets/icon/talk.svg",import.meta.url),
        path: "/talk"
      },
      {
        name: "相册",
        icon: new URL("@/assets/icon/album.svg",import.meta.url),
        path: "/album"
      },
    ]
  },
  {
    name: "友链",
    icon: new URL("@/assets/icon/friend.svg",import.meta.url),
    path: "/friend-links"
  },
  {
    name: "关于",
    icon: new URL("@/assets/icon/about.svg",import.meta.url),
    path: "/about"
  },
];
</script>

<style scoped>
* {
  padding:0;
  margin:0;
}
.header {
  background-color:rgba(231, 118, 108, 0.919);
  height:80px;
  width:100%;
  position:fixed;
  left:0;
  top:0;  
}

.title {
  color:white;
  position:absolute;
  left:12px;
  top:0;
  line-height: 80px;
  width:210px;
  cursor: default;
}

.menu{
  display:flex;
  margin-left:12vw;
  height: 100%;
}
.menu-item{
  position:relative;
  margin:0 5px;;
  top:0;
  height:60px;
  width:80px;
  line-height:80px;
  &:not(.title) .menu-btn::before {
    content: "";
    position: absolute;
    width: 0;
    height: 0.1875rem;
    bottom: 0;
    border-radius: 0.125rem;
    left: 50%;
    transform: translateX(-50%);
    background-color: currentColor;
    transition: all 0.4s ease-in-out 0s;
  }

  &:hover .submenu {
    display: block;
  }
}
.menu-btn {
    color:white;
    text-decoration: none;
    cursor:pointer;  
}

.menu-item.active:not(.dropdown) .menu-btn::before,
.menu-item:not(.dropdown):hover .menu-btn::before {
  width: 100%;
}

.submenu {
  display: none;
  position: absolute;
  
  /* 修改宽度为100%，以与.menu-item同宽 */
  width: 100%;
  left: 50%;
  transform: translateX(-50%);
  margin-top: 0;
  padding: 0;
  box-shadow: 0 0.3125rem 1.25rem -0.25rem grey;
  border-radius: 0.625rem 0;
  animation: slideUpIn 0.3s;

  &::before {
    position: absolute;
    top: -1.25rem;
    left: 50%;
    transform: translateX(-50%);
    width: 100%;
    height: 2.5rem;
    content: "";
  }
}

.subitem {
  display: flex; /* 修改为flex布局以方便居中 */
  justify-content: center; /* 水平居中 */
  align-items: center; /* 垂直居中 */
  height:3rem;
  width: 100%; /* 使子项与.submenu同宽 */
  background: rgb(194, 188, 188);

  &:first-child {
    border-radius: 0.625rem 0 0 0;
  }

  &:last-child {
    border-radius: 0 0 0.625rem 0;
  }
  .link {
    color:white;
    display: inline-flex;   /* 将链接设为行内弹性盒子模型，允许在一行内并排排列子元素并居中对齐 */
    align-items: center;    /* 垂直居中对齐子元素 */
    justify-content: center;
    text-decoration: none;
    height:100%;
    width:100%;
    line-height:100%;

  }
  &:hover .link {
    transform: translateX(0.3rem);
  }

}

.submenu .subitem.active,
.submenu .subitem:hover {
  color: grey;
  background-image: linear-gradient(to right, pink 30%, orange 100%);
  box-shadow: 0 0 0.75rem pink;
}

</style>