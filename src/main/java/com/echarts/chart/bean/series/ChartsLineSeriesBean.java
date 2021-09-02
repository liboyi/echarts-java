package com.echarts.chart.bean.series;

import com.echarts.chart.bean.AreaStyle;
import lombok.Data;

import java.util.List;

/**
 *
 * @author liboyi
 * @title  ChartsLineSeriesBean
 * @description 折线图 series
 * @date 2015-5-27
 */
@Data
public class ChartsLineSeriesBean extends ChartsSeriesBean {
   
   
   /**
    * 数据
    */
   private List<Object> data;

   private Integer yAxisIndex; //Y轴索引，从0开始，目前Echarts支持2个y轴，不写默认是0

   private AreaStyle areaStyle;

   private Boolean smooth;

   private String stack;

   public ChartsLineSeriesBean(){
      this.smooth = false;
   }

}
