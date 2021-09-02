package com.echarts.chart.request;

import com.echarts.chart.bean.ChartDataBean;
import lombok.Data;

import java.util.List;

/**
 * @author liboyi
 * @title  FunnelChartRequest
 * @description 漏斗图参数
 * @date 2021/8/22 16:04
 */
@Data
public class FunnelChartRequest extends ChartBaseRequest{
    private List<ChartDataBean> data;
    private Integer gap;
    private String width;

    /**
     * 排序类型，descending|ascending
     */
    private String sort;
}
