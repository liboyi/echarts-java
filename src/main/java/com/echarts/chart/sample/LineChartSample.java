package com.echarts.chart.sample;

import com.echarts.chart.request.LineChartRequest;
import com.echarts.chart.bean.ChartDataBean;
import com.echarts.chart.factory.LineFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liboyi
 * @title: LineChartSample
 * @description 折线图示例
 * @date 2021/8/31 23:41
 */
public class LineChartSample {

    public static void main(String[] args) {
        List<String> xData = Arrays.asList("周一", "周二", "周三", "周四", "周五", "周六", "周日");
        List<ChartDataBean> list = new ArrayList<>();
        list.add(ChartDataBean.builder().name("邮件营销").type("line").
                data(Arrays.asList(120, 132, 101, 134, 90, 230, 210)).build());
        list.add(ChartDataBean.builder().name("联盟广告").type("line").
                data(Arrays.asList(220, 182, 191, 234, 290, 330, 310)).build());
        list.add(ChartDataBean.builder().name("视频广告").type("line").
                data(Arrays.asList(150, 232, 201, 154, 190, 330, 410)).build());
        list.add(ChartDataBean.builder().name("直接访问").type("line").
                data(Arrays.asList(320, 332, 301, 334, 390, 330, 320)).build());
        list.add(ChartDataBean.builder().name("搜索引擎").type("line").
                data(Arrays.asList(820, 932, 901, 934, 1290, 1330, 1320)).build());
        LineChartRequest lineChartRequest = new LineChartRequest();
        lineChartRequest.setTitle("折线图");
        lineChartRequest.setXAxisName("x轴");
        lineChartRequest.setXData(xData);
        lineChartRequest.setYAxisName("y轴");
        lineChartRequest.setData(list);

        System.out.println("折线图Option：" + LineFactory.createLine(lineChartRequest));

        System.out.println("面积图Option：" + LineFactory.createArea(lineChartRequest));
    }
}
