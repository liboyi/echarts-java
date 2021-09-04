package com.echarts.chart.factory;

import com.alibaba.fastjson.JSONObject;
import com.echarts.chart.bean.*;
import com.echarts.chart.bean.series.ChartsLineSeriesBean;
import com.echarts.chart.option.LineOptionBean;
import com.echarts.chart.request.LineChartRequest;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author liboyi
 * @title: LineFactory
 * @description: 折线图图形工厂
 * @date 2021/8/23 23:29
 */
public class LineFactory extends BaseFactory{
    private LineFactory(){

    }

    /**
     * 创建折线图/支持平滑折线图/折线图堆叠
     * @param lineChartRequest lineChartRequest
     * @return Object
     */
    public static Object createLine(LineChartRequest lineChartRequest){
        List<String> magicTypeList = Optional.ofNullable(lineChartRequest.getMagicTypeList()).orElse(Arrays.asList("line", "bar"));
        lineChartRequest.setMagicTypeList(magicTypeList);
        LineOptionBean option = getLineOptionBean(lineChartRequest,"line");
        return JSONObject.toJSON(option);
    }

    /**
     * getLineOptionBean
     * @param lineChartRequest lineChartRequest
     * @param chartType chartType
     * @return LineOptionBean
     */
    private static LineOptionBean getLineOptionBean(LineChartRequest lineChartRequest,String chartType) {
        List<ChartsLineSeriesBean> series = new ArrayList<>();
        LineOptionBean option = new LineOptionBean();
        //拿到图例
        List<String> legendData = new ArrayList<>();
        Boolean smooth = Optional.ofNullable(lineChartRequest.getSmooth()).orElse(false);
        if(!CollectionUtils.isEmpty(lineChartRequest.getData())){
            for (int i = 0; i < lineChartRequest.getData().size(); i++) {
                legendData.add(lineChartRequest.getData().get(i).getName());
                ChartsLineSeriesBean temp = new ChartsLineSeriesBean();
                temp.setName(lineChartRequest.getData().get(i).getName());
                temp.setData(lineChartRequest.getData().get(i).getData());
                temp.setType("line");
                temp.setStack(lineChartRequest.getData().get(i).getStack());
                temp.setSmooth(smooth);
                if("area".equals(chartType)){
                    temp.setAreaStyle(new AreaStyle());
                }
                series.add(temp);
            }
        }

        if("area".equals(chartType)){
            option.setGrid(Grid.builder().left("3%").right("4%").bottom("3%").containLabel(true).build());
        }

        //设置标题
        String left = Optional.ofNullable(lineChartRequest.getLeft()).orElse("left");
        ChartsTitleBean title = buildTitle(lineChartRequest.getTitle(),lineChartRequest.getSubTitle(),
                left,lineChartRequest.getTop(),lineChartRequest.getFontSize());
        option.setTitle(title);
        //设置工具提示
        option.setTooltip(getToolTip(chartType));

        //设置工具栏
        ChartsToolBoxBean toolbox = new ChartsToolBoxBean(true);
        List<String> type = Arrays.asList("line", "bar");
        Feature feature = getFeature(true,true,true,true,
                true,type);
        toolbox.setFeature(feature);
        option.setToolbox(toolbox);
        //设置图例
        option.setLegend(new LegendBean(legendData));
        //设置x轴
        option.setXAxis(buildXAis(lineChartRequest.getXAxisName(),lineChartRequest.getXData()));
        //设置y轴
        option.setYAxis(buildYAis(lineChartRequest.getYAxisName()));
        //数据
        option.setSeries(series);
        return option;
    }

    /**
     * getToolTip
     * @param chartType chartType
     * @return ToolTipBean
     */
    private static ToolTipBean getToolTip(String chartType){
        if("line".equals(chartType)){
            return ToolTipBean.builder().trigger("axis").build();
        }else if("area".equals(chartType)){
            Label label = Label.builder().backgroundColor("#6a7985").build();
            AxisPointer axisPointer = AxisPointer.builder().type("cross").label(label).build();
            return ToolTipBean.builder().axisPointer(axisPointer).trigger("axis").build();
        }
        return null;
    }

    /**
     *  标准面积图/堆积面积图
     * @param lineChartRequest lineChartRequest
     * @return Object
     */
    public static Object createArea(LineChartRequest lineChartRequest){
        List<String> magicTypeList = Optional.ofNullable(lineChartRequest.getMagicTypeList()).
                orElse(Arrays.asList("line","bar","stack","tiled"));
        lineChartRequest.setMagicTypeList(magicTypeList);
        LineOptionBean option = getLineOptionBean(lineChartRequest,"area");
        return JSONObject.toJSON(option);
    }

}
