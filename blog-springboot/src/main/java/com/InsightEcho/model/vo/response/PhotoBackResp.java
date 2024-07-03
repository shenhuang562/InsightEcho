package com.InsightEcho.model.vo.response;

import lombok.Data;

@Data
public class PhotoBackResp {

    /**
     * 照片id
     */
    
    private Integer id;

    /**
     * 照片名
     */
    
    private String photoName;

    /**
     * 照片描述
     */
    
    private String photoDesc;

    /**
     * 照片地址
     */
    
    private String photoUrl;

}
