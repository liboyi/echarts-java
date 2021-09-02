package com.echarts.chart.request;

import lombok.Data;

/**
 * @author liboyi
 * @title GauageChartRequest
 * @description 仪表盘参数
 * @date 2021/8/21 22:51
 */
@Data
public class GauageChartRequest extends ChartBaseRequest{
    private String value;
    private boolean showProgress;
}

