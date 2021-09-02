package com.echarts.chart.bean;

import lombok.Builder;
import lombok.Data;

/**
 * @author liboyi
 * @title  Grid
 * @description
 * @date 2021/8/26 23:47
 */
@Data
@Builder
public class Grid {
    private String left;
    private String right;
    private Boolean containLabel;
    private String bottom;
}
