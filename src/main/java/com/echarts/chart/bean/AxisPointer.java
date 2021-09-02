package com.echarts.chart.bean;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author liboyi
 * @title  AxisPointer
 * @description 坐标轴指示器
 * @date 2015-5-26
 */
@Data
@AllArgsConstructor
@Builder
public class AxisPointer {

	public AxisPointer() {
		this.type = "line";
	}

	public AxisPointer(String type){
		this.type = type;
	}
	private String type;

	private Label label;

}
