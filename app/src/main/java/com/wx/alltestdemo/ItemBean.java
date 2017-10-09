package com.wx.alltestdemo;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wx on 2017/10/9.
 */

public class ItemBean {
    @Override
    public String toString() {
        return "ItemBean{" +
                "rid=" + rid +
                ", rtype=" + rtype +
                ", rname='" + rname + '\'' +
                ", pic='" + pic + '\'' +
                ", weburl='" + weburl + '\'' +
                ", des='" + des + '\'' +
                ", albumName='" + albumName + '\'' +
                ", albumId=" + albumId +
                ", num=" + num +
                ", mp3PlayUrl='" + mp3PlayUrl + '\'' +
                ", cornerMark=" + cornerMark +
                ", rvalue='" + rvalue + '\'' +
                ", tip='" + tip + '\'' +
                ", followedNum=" + followedNum +
                ", listenNum=" + listenNum +
                ", area=" + area +
                ", adType=" + adType +
                ", adUserId='" + adUserId + '\'' +
                ", adId='" + adId + '\'' +
                ", dataReport='" + dataReport + '\'' +
                ", isSubscribe=" + isSubscribe +
                ", callback=" + callback +
                ", host=" + host +
                ", reportUrl=" + reportUrl +
                ", expoUrl=" + expoUrl +
                ", dataList=" + dataList +
                '}';
    }

    /**
     * rid : 2091640
     * rtype : 13
     * rname : 仨贱客
     * pic : http://img.kaolafm.net/mz/images/201704/64dca3a5-b934-4cd2-95eb-f5fd3cac3735/default.jpg
     * weburl :
     * des : 仨贱客
     * albumName :
     * albumId : -1
     * num : 0
     * host : []
     * mp3PlayUrl :
     * cornerMark : 0
     * rvalue : 2091640
     * tip :
     * followedNum : 0
     * listenNum : 0
     * area : null
     * reportUrl : []
     * expoUrl : []
     * adType : -1
     * adUserId :
     * adId :
     * dataReport : 仨贱客
     * dataList : []
     * isSubscribe : 0
     * callback : null
     */

    private Long rid;
    private int rtype;
    private String rname;
    private String pic;
    private String weburl;
    private String des;
    private String albumName;
    private int albumId;
    private int num;
    private String mp3PlayUrl;
    private int cornerMark;
    private String rvalue;
    private String tip;
    private int followedNum;
    private int listenNum;
    private Object area;
    private int adType;
    private String adUserId;
    private String adId;
    private String dataReport;
    private int isSubscribe;
    private Object callback;
    private List<?> host;
    private List<?> reportUrl;
    private List<?> expoUrl;
    private List<?> dataList;

    public static ItemBean objectFromData(String str) {

        return new com.google.gson.Gson().fromJson(str, ItemBean.class);
    }

    public static ItemBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new com.google.gson.Gson().fromJson(jsonObject.getString(key), ItemBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<ItemBean> arrayItemBeanFromData(String str) {

        Type listType = new com.google.gson.reflect.TypeToken<ArrayList<ItemBean>>() {
        }.getType();

        return new com.google.gson.Gson().fromJson(str, listType);
    }

    public static List<ItemBean> arrayItemBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new com.google.gson.reflect.TypeToken<ArrayList<ItemBean>>() {
            }.getType();

            return new com.google.gson.Gson().fromJson(jsonObject.getString(key), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public int getRtype() {
        return rtype;
    }

    public void setRtype(int rtype) {
        this.rtype = rtype;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getWeburl() {
        return weburl;
    }

    public void setWeburl(String weburl) {
        this.weburl = weburl;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getMp3PlayUrl() {
        return mp3PlayUrl;
    }

    public void setMp3PlayUrl(String mp3PlayUrl) {
        this.mp3PlayUrl = mp3PlayUrl;
    }

    public int getCornerMark() {
        return cornerMark;
    }

    public void setCornerMark(int cornerMark) {
        this.cornerMark = cornerMark;
    }

    public String getRvalue() {
        return rvalue;
    }

    public void setRvalue(String rvalue) {
        this.rvalue = rvalue;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getFollowedNum() {
        return followedNum;
    }

    public void setFollowedNum(int followedNum) {
        this.followedNum = followedNum;
    }

    public int getListenNum() {
        return listenNum;
    }

    public void setListenNum(int listenNum) {
        this.listenNum = listenNum;
    }

    public Object getArea() {
        return area;
    }

    public void setArea(Object area) {
        this.area = area;
    }

    public int getAdType() {
        return adType;
    }

    public void setAdType(int adType) {
        this.adType = adType;
    }

    public String getAdUserId() {
        return adUserId;
    }

    public void setAdUserId(String adUserId) {
        this.adUserId = adUserId;
    }

    public String getAdId() {
        return adId;
    }

    public void setAdId(String adId) {
        this.adId = adId;
    }

    public String getDataReport() {
        return dataReport;
    }

    public void setDataReport(String dataReport) {
        this.dataReport = dataReport;
    }

    public int getIsSubscribe() {
        return isSubscribe;
    }

    public void setIsSubscribe(int isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    public Object getCallback() {
        return callback;
    }

    public void setCallback(Object callback) {
        this.callback = callback;
    }

    public List<?> getHost() {
        return host;
    }

    public void setHost(List<?> host) {
        this.host = host;
    }

    public List<?> getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(List<?> reportUrl) {
        this.reportUrl = reportUrl;
    }

    public List<?> getExpoUrl() {
        return expoUrl;
    }

    public void setExpoUrl(List<?> expoUrl) {
        this.expoUrl = expoUrl;
    }

    public List<?> getDataList() {
        return dataList;
    }

    public void setDataList(List<?> dataList) {
        this.dataList = dataList;
    }
}
