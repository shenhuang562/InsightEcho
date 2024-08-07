package com.InsightEcho.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import cn.dev33.satoken.stp.StpUtil;
import com.InsightEcho.annotation.AccessLimit;
import com.InsightEcho.model.vo.Result;
import com.InsightEcho.model.vo.request.CodeReq;
import com.InsightEcho.model.vo.request.LoginReq;
import com.InsightEcho.model.vo.request.RegisterReq;
import com.InsightEcho.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * ClassName:LoginController
 * Package:com.InsightEcho.controller
 * Description:登录控制器
 *
 * @Author:mind-king
 * @Create:2024/7/3 - 下午2:39
 * @Version:v1.0
 */
@Api(tags = "登录模块")
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 用户登录
     *
     * @param login 登录参数
     * @return {@link String} Token
     */
    @ApiOperation(value = "用户登录")
    @PostMapping("/login")
    public Result<String> login(@Validated @RequestBody LoginReq login) {
        return Result.success(loginService.login(login));
    }

    /**
     * 用户退出
     */
    @SaCheckLogin
    @ApiOperation(value = "用户退出")
    @GetMapping("/logout")
    public Result<?> logout() {
        StpUtil.logout();
        return Result.success();
    }

    /**
     * 发送邮箱验证码
     *
     * @return {@link Result<>}
     */
    @AccessLimit(seconds = 60, maxCount = 1)
    @ApiOperation(value = "发送邮箱验证码")
    @GetMapping("/code")
    public Result<?> sendCode(String username) {
        loginService.sendCode(username);
        return Result.success();
    }

    /**
     * 用户邮箱注册
     *
     * @param register 注册信息
     * @return {@link Result<>}
     */
    @ApiOperation(value = "用户邮箱注册")
    @PostMapping("/register")
    public Result<?> register(@Validated @RequestBody RegisterReq register) {
        loginService.register(register);
        return Result.success();
    }

    /**
     * Github登录
     *
     * @param data 第三方code
     * @return {@link Result<String>} Token
     */
    @ApiOperation(value = "Github登录")
    @PostMapping("/oauth/github")
    public Result<String> githubLogin(@RequestBody CodeReq data) {
        return Result.success(loginService.githubLogin(data));
    }

    /**
     * QQ登录
     *
     * @param data 第三方code
     * @return {@link Result<String>} Token
     */
    @ApiOperation(value = "QQ登录")
    @PostMapping("/oauth/qq")
    public Result<String> qqLogin(@Validated @RequestBody CodeReq data) {
        return Result.success(loginService.qqLogin(data));
    }
}