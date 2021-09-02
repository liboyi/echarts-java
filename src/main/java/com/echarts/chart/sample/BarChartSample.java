package com.echarts.chart.sample;

import com.echarts.chart.factory.BarFactory;
import com.echarts.chart.bean.ChartDataBean;
import com.echarts.chart.request.BarChartRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liboyi
 * @title: BarChartSample
 * @description 柱状图示例
 * @date 2021/8/3 10:34
 */
public class BarChartSample {
    public static void main(String[] args) {
        List<String> xData = Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
        BarChartRequest barChartRequest = new BarChartRequest();
        barChartRequest.setTitle("柱状图");
        barChartRequest.setXData(xData);

        List<ChartDataBean> data = new ArrayList<>();
        data.add(ChartDataBean.builder().data(Arrays.asList(120, 200, 150, 80, 70, 110, 130)).name("蒸发量").build());
        barChartRequest.setData(data);
        System.out.println("柱状图Option：" + BarFactory.createBar(barChartRequest));


        List<ChartDataBean> barList = new ArrayList<>();
        barList.add(ChartDataBean.builder().data(Arrays.asList(120, 200, 150, 80, 70, 110, 130)).name("蒸发量").build());
        List<ChartDataBean> lineList = new ArrayList<>();
        lineList.add(ChartDataBean.builder().data(Arrays.asList(210, 100, 50, 40, 10, 40, 30)).name("降雨量").build());

        BarChartRequest barChartRequest2 = new BarChartRequest();
        barChartRequest2.setTitle("柱状折线混搭图");
        barChartRequest2.setXData(xData);
        barChartRequest2.setData(barList);
        barChartRequest2.setLineList(lineList);
        System.out.println("柱状折线混搭图Option：" + BarFactory.mixedLineAndBar(barChartRequest2));
    }
}
