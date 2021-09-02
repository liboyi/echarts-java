package com.echarts.chart.bean;

import lombok.Builder;
import lombok.Data;


/**
 *
 * @author liboyi
 * @title  TextStyle
 * @description 字体样式
 * @date 2015-5-26
 */
@Data
@Builder
public class TextStyle {
	
	/**
	 * 字号 ，单位px,默认12
	 */
    private Integer fontSize;
    
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
     * 样式，可选为：'normal' | 'italic' | 'oblique' 
     * 默认normal
     */
    private String fontStyle;
    
    public TextStyle(){
//    	this.fontSize = 12;
//    	this.fontWeight = "normal";
//    	this.color = "black";
//    	this.decoration = "none";
//    	this.fontStyle = "normal";
    }

	public TextStyle(String color){
		this.color = color;
	}

	public TextStyle(int fontSize, String fontWeight, String color,
			String decoration, String align, String baseline,
			String fontStyle) {
		this.fontSize = fontSize;
		this.fontWeight = fontWeight;
		this.color = color;
		this.decoration = decoration;
		this.align = align;
		this.baseline = baseline;
		this.fontStyle = fontStyle;
	}
	
	public TextStyle(int fontSize, String fontWeight, String color) {
		this.fontSize = fontSize;
		this.fontWeight = fontWeight;
		this.color = color;
	}
	
	public TextStyle(int fontSize,  String color) {
		this.fontSize = fontSize;
		this.color = color;
	}

}
