package com.echarts.chart.option;

import java.util.List;

import com.echarts.chart.bean.series.ChartsPieSeriesBean;
import com.echarts.chart.bean.ChartsTitleBean;
import com.echarts.chart.bean.ChartsToolBoxBean;
import com.echarts.chart.bean.ToolTipBean;
import com.echarts.chart.bean.LegendBean;
import lombok.Data;

/**
 * @author liboyi
 * @title: PieOptionBean
 * @description 饼图参数
 * @date 2015-5-27
 */
@Data
public class PieOptionBean {
    public PieOptionBean(){
        this.title = new ChartsTitleBean();
        this.tooltip = new ToolTipBean();
        this.legend = LegendBean.builder().left("left").orient("vertical").build();
    }
     
     private List<ChartsPieSeriesBean> series;
     
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

}
