package com.echarts.chart.bean;


import lombok.Data;

/**
 *
 * @author liboyi
 * @title  AxisTick
 * @description 坐标轴小标记 默认显示属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式
 * @date 2015-5-26
 */
@Data
public class AxisTick {
   /**
    * 显示策略，默认true
    */
   private boolean show;
   
   /**
    * splitNumber控制每份split细分多少段,默认5
    */
   private int splitNumber;
   
   /**
    * 控制线长，默认8
    */
   private int length;

   public AxisTick(){
      this.show = true;
      this.splitNumber = 5;
      this.length= 8;
   }

}
