package com.echarts.chart.bean;

import lombok.Data;

/**
 *
 * @author liboyi
 * @title  LineStyle
 * @description 设置直线指示器
 * @date 2015-5-26
 */
@Data
public class LineStyle {
	private String color[][];    //颜色
	private Integer width;
	private String type;
	public LineStyle() {

	}

	public LineStyle(Integer width,String type){
		this.width = width;
		this.type = type;
	}
}
