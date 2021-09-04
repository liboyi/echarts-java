package com.echarts.chart.factory;

import com.alibaba.fastjson.JSONObject;
import com.echarts.chart.bean.*;
import com.echarts.chart.option.BarLineMixedOptionBean;
import com.echarts.chart.option.BarOptionBean;
import com.echarts.chart.bean.series.ChartsBarSeriesBean;
import com.echarts.chart.request.BarChartRequest;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author liboyi
 * @title  PieFactory
 * @description 饼图图形工厂
 * @date 2021/8/18
 */
public class BarFactory extends BaseFactory{

    private BarFactory(){

    }
    /**
     * 创建柱状图/柱状堆积
     * @param barChartRequest barChartRequest
     * @return Object
     */
    public static Object createBar(BarChartRequest barChartRequest){
        String formatter = StringUtils.hasLength(barChartRequest.getUnit()) ? "{value}" + barChartRequest.getUnit() : "{value}";
        List<ChartsBarSeriesBean> series = new ArrayList<>();
        //拿到图例
        List<String> legend = new ArrayList<>();
        String backgroundColor = "rgba(180, 180, 180, 0.2)";
        if(!CollectionUtils.isEmpty(barChartRequest.getData())){
            for (int i = 0; i < barChartRequest.getData().size(); i++) {
                legend.add(barChartRequest.getData().get(i).getName());
                ChartsBarSeriesBean temp = new ChartsBarSeriesBean();
                temp.setName(barChartRequest.getData().get(i).getName());
                temp.setStack(barChartRequest.getData().get(i).getStack());
                temp.setData(barChartRequest.getData().get(i).getData());
                temp.setType("bar");
                temp.setShowBackground(true);
                temp.setBackgroundStyle(new BackgroundStyle(backgroundColor));
                series.add(temp);
            }
        }
        BarOptionBean option = new BarOptionBean();
        //设置标题
        ChartsTitleBean title = getChartsTitleBean(barChartRequest);
        option.setTitle(title);
        //设置工具提示
        option.setTooltip(new ToolTipBean());
        //设置工具栏
        List<String> type = Arrays.asList("bar", "line");
        Feature feature = getFeature(true, true, true, true,
                true, type);
        ChartsToolBoxBean toolbox = new ChartsToolBoxBean(true);
        toolbox.setFeature(feature);
        option.setToolbox(toolbox);
        //设置图例
        LegendBean legendBean = getLegendBean(barChartRequest, legend);
        option.setLegend(legendBean);
        //设置x轴
        option.setXAxis(buildXAis(barChartRequest.getXAxisName(),barChartRequest.getXData()));
        //设置y轴
        YAxisBean yAxis = new YAxisBean();
        AxisLabel axisLabel = new AxisLabel(formatter);
        yAxis.setAxisLabel(axisLabel);
        yAxis.setName(barChartRequest.getYAxisName());
        option.setYAxis(yAxis);
        //数据
        option.setSeries(series);
        return JSONObject.toJSON(option);
    }

    /**
     *  getLegendBean
     * @param barChartRequest barChartRequest
     * @param legend legend
     * @return LegendBean
     */
    private static LegendBean getLegendBean(BarChartRequest barChartRequest, List<String> legend) {
        String leftOfLegend = Optional.ofNullable(barChartRequest.getLeftOfLegend()).orElse("center");
        String topOfLegend = Optional.ofNullable(barChartRequest.getTopOfLegend()).orElse("top");
        return LegendBean.builder().left(leftOfLegend).top(topOfLegend).data(legend).build();
    }

    /**
     *  创建柱状折线混搭图
     * @param barChartRequest barChartRequest
     * @return Object
     */
    public static Object mixedLineAndBar(BarChartRequest barChartRequest){
        List<ChartsBarSeriesBean> series = new ArrayList<>();
        if(!CollectionUtils.isEmpty(barChartRequest.getData())){
            for (ChartDataBean barDataBean : barChartRequest.getData()) {
                ChartsBarSeriesBean barSeries = new ChartsBarSeriesBean();
                barSeries.setData(barDataBean.getData());
                barSeries.setName(barDataBean.getName());
                barSeries.setStack(barDataBean.getStack());
                series.add(barSeries);
            }
        }
        if(!CollectionUtils.isEmpty(barChartRequest.getLineList())){
            for (ChartDataBean lineDataBean : barChartRequest.getLineList()) {
                ChartsBarSeriesBean barSeries = new ChartsBarSeriesBean();
                barSeries.setData(lineDataBean.getData());
                barSeries.setName(lineDataBean.getName());
                barSeries.setType("line");
                barSeries.setYAxisIndex(1);
                series.add(barSeries);
            }
        }
        BarLineMixedOptionBean option = new BarLineMixedOptionBean();
        String y1Formatter = StringUtils.hasLength(barChartRequest.getUnit()) ? "{value}" + barChartRequest.getUnit() : "{value}";
        String y2Formatter = StringUtils.hasLength(barChartRequest.getY2Unit()) ? "{value}" + barChartRequest.getY2Unit() : "{value}";
        //拿到图例
        List<String> legend = new ArrayList<>();
        if(!CollectionUtils.isEmpty(series)){
            for (int i = 0; i < series.size(); i++) {
                legend.add(series.get(i).getName());
            }
        }
        //设置标题
        ChartsTitleBean title = getChartsTitleBean(barChartRequest);
        option.setTitle(title);
        //设置工具提示
        option.setTooltip(new ToolTipBean());
        //设置工具栏
        ChartsToolBoxBean toolbox = new ChartsToolBoxBean(true);
        Feature feature = getFeature(true, true, false, true,
                true, null);
        toolbox.setFeature(feature);
        option.setToolbox(toolbox);
        //设置图例
        option.setLegend(getLegendBean(barChartRequest, legend));
        //设置x轴
        option.setXAxis(buildXAis(barChartRequest.getXAxisName(),barChartRequest.getXData()));
        //设置y轴
        List<YAxisBean> yAxis = new ArrayList<>();
        YAxisBean y1 = YAxisBean.builder().axisLabel(new AxisLabel(y1Formatter)).name(barChartRequest.getYAxisName()).build();
        yAxis.add(y1);
        YAxisBean y2 = YAxisBean.builder().axisLabel(new AxisLabel(y2Formatter)).name(barChartRequest.getY2AxisName()).build();
        yAxis.add(y2);
        option.setYAxis(yAxis);
        //数据
        option.setSeries(series);
        return JSONObject.toJSON(option);
    }

    /**
     * getChartsTitleBean
     * @param barChartRequest barChartRequest
     * @return ChartsTitleBean
     */
    private static ChartsTitleBean getChartsTitleBean(BarChartRequest barChartRequest) {
        String left = Optional.ofNullable(barChartRequest.getLeft()).orElse("left");
        String top = Optional.ofNullable(barChartRequest.getTop()).orElse("top");
        return buildTitle(barChartRequest.getTitle(), barChartRequest.getSubTitle(), left, top,
                barChartRequest.getFontSize());
    }

}
