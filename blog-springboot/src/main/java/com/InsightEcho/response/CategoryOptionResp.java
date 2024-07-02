package com.InsightEcho.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.InsightEcho.response.CategoryResp;
import java.time.LocalDateTime;

@Data
public class CategoryOptionResp {
    /**
     * 分类id
     */
    private Integer id;
    /**
     * 分类名
     */
    private String categoryName;

}
