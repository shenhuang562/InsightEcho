<script setup>
import { User, Lock } from '@element-plus/icons-vue'
import { ref } from 'vue'
import {useRouter} from 'vue-router'
const router = useRouter()
//控制注册与登录表单的显示， 默认显示注册
const isRegister = ref(false)
const registerData = ref({
  username:'',
  password:'',
})

// 校验密码函数
const checkrepassword = (rule,value,callback) => {
  if(value===''){
    callback(new Error('请再次确认密码'))
  }else{
    callback()
  }
}

// 定义表单校验规则
const rules={
  username:[
    {required:true,message:'请输入用户名',trigger:'blur'},
    {min:2,max:20,message:'长度为2~20位非空字符',trigger:'blur'},
  ],
  password:[
    {required:true,message:'请输入密码',trigger:'blur'},
    {min:2,max:20,message:'长度为2~20位非空字符',trigger:'blur'},
  ],
}

// 绑定数据，复用注册表单模型
// 表单数据校验同样复用
const login = () =>{
    alert("登陆成功")
    // 借助路由完成跳转
    router.push('/')
}

// 清空数据
const clearRegisterData = ()=>{
    registerData.value={
        username:'',
        password:'',
    }
}

</script>

<template>
    <el-row class="login-page">
        <el-col :span="12" class="bg"></el-col>
        <el-col :span="6" :offset="3" class="form">
            <!-- 登录表单 -->
            <el-form ref="form" size="large" autocomplete="off" :model="registerData" :rules="rules">
                <el-form-item>
                    <h1>登录</h1>
                </el-form-item>
                <el-form-item prop="username">
                    <el-input :prefix-icon="User" placeholder="请输入用户名" v-model="registerData.username"></el-input>
                </el-form-item>
                <el-form-item prop="password">
                    <el-input name="password" :prefix-icon="Lock" type="password" placeholder="请输入密码" v-model="registerData.password"></el-input>
                </el-form-item>
                <!-- 登录按钮 -->
                <el-form-item>
                    <el-button class="button" type="primary" auto-insert-space @click="login">登录</el-button>
                </el-form-item>
            </el-form>
        </el-col>
    </el-row>
</template>

<style lang="scss" scoped>
/* 样式 */
.login-page {
    height: 100vh;
    background-color: #fff;

    .bg {
        background: 
            // url('@/assets/logo2.png') no-repeat 60% center / 240px auto,
            url('@/assets/login_bg.jpg') no-repeat center / cover;
        border-radius: 0 20px 20px 0;
    }

    .form {
        display: flex;
        flex-direction: column;
        justify-content: center;
        user-select: none;

        .title {
            margin: 0 auto;
        }

        .button {
            width: 100%;
        }

        .flex {
            width: 100%;
            display: flex;
            justify-content: space-between;
        }
    }
}
</style>

