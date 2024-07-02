package com.example.InsightEcho.query;
import com.example.InsightEcho.constant.PageConstant;
import lombok.Data;

@Data
public class PageQuery {

    /**
     * 当前页
     */
    private Integer current;


    /**
     * 条数
     */
    private Integer size;

    public Integer getCurrent() {
        return current == null ? (PageConstant.DEFAULT_CURRENT - 1) * getSize() : (current - 1) * getSize();
    }

    public Integer getSize() {
        return size == null ? PageConstant.MY_SIZE : size;
    }

}