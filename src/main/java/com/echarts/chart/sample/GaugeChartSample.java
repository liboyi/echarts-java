package com.echarts.chart.sample;

import com.echarts.chart.factory.GaugeFactory;
import com.echarts.chart.request.GauageChartRequest;

/**
 * @author liboyi
 * @title: GaugeChartSample
 * @description 仪表盘示例
 * @date 2021/8/31 23:41
 */
public class GaugeChartSample {
    public static void main(String[] args) {
        GauageChartRequest gauageChartsRequest = new GauageChartRequest();
        gauageChartsRequest.setTitle("基础仪表盘");
        gauageChartsRequest.setShowProgress(true);
        gauageChartsRequest.setValue("50");
        Object jsonObject = GaugeFactory.createBaseGauge(gauageChartsRequest);
        System.out.println("仪表盘Option：" + jsonObject);
    }
}
