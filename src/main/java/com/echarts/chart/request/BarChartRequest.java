package com.echarts.chart.request;

import com.echarts.chart.bean.ChartDataBean;
import lombok.Data;

import java.util.List;

/**
 * @author liboyi
 * @title  BarChartRequest
 * @description 柱状图参数
 * @date 2021/8/24 0:35
 */
@Data
public class BarChartRequest extends ChartBaseRequest{
    /**
     * x轴名称，可为空
     */
    private String xAxisName;
    /**
     * x轴数据
     */
    private List<String> xData;
    /**
     * y轴名称，可为空
     */
    private String yAxisName;
    /**
     * y轴单位，可为空
     */
    private String unit;

    /**
     * 柱状图数据
     */
    private List<ChartDataBean> data;

    /**
     * 第二条Y轴的名称，可为空
     */
    private String y2AxisName;

    /**
     * 第二条Y轴的名称单位，可为空
     */
    private String y2Unit;

    /**
     * 柱状折线混搭图的折线图数据
     */
    private List<ChartDataBean> lineList;

    private List<String> magicTypeList;
}
