package com.InsightEcho.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.InsightEcho.annotation.OptLogger;
import com.InsightEcho.model.vo.PageResult;
import com.InsightEcho.model.vo.Result;
import com.InsightEcho.model.vo.query.FileQuery;
import com.InsightEcho.model.vo.request.FolderReq;
import com.InsightEcho.model.vo.response.FileResp;
import com.InsightEcho.service.BlogFileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static com.InsightEcho.constant.OptTypeConstant.*;
/**
 * ClassName:BlogFileController
 * Package:com.InsightEcho.controller
 * Description:文件控制器
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午7:37
 * @Version:v1.0
 */
@Api(tags = "文件模块")
@RestController
public class BlogFileController {

    @Autowired
    private BlogFileService fileService;

    /**
     * 查看文件列表
     *
     * @param fileQuery 查询条件
     * @return {@link Result< FileResp >} 文件列表
     */
    @ApiOperation(value = "查看文件列表")
    @SaCheckPermission("system:file:list")
    @GetMapping("/admin/file/list")
    public Result<PageResult<FileResp>> listFileVOList(FileQuery fileQuery) {
        return Result.success(fileService.listFileVOList(fileQuery));
    }

    /**
     * 上传文件
     *
     * @param file 文件
     * @return {@link Result<>}
     */
    @OptLogger(value = UPLOAD)
    @ApiOperation(value = "上传文件")
    @ApiImplicitParam(name = "file", value = "图片", required = true, dataType = "MultipartFile")
    @SaCheckPermission("system:file:upload")
    @PostMapping("/admin/file/upload")
    public Result<?> uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("path") String path) {
        fileService.uploadFile(file, path);
        return Result.success();
    }

    /**
     * 创建目录
     *
     * @param folder 目录信息
     * @return {@link Result<>}
     */
    @OptLogger(value = ADD)
    @ApiOperation(value = "创建目录")
    @SaCheckPermission("system:file:createFolder")
    @PostMapping("/admin/file/createFolder")
    public Result<?> createFolder(@Validated @RequestBody FolderReq folder) {
        fileService.createFolder(folder);
        return Result.success();
    }

    /**
     * 删除文件
     *
     * @param fileIdList 文件id列表
     * @return {@link Result<>}
     */
    @OptLogger(value = DELETE)
    @ApiOperation(value = "删除文件")
    @SaCheckPermission("system:file:delete")
    @DeleteMapping("/admin/file/delete")
    public Result<?> deleteFile(@RequestBody List<Integer> fileIdList) {
        fileService.deleteFile(fileIdList);
        return Result.success();
    }

    /**
     * 下载文件
     *
     * @param fileId 文件id
     * @return {@link Result<>}
     */
    @ApiOperation(value = "下载文件")
    @GetMapping("/file/download/{fileId}")
    public Result<?> downloadFile(@PathVariable("fileId") Integer fileId) {
        fileService.downloadFile(fileId);
        return Result.success();
    }
}
