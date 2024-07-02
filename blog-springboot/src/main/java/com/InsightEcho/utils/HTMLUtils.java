package com.InsightEcho.utils;

import com.github.houbb.sensitive.word.bs.SensitiveWordBs;

/**
 * ClassName:HTMLUtils
 * Package:main.java.com.InsightEcho.utils
 * Description:HTML工具
 *
 * @Author:mind-king
 * @Create:2024/6/19 - 下午7:23
 * @Version:v1.0
 */
public class HTMLUtils {
    private static final SensitiveWordBs WOED_BS = SensitiveWordBs.newInstance()
            .ignoreCase(true)
            .ignoreWidth(true)
            .ignoreNumStyle(true)
            .ignoreChineseStyle(true)
            .ignoreEnglishStyle(true)
            .ignoreRepeat(true)
            .enableNumCheck(false)
            .enableEmailCheck(false)
            .enableUrlCheck(false)
            .init();

    /*
      删除标签

      @param source 需要进行剔除HTML的文本
      @return 过滤后的内容
     */
    public static String filter(String source) {
        // 敏感词过滤
        source = WOED_BS.replace(source);
        // 保留图片标签
        source = source.replaceAll("(?!<(img).*?>)<.*?>", "")
                .replaceAll("(onload(.*?)=)", "")
                .replaceAll("(onerror(.*?)=)", "");
        return deleteHtmlTag(source);
    }

    /*
    删除标签

    @param source 文本
    @return 过滤后的文本
     */
    public static String deleteHtmlTag(String source) {
        // 删除转义字符
        source = source.replaceAll("&.{2,6}?;", "");
        // 删除style标签
        source = source.replaceAll("<[\\s]*?script[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?script[\\s]*?>", "");
        // 删除style标签
        source = source.replaceAll("<[\\s]*?style[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?style[\\s]*?>", "");
        return source;
    }
}
