package com.echarts.chart.bean;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author liboyi
 * @title  Feature
 * @description 启用功能
 * @date 2015-5-26
 */
@Data
@Builder
@AllArgsConstructor
public class Feature {
	 private Mark mark;
	 private DataView dataView;
	 private MagicType magicType;
	 private Restore restore;
	 private SaveAsImage saveAsImage;
	 
	 public Feature(){
		 this.mark = new Mark(); //辅助线标志
		 this.dataView = new DataView(); //数据视图
		 this.magicType = new MagicType(); //动态类型切换
		 this.restore = new Restore();     //还原
		 this.saveAsImage = new SaveAsImage(); //保存图片（IE8-不支持）
	 }


}
