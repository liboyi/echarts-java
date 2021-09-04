package com.echarts.chart.factory;

import com.echarts.chart.bean.*;

import java.util.List;

/**
 * @author liboyi
 * @title: BaseFactory
 * @description: 图形工厂基类
 * @date 2021/8/25 0:36
 */
public class BaseFactory {

    /**
     * 通用构建title
     * @param title    title
     * @param subTitle subTitle
     * @param left     left
     * @param top      top
     * @param fontSize fontSize
     * @return
     */
    public static ChartsTitleBean buildTitle(String title, String subTitle, String left, String top, Integer fontSize){
        ChartsTitleBean  titleBean = ChartsTitleBean.builder().text(title).
                subtext(subTitle).x(left).y(top).build();
        if(fontSize != null){
            titleBean.setTextStyle(TextStyle.builder().fontSize(fontSize).build());
        }
        return titleBean;
    }

    /**
     * 构建XAis
     * @param xAxisName xAxisName
     * @param xData     xData
     * @return XAxisBean
     */
    public static XAxisBean buildXAis(String xAxisName, List<String> xData){
        return XAxisBean.builder().name(xAxisName).data(xData).build();
    }

    /**
     *  构建YAxisBean
     * @param xAxisName xAxisName
     * @param xData     xData
     * @return XAxisBean
     */
    public static YAxisBean buildYAis(String yAxisName){
        return YAxisBean.builder().name(yAxisName).build();
    }

    /**
     *  构建 Feature
     * @param markShow          markShow
     * @param dataViewShow      dataViewShow
     * @param magicTypeShow     magicTypeShow
     * @param restoreShow       restoreShow
     * @param saveAsImageShow   saveAsImageShow
     * @param magicTypeList     magicTypeList
     * @return
     */
    public static Feature getFeature(boolean markShow, boolean dataViewShow, boolean magicTypeShow, boolean restoreShow,
                                     boolean saveAsImageShow, List<String> magicTypeList) {
        Mark mark = new Mark(markShow);
        DataView dataView = new DataView(dataViewShow);
        MagicType magicType = new MagicType(magicTypeShow,magicTypeList);
        Restore restore = new  Restore(restoreShow);
        SaveAsImage saveAsImage = new SaveAsImage(saveAsImageShow);
        return Feature.builder().mark(mark).dataView(dataView).magicType(magicType).restore(restore).
                saveAsImage(saveAsImage).build();
    }
}
