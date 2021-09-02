package com.echarts.chart.factory;

import com.alibaba.fastjson.JSONObject;
import com.echarts.chart.bean.*;
import com.echarts.chart.bean.series.ChartsFunnelSeriesBean;
import com.echarts.chart.option.FunnelOptionBean;
import com.echarts.chart.request.FunnelChartRequest;
import com.exception.chart.bean.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author liboyi
 * @title FunnelFactory
 * @description 漏斗图形工厂
 * @date 2021/8/22 15:25
 */
public class FunnelFactory extends BaseFactory{

    /**
     * 创建漏斗图
     * @param funnelChartRequest funnelChartRequest
     * @return Object
     */
    public static Object createFunnel(FunnelChartRequest funnelChartRequest){
        FunnelOptionBean option=new FunnelOptionBean();
        //设置标题
        String x = Optional.ofNullable(funnelChartRequest.getLeft()).orElse("left");
        ChartsTitleBean title = ChartsTitleBean.builder().text(funnelChartRequest.getTitle()).
                subtext(funnelChartRequest.getSubTitle()).x(x).y(funnelChartRequest.getTop()).build();
        if(funnelChartRequest.getFontSize() != null){
            TextStyle textStyle = new TextStyle();
            textStyle.setFontSize(funnelChartRequest.getFontSize());
            title.setTextStyle(textStyle);
        }

        option.setTitle(title);
        //设置图例
        String left = Optional.ofNullable(funnelChartRequest.getTop()).orElse("center");
        String top = Optional.ofNullable(funnelChartRequest.getLeft()).orElse("top");
        LegendBean legendBean = LegendBean.builder().orient(funnelChartRequest.getOrient()).left(left)
                .top(top).orient(funnelChartRequest.getOrient()).build();
        option.setLegend(legendBean);
        //设置工具提示
        option.setTooltip(ToolTipBean.builder().trigger("item").formatter("{a} <br/>{b} : {c}%").build());
        //设置工具栏
        Feature feature = getFeature(false,true,false,false,
                true,null);
        ChartsToolBoxBean toolbox = new ChartsToolBoxBean(true);
        toolbox.setFeature(feature);
        option.setToolbox(toolbox);
        //数据
        List<ChartsFunnelSeriesBean> series = new ArrayList<>();
        ChartsFunnelSeriesBean funnelSeries = new ChartsFunnelSeriesBean();
        funnelSeries.setName(funnelChartRequest.getTitle());
        funnelSeries.setType("funnel");
        funnelSeries.setData(funnelChartRequest.getData());
        series.add(funnelSeries);
        option.setSeries(series);
        return JSONObject.toJSON(option);
    }



}
