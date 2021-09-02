package com.echarts.chart.bean.series;

import com.echarts.chart.bean.Progress;
import com.echarts.chart.bean.ChartDataBean;
import com.echarts.chart.bean.GaugeDetail;
import lombok.Data;

import java.util.List;


/**
 *
 * @author liboyi
 * @title  ChartsGaugeSeriesBean
 * @description 仪表盘 series
 * @date 2015-5-26
 */
@Data
public class ChartsGaugeSeriesBean extends ChartsSeriesBean {
   /**
    * 仪表盘详情 
    */
   private GaugeDetail detail;

   private List<ChartDataBean> data; //数据

   private Progress progress;

   public ChartsGaugeSeriesBean(){
      this.detail = new GaugeDetail();
      this.setType("gauge");
      this.setName("Pressure");
   }

}
