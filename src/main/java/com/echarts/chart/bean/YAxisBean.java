package com.echarts.chart.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


/**
 *
 * @author liboyi
 * @title  YAxisBean
 * @description Y轴
 * @date 2015-5-7
 */
@Data
@Builder
@AllArgsConstructor
public class YAxisBean {
    private String type;
    private String name;
    private AxisLabel axisLabel;
    private SplitArea splitArea;

    public YAxisBean(){
        this.type = "value";
    }

    public YAxisBean(String name){
        this.name = name;
    }
}
