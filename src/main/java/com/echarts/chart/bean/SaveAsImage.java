package com.echarts.chart.bean;

import lombok.Data;


/**
 *
 * @author liboyi
 * @title  SaveAsImage
 * @description 保存为图片设置
 * @date 2015-5-27
 */
@Data
public class SaveAsImage {
    private boolean show;

    public SaveAsImage() {
        this.show = false;
    }

    public SaveAsImage(boolean show) {
        this.show = show;
    }
   
}
