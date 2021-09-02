package com.echarts.chart.factory;

import com.alibaba.fastjson.JSONObject;
import com.echarts.chart.bean.Progress;
import com.echarts.chart.bean.series.ChartsGaugeSeriesBean;
import com.echarts.chart.option.GaugeOptionBean;
import com.echarts.chart.bean.ChartDataBean;
import com.echarts.chart.request.GauageChartRequest;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author liboyi
 * @title: GaugeFactory
 * @description: 仪表盘图形工厂
 * @date 2021/8/18
 */
public class GaugeFactory extends BaseFactory{

    /**
     * 基础仪表盘
     * @param gauageChartsRequest gauageChartsRequest
     * @return Object
     */
    public static Object createBaseGauge(GauageChartRequest gauageChartsRequest){
        GaugeOptionBean option = new GaugeOptionBean();
        ChartsGaugeSeriesBean gaugeSeriesBean = new ChartsGaugeSeriesBean();
        boolean showProgress = Optional.ofNullable(gauageChartsRequest.isShowProgress()).orElse(false);
        gaugeSeriesBean.setProgress(new Progress(showProgress));
        ChartDataBean gaugeDataBean = ChartDataBean.builder().name(gauageChartsRequest.getTitle()).
                value(gauageChartsRequest.getValue()).build();
        gaugeSeriesBean.setData(Arrays.asList(gaugeDataBean));
        option.setSeries(Arrays.asList(gaugeSeriesBean));
        return JSONObject.toJSON(option);
    }

}
