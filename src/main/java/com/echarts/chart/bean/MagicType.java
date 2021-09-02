package com.echarts.chart.bean;

import lombok.Data;

import java.util.List;

/**
 *
 * @author liboyi
 * @title  MagicType
 * @description 动态类型切换
 * @date 2015-5-26
 */
@Data
public class MagicType {
	private boolean show;
	private List<String> type;
	private Funnel option;

	public MagicType() {
		this.show = false;
		this.option = new Funnel();
	}

	public MagicType(boolean show){
		this.show = show;
	}
	public MagicType(boolean show, List<String> type) {
		this.show = show;
		this.type = type;
	}


}
