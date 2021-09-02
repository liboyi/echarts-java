package com.echarts.chart.sample;

import com.echarts.chart.factory.PieFactory;
import com.echarts.chart.bean.ChartDataBean;
import com.echarts.chart.request.PieChartRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liboyi
 * @title: PieChartSample
 * @description 饼图示例
 * @date 2021/8/31 23:41
 */
public class PieChartSample {
    public static void main(String[] args) {
        List<ChartDataBean> list = new ArrayList<>();
        list.add(ChartDataBean.builder().name("搜索引擎").value("1048").build());
        list.add(ChartDataBean.builder().name("直接访问").value("735").build());
        list.add(ChartDataBean.builder().name("邮件营销").value("580").build());
        list.add(ChartDataBean.builder().name("联盟广告").value("484").build());
        list.add(ChartDataBean.builder().name("视频广告").value("300").build());
        PieChartRequest pieChartRequest = new PieChartRequest();
        pieChartRequest.setTitle("某站点用户访问来源");
        pieChartRequest.setSubTitle("纯属虚构");
        pieChartRequest.setData(list);

        Object jsonObject   = PieFactory.createPie(pieChartRequest);
        System.out.println("饼图Option：" + jsonObject);
        jsonObject  = PieFactory.createRose(pieChartRequest);
        System.out.println("玫瑰图Option：" + jsonObject);

        jsonObject  = PieFactory.createRing(pieChartRequest);
        System.out.println("环形图Option：" + jsonObject);

        jsonObject  = PieFactory.createRingWithRoundedCorner(pieChartRequest);
        System.out.println("圆角环形图Option：" + jsonObject);

    }
}
