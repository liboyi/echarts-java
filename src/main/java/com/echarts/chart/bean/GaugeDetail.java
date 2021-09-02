package com.echarts.chart.bean;

import lombok.Data;

/**
 * @author liboyi
 * @title  GaugeDetail
 * @description 仪表盘详情
 * @date 2015-5-26
 */
@Data
public class GaugeDetail {
   
   /**
    * 可以格式化文本
    */
   private String formatter;

   private boolean valueAnimation;

   public GaugeDetail(){
      this.formatter = "{value}";
      this.valueAnimation = true;
   }

}
