package com.echarts.chart.bean;


import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author liboyi
 * @title  AxisLine
 * @description 坐标轴线
 * @date 2015-5-26
 */
@Data
@AllArgsConstructor
public class AxisLine {
	private boolean show;

	private LineStyle lineStyle;

	public AxisLine() {
		this.show = true;
		this.lineStyle = new LineStyle();
	}
	public AxisLine(boolean show) {
		this.show = show;
	}


}
