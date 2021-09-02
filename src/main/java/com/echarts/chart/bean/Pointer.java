package com.echarts.chart.bean;

import lombok.Data;

/**
 *
 * @author liboyi
 * @title  Pointer
 * @description 指针样式
 * @date 2015-5-26
 */
@Data
public class Pointer {
  /**
   * 控制线长，百分比相对的是仪表盘的外半径 
   */
  private String length;
  
  /**
   * 控制指针最宽处，默认8
   */
  private int width;
  
  /**
   * 控制指针颜色 
   */
  private String color;

  public Pointer(){
    this.length = "80%";
    this.width = 8;
    this.color = "auto";
  }
  
}
