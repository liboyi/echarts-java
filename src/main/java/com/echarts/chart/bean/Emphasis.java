package com.echarts.chart.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


/**s
 * @author liboyi
 * @title  Emphasis
 * @description  图形样式 emphasis（悬浮时样式）
 * @date 2015-5-26
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Emphasis extends BaseItemStyle{
    /**
     * 饼图强调样式
     */
    private Integer shadowBlur;
    private Integer shadowOffsetX;
    private String shadowColor;


}
