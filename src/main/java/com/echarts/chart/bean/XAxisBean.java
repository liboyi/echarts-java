package com.echarts.chart.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;


/**
 *
 * @author liboyi
 * @title  XAxisBean
 * @description X轴
 * @date 2015-5-7
 */
@Data
@Builder
@AllArgsConstructor
public class XAxisBean {
	public XAxisBean() {
		this.type = "category";
	}

	/**
	 * 坐标轴有三种类型，类目型、数值型和时间型 类目型：需要指定类目列表，坐标轴内有且仅有这些指定类目坐标
	 * 数值型：需要指定数值区间，不指定时则自定计算数值范围，坐标轴内包含数值区间内容全部坐标
	 * 时间型：时间型坐标轴用法同数值型，只是目标处理和格式化显示时会自动转变为时间，并且随着时间跨度的不同自动切换需要显示的时间粒度
	 * 默认为类目型'category'
	 */
	private String type;
	/**
	 * 类目列表，同时也是label内容
	 */
	private List<String> data;
	/**
	 * 坐标轴文本标签
	 */
	private AxisLabel axisLabel;
	private String name;

	/**
	 * 类目起始和结束两端空白策略，默认为true留空，false则顶头
	 */
	private Boolean boundaryGap;

}
