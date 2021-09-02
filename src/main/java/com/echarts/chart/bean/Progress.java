package com.echarts.chart.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author liboyi
 * @title  Progress
 * @description 进度条
 * @date 2021 -8-15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Progress {

    /**
     * 是否显示进度条
     */
    private boolean show;

    /**
     * 进度条宽度
     */
    private Integer width;

    public Progress(boolean show){
        this.show = show;
    }

}
