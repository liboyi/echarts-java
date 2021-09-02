package com.echarts.chart.bean;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author liboyi
 * @title  ChartDataBean
 * @description 通用数据对象
 * @date 2021/8/29 1:45
 */
@Data
@Builder
public class ChartDataBean {
    /**
     * 名称
     */
    private String name;

    /**
     * 堆积维度，以哪个属性堆积，堆积图用，标准柱状图（普通柱状图）不需要设值
     */
    private String stack;

    /**
     * 数据
     */
    private List<Object> data;

    /**
     *
     */
    private String value;

    private String type;
}
