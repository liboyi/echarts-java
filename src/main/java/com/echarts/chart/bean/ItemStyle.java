package com.echarts.chart.bean;

import lombok.Data;
import lombok.experimental.SuperBuilder;

/**
 * @author liboyi
 * @title  LegendBean
 * @description 图形样式 normal(默认样式)
 * @date 2015-5-26
 */
@Data
@SuperBuilder
public class ItemStyle extends BaseItemStyle{
    private Integer borderRadius;
    private String borderColor;
    private Integer borderWidth;
}
