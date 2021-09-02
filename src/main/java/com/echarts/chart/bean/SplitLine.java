package com.echarts.chart.bean;

import lombok.Data;

/**
 *
 * @author liboyi
 * @title  SubtextStyle
 * @description 主分隔线
 * @date 2015-5-26
 */
@Data
public class SplitLine {
  private boolean show; //控制显示与否
  private int length;  //控制线长
  private LineStyle lineStyle; //控制线条样式

  public SplitLine(){
    this.show = true;
    this.length = 30;
    this.lineStyle = new LineStyle();
  }

}
