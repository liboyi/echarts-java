package com.echarts.chart.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


/**
 *
 * @author liboyi
 * @title  ToolTipBean
 * @description 图形提示框，鼠标悬浮交互时的信息提示
 * @date 2015-5-26
 */
@Data
@Builder
@AllArgsConstructor
public class ToolTipBean {
	public ToolTipBean(){
		this.trigger = "axis";
	}

	/**
	 * 数据触发方式
	 */
	private String trigger;
	
	/**
	 * 格式化
	 */
	private String formatter;
	
    /**
     * 坐标轴指示器，坐标轴(axis)触发有效  默认为直线，可选为：'line' | 'shadow'
     */
	 private AxisPointer axisPointer;

}
