package com.echarts.chart.bean.series;

import com.echarts.chart.bean.ChartDataBean;
import com.echarts.chart.bean.Emphasis;
import com.echarts.chart.bean.ItemStyle;
import lombok.Data;

import java.util.List;

/**
 *
 * @author liboyi
 * @title  ChartsLineSeriesBean
 * @description 饼图 series
 * @date 2015-5-29
 */
@Data
public class ChartsPieSeriesBean extends ChartsSeriesBean {

   public ChartsPieSeriesBean(){
      this.type = "pie";
   }
   
   /**
    * 半径，百分比计算比，min(width, height) / 2 * 75%， 传数组实现环形图，[内半径，外半径] 
    */
   private Object radius;
   
   /**
    * 数据
    */
   private List<ChartDataBean> data;
   
   
   private ItemStyle itemStyle;
   
   private String type;
   
   private Boolean clockWise;

   private Emphasis emphasis;

   /**
    * 玫瑰图专属属性
    */
   private String roseType;
}
