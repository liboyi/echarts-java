package com.echarts.chart.factory;

import com.alibaba.fastjson.JSONObject;
import com.echarts.chart.bean.*;
import com.echarts.chart.option.PieOptionBean;
import com.echarts.chart.bean.series.ChartsPieSeriesBean;
import com.exception.chart.bean.*;
import com.echarts.chart.request.PieChartRequest;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author liboyi
 * @title: PieFactory
 * @description 饼图图形工厂
 * @date 2021/8/18
 */
public class PieFactory extends BaseFactory{

    /**
     * 创建饼图
     * @param pieChartRequest pieChartRequest
     * @return Object
     */
    public static Object createPie(PieChartRequest pieChartRequest){
        if(CollectionUtils.isEmpty(pieChartRequest.getRadius())){
            pieChartRequest.setRadius(Arrays.asList("50%"));
        }
        if(!StringUtils.hasLength(pieChartRequest.getLeftOfLegend())){
            pieChartRequest.setLeftOfLegend("left");
        }
        if(!StringUtils.hasLength(pieChartRequest.getTopOfLegend())){
            pieChartRequest.setTopOfLegend("top");
        }
        if(!StringUtils.hasLength(pieChartRequest.getOrient())){
            pieChartRequest.setOrient("vertical");
        }
        return buildPie(pieChartRequest);
    }

    /**
     * 创建环形图
     * @param pieChartRequest pieChartRequest
     * @return Object
     */
    public static Object createRing(PieChartRequest pieChartRequest){
        pieChartRequest.setType("ring");
        if(!CollectionUtils.isEmpty(pieChartRequest.getRadius())){
            pieChartRequest.setRadius(Arrays.asList("40%","70%"));
        }
        return buildPie(pieChartRequest);
    }

    /**
     * 创建圆角环形图
     * @param pieChartRequest pieChartRequest
     * @return Object
     */
    public static Object createRingWithRoundedCorner(PieChartRequest pieChartRequest){
        if(!CollectionUtils.isEmpty(pieChartRequest.getRadius())){
            pieChartRequest.setRadius(Arrays.asList("40%","70%"));
        }
        if(StringUtils.hasLength(pieChartRequest.getBorderColor())){
            pieChartRequest.setBorderColor("#fff");
        }
        if(pieChartRequest.getBorderRadius() == null){
            pieChartRequest.setBorderRadius(10);
        }
        if(pieChartRequest.getBorderWidth() == null){
            pieChartRequest.setBorderWidth(2);
        }
        pieChartRequest.setType("ring");
        return buildPie(pieChartRequest);
    }

    /**
     * 创建玫瑰图
     * @param pieChartRequest pieChartRequest
     * @return Object
     */
    public static Object createRose(PieChartRequest pieChartRequest){
        pieChartRequest.setType("rose");
        String top = Optional.ofNullable(pieChartRequest.getTop()).orElse("bottom");
        pieChartRequest.setTop(top);
        List<String> radius = Optional.ofNullable(pieChartRequest.getRadius()).orElse(Arrays.asList("50","250"));
        pieChartRequest.setRadius(radius);
        return buildPie(pieChartRequest);
    }

    /**
     * 饼图和环形图生成json
     * @param pieChartRequest pieChartRequest
     * @return Object
     */
    private static Object buildPie(PieChartRequest pieChartRequest){
        String left = Optional.ofNullable(pieChartRequest.getLeft()).orElse("center");
        PieOptionBean option = new PieOptionBean();
        //设置标题
        ChartsTitleBean title = ChartsTitleBean.builder().text(pieChartRequest.getTitle()).
                subtext(pieChartRequest.getSubTitle()).x(left).y(pieChartRequest.getTop()).build();
        option.setTitle(title);
        //设置工具提示
        ToolTipBean tooltip = new ToolTipBean();
        tooltip.setTrigger("item");
        option.setTooltip(tooltip);
        //设置工具栏
        ChartsToolBoxBean toolbox = new ChartsToolBoxBean(true);
        List<String> type = Arrays.asList("pie", "funnel");
        Feature feature = getFeature(false,true,true,true,
                true,type);
        toolbox.setFeature(feature);
        option.setToolbox(toolbox);
        //设置图例
        LegendBean legendBean = LegendBean.builder().orient(pieChartRequest.getOrient()).left(pieChartRequest.getLeftOfLegend())
                .top(pieChartRequest.getTopOfLegend()).build();
        option.setLegend(legendBean);
        List<ChartsPieSeriesBean> series = new ArrayList<>();
        ChartsPieSeriesBean pieSeries = new ChartsPieSeriesBean();
        ItemStyle itemStyle = ItemStyle.builder().borderColor(pieChartRequest.getBorderColor()).
                borderRadius(pieChartRequest.getBorderRadius()).borderWidth(pieChartRequest.getBorderWidth()).build();
        pieSeries.setItemStyle(itemStyle);
        //数据
        pieSeries.setName(pieChartRequest.getTitle());
        pieSeries.setType("pie");
        if(pieChartRequest.getType().equals("rose")){
            pieSeries.setRoseType("area");
        }
        Object radius = pieChartRequest.getRadius().size()==1 ? pieChartRequest.getRadius().get(0) : pieChartRequest.getRadius();
        pieSeries.setRadius(radius);
        pieSeries.setData(pieChartRequest.getData());

        pieSeries.setEmphasis(getItemStyleEmphasis());
        series.add(pieSeries);
        option.setSeries(series);
        return JSONObject.toJSON(option);
    }

    /**
     * getItemStyleEmphasis
     * @return Emphasis
     */
    private static Emphasis getItemStyleEmphasis() {
        Emphasis itemStyleEmphasis = new Emphasis();
        itemStyleEmphasis.setShadowBlur(10);
        itemStyleEmphasis.setShadowOffsetX(0);
        itemStyleEmphasis.setShadowColor("rgba(0, 0, 0, 0.5)");
        return itemStyleEmphasis;
    }

}
