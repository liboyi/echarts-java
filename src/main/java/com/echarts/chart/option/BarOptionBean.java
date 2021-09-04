package com.echarts.chart.option;

import com.echarts.chart.bean.*;
import com.echarts.chart.bean.series.ChartsBarSeriesBean;
import lombok.Data;

import java.util.List;


/**
 * @author liboyi
 * @title BarOptionBean
 * @description 柱状图参数
 * @date 2015-5-27
 */
@Data
public class BarOptionBean {
     public BarOptionBean() {
          this.toolbox = new ChartsToolBoxBean();
          this.title = new ChartsTitleBean();
          this.tooltip = new ToolTipBean();
          this.legend = new LegendBean();
          this.xAxis = new XAxisBean();
          this.yAxis = new YAxisBean();
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
     private YAxisBean yAxis;

}
