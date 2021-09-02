package com.echarts.chart.bean;

import lombok.Data;

/**
 * @author liboyi
 * @title  CrossStyle
 * @description  设置十字准星指示器
 * @date 2015-5-26
 */
@Data
public class CrossStyle {
	private String color;    //颜色
	private int width;    //线宽
	private String type;  //线条样式，可选为：'solid' | 'dotted' | 'dashed' ，默认solid
	private String shadowColor; //折线主线(IE8+)有效，阴影色彩，支持rgba,默认rgba(0,0,0,0)
	private int shadowBlur;                   //折线主线(IE8+)有效，阴影模糊度，大于0有效 ，默认5
	private int shadowOffsetX;                //折线主线(IE8+)有效，阴影横向偏移，正值往右，负值往左 ，默认3
	private int shadowOffsetY;                //折线主线(IE8+)有效，阴影纵向偏移，正值往下，负值往上 ,默认3

	public CrossStyle() {
		this.type = "solid";
		this.shadowColor = "rgba(0,0,0,0)";
		this.shadowBlur = 5;
		this.shadowOffsetX = 3;
		shadowOffsetY = 3;
	}

	public CrossStyle(String color, int width, String type, String shadowColor,
					  int shadowBlur, int shadowOffsetX, int shadowOffsetY) {
		this.color = color;
		this.width = width;
		this.type = type;
		this.shadowColor = shadowColor;
		this.shadowBlur = shadowBlur;
		this.shadowOffsetX = shadowOffsetX;
		this.shadowOffsetY = shadowOffsetY;
	}

	public CrossStyle(String color, int width, String type) {
		this.color = color;
		this.width = width;
		this.type = type;
	}

}
