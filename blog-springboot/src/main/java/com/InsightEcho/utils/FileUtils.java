package main.java.com.InsightEcho.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.InputStream;


/**
 * 文件md5工具类
 *
 * @author InsightEcho
 */
@Slf4j
public class FileUtils {

    /**
     * 获取文件md5值
     *
     * @param inputStream 文件输入流
     * @return {@link String} 文件md5值
     */
    public static String getMd5(InputStream inputStream) {
        String md5 = null;
        try {
            md5 = DigestUtils.md5DigestAsHex(inputStream);
        } catch (Exception e) {
            log.error("get md5 error, {}", e.getMessage());
        }
        return md5;
    }

    /**
     * 获取文件名的后缀
     *
     * @param file 表单文件
     * @return 后缀名
     */
    public static String getExtension(MultipartFile file) {
        String extension = FilenameUtils.getExtension(file.getOriginalFilename());
        if (!StringUtils.isNotBlank(extension)) {
            // If extension is blank, fallback to using the content type
            String contentType = file.getContentType();
            if (StringUtils.isNotBlank(contentType)) {
                extension = getExtensionFromContentType(contentType);
            }
        }
        return extension;
    }

    private static String getExtensionFromContentType(String contentType) {
        // Example logic to derive extension from contentType
        if ("image/jpeg".equals(contentType)) {
            return "jpg";
        } else if ("image/png".equals(contentType)) {
            return "png";
        }
        // Add more cases as needed
        return null;
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
     * 删除文件
     *
     * @param src 文件
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

}