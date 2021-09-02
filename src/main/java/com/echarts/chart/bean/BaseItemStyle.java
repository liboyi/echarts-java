package com.echarts.chart.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class BaseItemStyle {


    /**
     *标签，饼图默认显示在外部，离饼图距离由labelLine.length决定，漏斗图默认显示在右侧，离图形距离由labelLine.length决定
     *地图标签不可指定位置，折线图，柱形图，K线图，散点图可指定position
     *适用类型折线图，柱形图，K线图，散点图，饼图 ，地图，力导向，漏斗图，markPoint，markLine
     */
    public Label label;
    
    /**
     * 标签视觉引导线，默认显示 ，适用类型 饼图，漏斗图
     */
    public LabelLine labelLine;

}
