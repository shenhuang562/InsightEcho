package com.InsightEcho.model.vo.response;

import lombok.Data;

@Data
public class AlbumResp {

    /**
     * 相册id
     */
    
    private Integer id;

    /**
     * 相册名
     */
    
    private String albumName;

    /**
     * 相册封面
     */
    
    private String albumCover;

    /**
     * 相册描述
     */
    
    private String albumDesc;

}