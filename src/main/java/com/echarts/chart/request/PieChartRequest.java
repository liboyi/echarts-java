package com.echarts.chart.request;

import com.echarts.chart.bean.ChartDataBean;
import lombok.Data;

import java.util.List;

/**
 * @author liboyi
 * @Title PieChartRequest
 * @description 饼图参数
 * @date  2021/8/21 23:09
 */
@Data
public class PieChartRequest extends ChartBaseRequest{

    private List<String> radius;

    private List<ChartDataBean> data;

    private Boolean sellectMode;

    private Integer borderRadius;

    private String borderColor;

    private Integer borderWidth;

    /**
     * 图形类型，pie、ring、rose，默认pie
     */
    private String type;

    public PieChartRequest(){
        this.type = "pie";
    }
}
