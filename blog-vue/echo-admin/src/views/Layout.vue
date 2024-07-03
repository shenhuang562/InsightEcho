<script setup>
import {
    Management,
    Promotion,
    UserFilled,
    User,
    HomeFilled,
    Histogram,
    Crop,
    EditPen,
    SwitchButton,
    CaretBottom
} from '@element-plus/icons-vue'
import avatar from '@/assets/default.png'

import {useRouter} from 'vue-router'
let router = useRouter()
const exit = ()=>{
    router.push('/login')
}
const navigateTo = (path) => {
  router.push(path);
};
// 判断当前路由是否匹配给定路径
const isActiveRoute = (path) => {
  return router.currentRoute.value.path === path;
};
</script>

<template>
    <!-- elemnt-plus中的容器 -->
    <el-container class="layout-container">
        <!-- 左侧菜单 -->
        <el-aside width="200px">
            <div class="el-aside__logo">
                <h2>InsightEcho</h2>
            </div>
            <!-- 菜单标签 -->
            <el-menu  background-color="#232323"  text-color="#fff" router>
                <el-menu-item index="/home" :class="{'is-active' : isActiveRoute('/home')}">
                    <el-icon>
                        <HomeFilled />
                    </el-icon>
                    <span>主页</span>
                </el-menu-item>

                <el-sub-menu index="article">
                    <template #title>
                        <el-icon>
                            <Histogram />
                        </el-icon>
                        <span>文章管理</span>
                    </template>
                    <el-menu-item index="/article/write" :class="{'is-active' : isActiveRoute('/article/write')}">
                        <el-icon>
                            <Promotion />
                        </el-icon>
                        <span>文章发布</span>
                    </el-menu-item>
                    <el-menu-item index="/article/list" :class="{'is-active' : isActiveRoute('/article/list')}">
                    <el-icon>
                        <Management />
                    </el-icon>
                    <span>文章列表</span>
                </el-menu-item>
                </el-sub-menu>
 
                <el-sub-menu index="user">
                    <template #title>
                        <el-icon>
                            <UserFilled />
                        </el-icon>
                        <span>个人中心</span>
                    </template>
                    <el-menu-item index="/user/info" :class="{'is-active' : isActiveRoute('/user/info')}">
                        <el-icon>
                            <User />
                        </el-icon>
                        <span>基本资料</span>
                    </el-menu-item >
                    <el-menu-item index="/user/avatar" :class="{'isactive' : isActiveRoute('/user/avatar')}">
                        <el-icon>
                            <Crop />
                        </el-icon>
                        <span>更换头像</span>
                    </el-menu-item>
                    <el-menu-item index="/user/password" :class="{'is-active' : isActiveRoute('/user/password')}">
                        <el-icon>
                            <EditPen />
                        </el-icon>
                        <span>重置密码</span>
                    </el-menu-item>
                </el-sub-menu>
            </el-menu>
        </el-aside>
        <!-- 右侧主区域 -->
        <el-container>
            <!-- 头部区域 -->
            <el-header>
                <div></div>
                <!-- 下拉菜单 -->
                <el-dropdown placement="bottom-end">
                    <span class="el-dropdown__box">
                        <el-avatar :src="avatar" />
                        <el-icon>
                            <CaretBottom />
                        </el-icon>
                    </span>
                    <template #dropdown>
                        <el-dropdown-menu>
                            <el-dropdown-item command="profile" :icon="User" @click="navigateTo('/user/info')">
                                基本资料
                            </el-dropdown-item>
                            <el-dropdown-item command="avatar" :icon="Crop" @click="navigateTo('/user/avatar')">
                                更换头像
                            </el-dropdown-item>
                            <el-dropdown-item command="password" :icon="EditPen" @click="navigateTo('/user/password')">
                                重置密码
                            </el-dropdown-item>
                            <el-dropdown-item command="logout" :icon="SwitchButton" @click="exit">
                                退出登录
                            </el-dropdown-item>
                        </el-dropdown-menu>
                    </template>
                </el-dropdown>
            </el-header>
            <!-- 中间区域 -->
            <el-main>
                <router-view></router-view>
            </el-main>
            <!-- 底部区域 -->
            <el-footer>InsightEcho ©2024 Created by </el-footer>
        </el-container>
    </el-container>
</template>

<style lang="scss" scoped>
.layout-container {
    height: 100vh;

    .el-aside {
        background-color: #232323;

        &__logo {
            height: 100px;
            line-height: 100px;
            color:#fff;
            text-align: center;
            cursor:default;
        }

        .el-menu {
            border-right: none;
            .is-active {
                color: #ffd04b ;
            }
        }
    }

    .el-header {
        background-color: #fff;
        display: flex;
        align-items: center;
        justify-content: space-between;
        box-shadow: 0 1px 5px rgba(0, 0, 0, 0.3);

        .el-dropdown__box {
            display: flex;
            align-items: center;

            .el-icon {
                color: #999;
                margin-left: 10px;
            }

            &:active,
            &:focus {
                outline: none;
            }
        }
    }

    .el-main {
        padding: 0 20px;
    }
    
    .el-footer {
        display: flex;
        align-items: center;
        justify-content: center;
        font-size: 14px;
        color: #666;
        
    }
}
</style>