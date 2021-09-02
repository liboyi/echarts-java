package com.echarts.chart.request;

import com.echarts.chart.bean.ChartDataBean;
import lombok.Data;

import java.util.List;

/**
 * @author  liboyi
 * @title   LineChartRequest
 * @description 折线图参数
 * @date 2021/8/24 0:35
 */
@Data
public class LineChartRequest extends ChartBaseRequest{
    private String xAxisName;
    private List<String> xData;
    private String yAxisName;
    private String unit;
    private List<ChartDataBean> data;
    private Boolean smooth;
    private List<String> magicTypeList;
}
