package com.echarts.chart.bean;

import lombok.Data;

/**
 * @author liboyi
 * @title  ChordStyle
 * @description  和弦图中的弦样式
 * @date 2015-5-26
 */
@Data
public class ChordStyle {
 /**
  * 贝塞尔曲线的线宽, ribbonType是false时有效
  * 默认1
  */
  private int width;
  
  /**
   * 贝塞尔曲线的颜色, ribbonType是false时有效
   * 默认1
   */
  private String color;
  
  /**
   * ribbon的描边线宽, ribbonType是true时有效
   * 默认1
   */
  private String borderWidth;
  
  /**
   * ribbon的描边颜色, ribbonType是true时有效
   * 默认1
   */
  private String borderColor;

  public ChordStyle() {
    this.width = 1;
    this.color = "1";
    this.borderWidth = "1";
    this.borderColor = "1";
  }

}
