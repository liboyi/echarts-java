package com.echarts.chart.option;

import java.util.List;

import com.echarts.chart.bean.ChartsTitleBean;
import com.echarts.chart.bean.ChartsToolBoxBean;
import com.echarts.chart.bean.ToolTipBean;
import com.echarts.chart.bean.LegendBean;
import com.echarts.chart.bean.series.ChartsFunnelSeriesBean;
import lombok.Data;

/**
 * @author liboyi
 * @title: FunnelOptionBean
 * @description 漏斗图参数
 * @date 2015-6-4
 */
@Data
public class FunnelOptionBean {

	//标题
	private ChartsTitleBean title;
	//工具提示
	private ToolTipBean tooltip;
	//图例
	private LegendBean legend;
	//工具箱
	private ChartsToolBoxBean toolbox;

	//数据
    private List<ChartsFunnelSeriesBean> series;

}
