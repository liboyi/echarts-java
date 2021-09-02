package com.echarts.chart.request;

import lombok.Data;

/**
 * @author liboyi
 * @title  ChartBaseRequest
 * @description 基类参数
 * @date 2021/8/21 23:10
 */
@Data
public class ChartBaseRequest {
    /**
     * 标题b
     */
    private String title;

    /**
     * 副标题
     */
    private String subTitle;
    /**
     * 字体大小
     */
    private Integer fontSize;

    private String orient;


    private String left;


    private String top;

    private String leftOfLegend;

    private String topOfLegend;

}
