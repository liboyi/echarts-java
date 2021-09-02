package com.echarts.chart.bean;

import lombok.Data;

/**
 *
 * @author liboyi
 * @title  AreaStyle
 * @description 区域填充样式
 * @date 2015-5-26
 */
@Data
public class AreaStyle {

	public AreaStyle() {
		this.type = "default";
	}

	public AreaStyle(String type) {
		this.type = type;
	}

	/**
	 * 填充样式，目前仅支持'default'(实填充)
	 * 默认default
	 */
	private String type;

}
