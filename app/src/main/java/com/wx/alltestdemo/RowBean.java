package com.wx.alltestdemo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wx on 2017/10/9.
 */

public class RowBean {

    /**
     * id : 254
     * name : 轮播图
     * icon :
     * desc :
     * hasmore : 1
     * moreType : 3
     * componentType : 1
     * contentType : 1
     * relatedValue : -1
     * pic :
     * contentSourceId : 6
     * count : 0
     * dataList : []
     */

    private int id;
    private String name;
    private String icon;
    private String desc;
    private int hasmore;
    private int moreType;
    private int componentType;
    private int contentType;
    private String relatedValue;
    private String pic;
    private int contentSourceId;
    private int count;
    private List<ItemBean> dataList;

    public static RowBean objectFromData(String str) {

        return new Gson().fromJson(str, RowBean.class);
    }

    public static RowBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(key), RowBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<RowBean> arrayRowBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<RowBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<RowBean> arrayRowBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<RowBean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(key), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getHasmore() {
        return hasmore;
    }

    public void setHasmore(int hasmore) {
        this.hasmore = hasmore;
    }

    public int getMoreType() {
        return moreType;
    }

    public void setMoreType(int moreType) {
        this.moreType = moreType;
    }

    public int getComponentType() {
        return componentType;
    }

    public void setComponentType(int componentType) {
        this.componentType = componentType;
    }

    public int getContentType() {
        return contentType;
    }

    public void setContentType(int contentType) {
        this.contentType = contentType;
    }

    public String getRelatedValue() {
        return relatedValue;
    }

    public void setRelatedValue(String relatedValue) {
        this.relatedValue = relatedValue;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public int getContentSourceId() {
        return contentSourceId;
    }

    public void setContentSourceId(int contentSourceId) {
        this.contentSourceId = contentSourceId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<ItemBean> getDataList() {
        return dataList;
    }

    public void setDataList(List<ItemBean> dataList) {
        this.dataList = dataList;
    }

    @Override
    public String toString() {
        return "RowBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", desc='" + desc + '\'' +
                ", hasmore=" + hasmore +
                ", moreType=" + moreType +
                ", componentType=" + componentType +
                ", contentType=" + contentType +
                ", relatedValue='" + relatedValue + '\'' +
                ", pic='" + pic + '\'' +
                ", contentSourceId=" + contentSourceId +
                ", count=" + count +
                ", dataList=" + dataList +
                '}';
    }
}
