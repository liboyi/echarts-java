package com.echarts.chart.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


/**
 * @author liboyi
 * @title  ChartsTitleBean
 * @description  标题，每个图表最多仅有一个标题控件，每个标题控件可设主副标题。
 * @date 2015-5-25
 */
@Data
@Builder
@AllArgsConstructor
public class ChartsTitleBean {
	public ChartsTitleBean(){

	}
	private String text;
	private String subtext;
	private String x;
	private String y;
	private TextStyle textStyle;
}
