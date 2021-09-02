package com.echarts.chart.sample;

import com.echarts.chart.bean.ChartDataBean;
import com.echarts.chart.factory.FunnelFactory;
import com.echarts.chart.request.FunnelChartRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liboyi
 * @title: FunnelChartSample
 * @description 漏斗图示例
 * @date 2021/8/31 23:40
 */
public class FunnelChartSample {
    public static void main(String[] args) {
        List<ChartDataBean> data = new ArrayList<>();
        data.add(ChartDataBean.builder().name("访问").value("10").build());
        data.add(ChartDataBean.builder().name("咨询").value("40").build());
        data.add(ChartDataBean.builder().name("订单").value("20").build());
        data.add(ChartDataBean.builder().name("点击").value("80").build());
        data.add(ChartDataBean.builder().name("展现").value("100").build());

        FunnelChartRequest funnelChartRequest = new FunnelChartRequest();
        funnelChartRequest.setTitle("漏斗图");
        funnelChartRequest.setSubTitle("纯属虚构");
        funnelChartRequest.setData(data);
        Object jsonObject = FunnelFactory.createFunnel(funnelChartRequest);
        System.out.println("漏斗图Option：" + jsonObject);
    }
}
