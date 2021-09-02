package com.echarts.chart.bean.series;

import com.echarts.chart.bean.*;
import com.exception.chart.bean.*;
import lombok.Data;

import java.util.List;

/**
 *
 * @author liboyi
 * @title  ChartsFunnelSeriesBean
 * @description 漏斗图 series
 * @date 2015-6-4
 */
@Data
public class ChartsFunnelSeriesBean extends ChartsSeriesBean {
	public ChartsFunnelSeriesBean(){
		this.width = "80%";
		this.sort= "descending";
		this.label = Label.builder().show(true).position("inside").build();
		this.labelLine = LabelLine.builder().length(10).lineStyle(new LineStyle(1,"solid")).build();
		this.itemStyle = ItemStyle.builder().borderColor("#fff").borderWidth(1).build();
		Label label = Label.builder().fontSize(20).show(true).build();
		this.emphasis = Emphasis.builder().label(label).build();
	}

    private String width;

    private List<ChartDataBean> data;

	/**
	 * 排序descending 、asccending
	 * 默认descending
	 */
    private String sort;

	/**
	 * 缺口大小
	 */
	private Integer gap;

	/**
	 * 悬浮样式
	 */
	private Emphasis emphasis;

	private ItemStyle itemStyle;

	private LabelLine labelLine;

	private Label label;

}
