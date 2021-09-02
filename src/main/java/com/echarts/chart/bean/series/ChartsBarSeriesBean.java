package com.echarts.chart.bean.series;

import com.echarts.chart.bean.BackgroundStyle;
import lombok.Data;

import java.util.List;


/**
 *
 * @author liboyi
 * @title  ChartsBarSeriesBean
 * @description 柱状图 series
 * @date 2015-5-27
 */
@Data
public class ChartsBarSeriesBean {
    public ChartsBarSeriesBean(){
        this.type = "bar";
    }

  /**
   * 堆积维度，以哪个属性堆积
   */
   private String stack;
   
   /**
    * 名称
    */
   private String name;
   
   /**
    * 图形类型
    */
   private String type;
   
   private Integer yAxisIndex; //Y轴索引，从0开始，目前Echarts支持2个y轴，不写默认是0
   
   /**
    * 数据
    */
   private List<Object> data;

    /**
     * 是否显示背景
     */
   private Boolean showBackground;

    /**
     * 背景样式
     */
   private BackgroundStyle backgroundStyle;

}
