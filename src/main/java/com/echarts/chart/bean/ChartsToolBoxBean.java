package com.echarts.chart.bean;

import lombok.Data;

/**
 * @author liboyi
 * @title  ChartsToolBoxBean
 * @description  工具箱，每个图表最多仅有一个工具箱
 * @date 2015-5-26
 */
@Data
public class ChartsToolBoxBean {
	public ChartsToolBoxBean(){
		this.show = true;
		this.feature = new Feature();
		this.x = "right";
		this.y = "top";
		this.showTitle=true;
	}

	public ChartsToolBoxBean(boolean show) {
		this.show = show;
	}

	public ChartsToolBoxBean(boolean show, Feature feature) {
		this.show = show;
		this.feature = feature;
	}


	/**
	 * 显示策略，可选为：true（显示） | false（隐藏） ，默认false
	 */
	private boolean show;
	/**
	 * 否显示工具箱文字提示，默认启用
	 */
	private Boolean showTitle;
	private String x;
	private String y;
	private Feature feature;
	private TextStyle textStyle;
}
