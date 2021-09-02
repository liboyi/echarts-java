package com.echarts.chart.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author liboyi
 * @title  Mark
 * @description 助线标志，分别是启用，删除上一条，删除全部，可设置更多属性 可传入lineStyle（详见lineStyle）控制线条样式
 * @date 2015-5-26
 */
@Data
@AllArgsConstructor
public class Mark {
    private boolean show;

    public Mark() {
        this.show = false;
    }

}
