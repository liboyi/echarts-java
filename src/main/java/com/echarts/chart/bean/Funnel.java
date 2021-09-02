package com.echarts.chart.bean;

import lombok.Data;


/**
 * @author liboyi
 * @title  Funnel
 * @description 漏斗图设置
 * @date 2015-5-29
 */
@Data
public class Funnel {
  public Funnel(){
	  this.x = "25%";
	  this.width = "50%";
	  this.funnelAlign = "center";
  }

	public Funnel(String x, String width, String funnelAlign) {
		this.x = x;
		this.width = width;
		this.funnelAlign = funnelAlign;
	}

	private String x;
	private String width;
	private String funnelAlign;

}
