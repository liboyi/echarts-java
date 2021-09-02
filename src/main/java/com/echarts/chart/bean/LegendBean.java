package com.echarts.chart.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author liboyi
 * @title  LegendBean
 * @description 图例，每个图表最多仅有一个图例
 * @date 2015-5-7
 */
@Data
@Builder
@AllArgsConstructor
public class LegendBean {
	public LegendBean() {

	}
	private String top; //水平安放位置，默认为全图居中，可选为：'center' | 'left' | 'right' | {number}（x坐标，单位px）
	private String left; //垂直安放位置，默认为全图顶端，可选为：'top' | 'bottom' | 'center' | {number}（y坐标，单位px）
	private String orient; //布局方式，默认为水平布局，可选为：'horizontal' | 'vertical'
	private Boolean selectedMode;   //图例开关，默认true

	private List<String> data;


}
