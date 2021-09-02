package com.echarts.chart.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author liboyi
 * @title  ShadowStyle
 * @description 设置阴影指示器
 * @date 2015-5-27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShadowStyle {
	private String color;
	private String width;
	private String type;

}
