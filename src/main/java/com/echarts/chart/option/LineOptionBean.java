package com.echarts.chart.option;

import com.echarts.chart.bean.*;
import com.echarts.chart.bean.series.ChartsLineSeriesBean;
import lombok.Data;

import java.util.List;

/**
 * @author liboyi
 * @title: LineOptionBean
 * @description 折线图参数
 * @date 2015-5-27
 */
@Data
public class LineOptionBean {
     /**
      * 标题
      */
     private ChartsTitleBean title;

     /**
      * 工具提示
      */
     private ToolTipBean tooltip;

     /**
      * 图例
      */
     private LegendBean legend;

     private ChartsToolBoxBean toolbox;

     private List<ChartsLineSeriesBean> series;

     /**
      * x轴
      */
     private XAxisBean xAxis;

     /**
      * y轴
      */
     private YAxisBean yAxis;

     private Grid grid;
}
