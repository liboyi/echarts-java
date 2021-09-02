package com.echarts.chart.bean;


import lombok.Data;

/**
 *
 * @author liboyi
 * @title  AxisLine
 * @description 坐标轴文本标签选项
 * @date 2015-5-7
 */
@Data
public class AxisLabel {


	 public AxisLabel(){
		 this.show = true;
		 this.textStyle = new TextStyle("#333");
	 }
	 public AxisLabel(String formatter) {
	     this.formatter=formatter;
	 }


	private Boolean show;
	/**
	 * 标签旋转角度，默认为0，不旋转，正值为逆时针，负值为顺时针，可选为：-90 ~ 90 
	 */
    private Integer rotate;
    /**
     *标签显示挑选间隔，默认为'auto'，可选为：
     *'auto'（自动隐藏显示不下的） | 0（全部显示） |
     *{number}（用户指定选择间隔）
     *{function}函数回调，传递参数[index，data[index]]，返回true显示，返回false隐藏 
     */
    private String interval;
    
    
    /**
     * 文本样式（详见textStyle），其中当坐标轴为数值型和时间型时，color接受方法回调，实现个性化的颜色定义
     */
    private TextStyle textStyle;
    
    /**
     *  间隔名称格式器：{string}（Template） | {Function} 
     */
    private String formatter;
    
    /**
     *  坐标轴文本标签与坐标轴的间距，默认为8，单位px 
     */
    private Integer margin;
    
    /**
     * 坐标轴文本标签是否可点击，是否可点击
     */
    private Boolean clickable;

}
