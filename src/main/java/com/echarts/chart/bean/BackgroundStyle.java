package com.echarts.chart.bean;

import lombok.Builder;
import lombok.Data;

/**
 * @author liboyi
 * @title: BackgroundStyle
 * @description 背景样式
 * @date 2021/8/28 23:44
 */
@Data
@Builder
public class BackgroundStyle {
    private String color;

    public BackgroundStyle(String color){
        this.color = color;
    }
}
