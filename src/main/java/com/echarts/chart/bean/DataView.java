package com.echarts.chart.bean;

import lombok.Data;

/**
 * @author liboyi
 * @title  DataView
 * @description  数据视图设置
 * @date 2015-5-26
 */
@Data
public class DataView {
	private boolean show;
	private boolean readOnly;

	public DataView() {
		this.show = false;
		this.readOnly = false; // 默认数据视图为只读，可指定readOnly为false打开编辑功能
	}

	public DataView(boolean show) {
		this.show = show;
	}

}
