package com.InsightEcho.strategy;

import org.springframework.web.multipart.MultipartFile;

/**
 * ClassName:UploadStrategy
 * Package:com.InsightEcho.strategy
 * Description:上传策略
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午5:14
 * @Version:v1.0
 */
public interface UploadStrategy {
    /**
     * 上传文件
     *
     * @param file 文件
     * @param path 上传路径
     * @return {@link String} 文件地址
     */
    String uploadFile(MultipartFile file, String path);
}
