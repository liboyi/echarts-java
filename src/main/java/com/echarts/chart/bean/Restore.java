package com.echarts.chart.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author liboyi
 * @title  Restore
 * @description 启用功能还原设置
 * @date 2015-5-27
 */
@Data
@AllArgsConstructor
public class Restore {
   private boolean show;

   public Restore(){
      this.show = false;
   }
}
