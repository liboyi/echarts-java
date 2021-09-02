package com.echarts.chart.option;

import java.util.List;

import com.echarts.chart.bean.ToolTipBean;
import com.echarts.chart.bean.series.ChartsGaugeSeriesBean;
import lombok.Data;

/**
 * @author liboyi
 * @title: GaugeOptionBean
 * @description 仪表盘参数
 * @date 2015-5-27
 */
@Data
public class GaugeOptionBean {

    private ToolTipBean tooltip;
    private List<ChartsGaugeSeriesBean> series;

    public GaugeOptionBean() {
        this.tooltip = new ToolTipBean();
    }

}
