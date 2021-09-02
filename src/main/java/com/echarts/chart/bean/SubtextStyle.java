package com.echarts.chart.bean;

import lombok.Data;

/**
 *
 * @author liboyi
 * @title  SubtextStyle
 * @description 字体样式
 * @date 2015-5-26
 */
@Data
public class SubtextStyle {
	
	/**
	 * 字号 ，单位px,默认12
	 */
    private int fontSize;
    
    /**
     * 粗细，可选为：'normal' | 'bold' | 'bolder' | 'lighter' | 100 | 200 |... | 900 
     * 默认normal
     */
    private String fontWeight;
    
    /**
     * 颜色 ,默认各异
     */
    private String color;
    
    /**
     * 修饰，仅对tooltip.textStyle生效 ，默认none
     */
    private String decoration;
    
    /**
     * 水平对齐方式，可选为：'left' | 'right' | 'center' 
     * 默认各异
     */
    private String align;
    
    /**
     * 垂直对齐方式，可选为：'top' | 'bottom' | 'middle' 
     * 默认值各异
     */
    private String baseline;
    
    /**
     * 字体系列  'Arial, Verdana, sans-serif'
     */
    private String fontFamily;
    
    /**
     * 样式，可选为：'normal' | 'italic' | 'oblique' 
     * 默认normal
     */
    private String fontStyle;

    public SubtextStyle(){
        this.fontSize = 12;
        this.fontWeight = "normal";
        this.decoration = "none";
        this.fontStyle = "normal";
    }

}
