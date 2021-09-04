package com.echarts.chart.option;

import com.echarts.chart.bean.*;
import com.echarts.chart.bean.series.ChartsBarSeriesBean;
import lombok.Data;

import java.util.List;


/**
 * @author liboyi
 * @title BarLineMixedOptionBean
 * @description 柱状和折线混搭参数
 * @date 2015-5-27
 */
@Data
public class BarLineMixedOptionBean {
     public BarLineMixedOptionBean() {
          this.title = new ChartsTitleBean();
          this.tooltip = new ToolTipBean();
          this.legend = new LegendBean();
          this.xAxis = new XAxisBean();
     }

     private List<ChartsBarSeriesBean> series;

     private ChartsToolBoxBean toolbox;

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

     /**
      * x轴
      */
     private XAxisBean xAxis;

     /**
      * y轴
      */
     private List<YAxisBean> yAxis;


}
