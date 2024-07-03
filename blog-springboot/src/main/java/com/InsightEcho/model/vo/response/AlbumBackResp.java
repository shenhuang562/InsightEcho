package com.InsightEcho.model.vo.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)

public class AlbumBackResp extends AlbumResp {

    /**
     * 状态 (1公开 2私密)
     */
    
    private Integer status;

    /**
     * 照片数量
     */
    
    private Long photoCount;

}
