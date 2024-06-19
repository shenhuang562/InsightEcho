package com.InsightEcho.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/**
 * 文件md5工具类
 *
 * @autuor InsightEcho
 */
@slf4j
public class FileUtils{
    /**
     * 获取文件md5值
     *
     * @param inputStream 文件输入流
     * @return {@link String} 文件md5值
     */
    public static String getmd5(InputStream inputStream){
        String md5 = null;
        try {
            md5 = DigestUtils.md5DigestAsHex(inputStream);
        }catch(Exception e){
            log.error("get md5 error,{}", e.getMessage());
        }
        return md5;
    }
}

/**
 * 获取文件名的后缀
 *
 * @param file 表单文件
 * @return 后缀名
 */

public static String getException(MultipartFile file){
    String extension = FilenameUtils.getExtension(file.getOriginalFilename());
    if(StringUtils.isEmpty(extension)){
        extension = MineTypeUtils.getExtension(Objects.requireNonNull(file.getContentType()));
    }
    return extension;
}


/**
 * 创建目录
 *
 * @param file 文件
 * @return 是否创建成功
 */
public static boolean mkdir(File file) {
    if (file == null) {
        return false;
    }
    if (file.exists()) {
        return false;
    }
    return file.mkdirs();
}

/**
 * 删除文件或目录
 *
 * @param src 文件或目录
 */
public static void deleteFile(File src) {
    for (File file : src.listFiles()) {
        if (file.isFile()) {
            file.delete();
        } else {
            deleteFile(file);
        }
    }
    src.delete();
}

