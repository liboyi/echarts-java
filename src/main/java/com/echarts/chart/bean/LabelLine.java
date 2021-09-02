package com.echarts.chart.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author liboyi
 * @title  LabelLine
 * @description 标签视觉引导线
 * @date 2015-5-26
 */
@Data
@Builder
@AllArgsConstructor
public class LabelLine {
	public LabelLine() {
		this.show = true;
	}

	public LabelLine(boolean show) {
		this.show = show;
	}

	/**
	 * 标签视觉引导线，默认显示 ,适用对象 饼图，漏斗图
	 */
	private boolean show;
    private Integer length;

    private LineStyle lineStyle;

}
