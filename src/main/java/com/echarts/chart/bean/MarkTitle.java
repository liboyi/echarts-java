package com.echarts.chart.bean;

import lombok.Data;

/**
 *
 * @author liboyi
 * @title  MarkTitle
 * @description 启用功能辅助线设置
 * @date 2015-5-26
 */
@Data
public class MarkTitle {
   private boolean mark;
   private boolean markUndo;
   private boolean markClear;

   public MarkTitle(){
      this.mark = true;  //辅助线开关，默认true
      this.markUndo = true;//删除辅助线，默认true
      this.markClear = true; //清空辅助线，默认true
   }
}
