//导入vue-router
import { createRouter, createWebHistory } from 'vue-router'
//导入组件
import LoginVue from '@/views/Login.vue'
import LayoutVue from '@/views/Layout.vue'

import ArticleListVue from '@/views/article/list.vue'
import ArticleWriteVue from '@/views/article/write.vue'
import UserAvatarVue from '@/views/user/UserAvatar.vue'
import UserInfoVue from '@/views/user/UserInfo.vue'
import UserResetPasswordVue from '@/views/user/UserResetPassword.vue'
import Home from '@/views/home/Home.vue'

//定义路由关系
const routes = [
    { path: '/login', component: LoginVue },
    { path: '/', component: LayoutVue, redirect:'/home',
      children:[
        { path: '/home', component: Home },
        { path: '/article/list', component: ArticleListVue },
        { path: '/article/write', component: ArticleWriteVue },
        { path: '/user/info', component: UserInfoVue },
        { path: '/user/avatar', component: UserAvatarVue },
        { path: '/user/password', component: UserResetPasswordVue },
      ]
    }
]

//创建路由器
const router = createRouter({
    history: createWebHistory(),
    routes: routes
});

export default router