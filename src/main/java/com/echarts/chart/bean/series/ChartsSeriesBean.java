package com.echarts.chart.bean.series;


import lombok.Data;

/**
 *  驱动图表生成的数据内容数组，数组中每一项为一个系列的选项及数据，其中个别选项仅在部分图表类型中有效，请注意适用类型
 * @author liboyi
 * @title  ChartsSeriesBean
 * @description 图形数据基本属性（通用）
 *
 * @date 2015-5-29
 */
@Data
public class ChartsSeriesBean {
  
  /**
   * 图表类型，必要参数！如为空或不支持类型，则该系列数据不被显示。可选为：'line'（折线图） | 'bar'（柱状图） | 'scatter'（散点图） | 'k'（K线图）
   * 'pie'（饼图） | 'radar'（雷达图） | 'chord'（和弦图） | 'force'（力导向布局图） | 'map'（地图） 
   *  默认null
   */
  private String type;
  
  /**
   * 列名称，如启用legend，该值将被legend.data索引相关 
   * 默认null
   */
  private String name;

}
