package com.cnsuning.spring.start.entity;

import java.util.Date;

public class StatementOfAccount {
    private Long id;

    private String userNo;

    private String outOrderNo;

    private String soaYwStatus;

    private String ywTradeType;

    private String ywTradeScene;

    private Date ywTime;

    private String ywReqId;

    private Date fmpmsUpdateTime;

    private String soaZwStatus;

    private String zwTradeType;

    private String zwTradeScene;

    private Date zwTrandate;

    private String zwSerialno;

    private Integer zwTotalvalue;

    private Date fmpmsExchangeTime;

    private Integer consumePointsNum;

    private Date dealTime;

    private Date loadTime;

    private String ywDealStatus;

    private String ywDealType;

    private Integer ywDealPointsNum;

    private String zwDealStatus;

    private String zwDealType;

    private Integer zwDealPointsNum;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo == null ? null : outOrderNo.trim();
    }

    public String getSoaYwStatus() {
        return soaYwStatus;
    }

    public void setSoaYwStatus(String soaYwStatus) {
        this.soaYwStatus = soaYwStatus == null ? null : soaYwStatus.trim();
    }

    public String getYwTradeType() {
        return ywTradeType;
    }

    public void setYwTradeType(String ywTradeType) {
        this.ywTradeType = ywTradeType == null ? null : ywTradeType.trim();
    }

    public String getYwTradeScene() {
        return ywTradeScene;
    }

    public void setYwTradeScene(String ywTradeScene) {
        this.ywTradeScene = ywTradeScene == null ? null : ywTradeScene.trim();
    }

    public Date getYwTime() {
        return ywTime;
    }

    public void setYwTime(Date ywTime) {
        this.ywTime = ywTime;
    }

    public String getYwReqId() {
        return ywReqId;
    }

    public void setYwReqId(String ywReqId) {
        this.ywReqId = ywReqId == null ? null : ywReqId.trim();
    }

    public Date getFmpmsUpdateTime() {
        return fmpmsUpdateTime;
    }

    public void setFmpmsUpdateTime(Date fmpmsUpdateTime) {
        this.fmpmsUpdateTime = fmpmsUpdateTime;
    }

    public String getSoaZwStatus() {
        return soaZwStatus;
    }

    public void setSoaZwStatus(String soaZwStatus) {
        this.soaZwStatus = soaZwStatus == null ? null : soaZwStatus.trim();
    }

    public String getZwTradeType() {
        return zwTradeType;
    }

    public void setZwTradeType(String zwTradeType) {
        this.zwTradeType = zwTradeType == null ? null : zwTradeType.trim();
    }

    public String getZwTradeScene() {
        return zwTradeScene;
    }

    public void setZwTradeScene(String zwTradeScene) {
        this.zwTradeScene = zwTradeScene == null ? null : zwTradeScene.trim();
    }

    public Date getZwTrandate() {
        return zwTrandate;
    }

    public void setZwTrandate(Date zwTrandate) {
        this.zwTrandate = zwTrandate;
    }

    public String getZwSerialno() {
        return zwSerialno;
    }

    public void setZwSerialno(String zwSerialno) {
        this.zwSerialno = zwSerialno == null ? null : zwSerialno.trim();
    }

    public Integer getZwTotalvalue() {
        return zwTotalvalue;
    }

    public void setZwTotalvalue(Integer zwTotalvalue) {
        this.zwTotalvalue = zwTotalvalue;
    }

    public Date getFmpmsExchangeTime() {
        return fmpmsExchangeTime;
    }

    public void setFmpmsExchangeTime(Date fmpmsExchangeTime) {
        this.fmpmsExchangeTime = fmpmsExchangeTime;
    }

    public Integer getConsumePointsNum() {
        return consumePointsNum;
    }

    public void setConsumePointsNum(Integer consumePointsNum) {
        this.consumePointsNum = consumePointsNum;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public Date getLoadTime() {
        return loadTime;
    }

    public void setLoadTime(Date loadTime) {
        this.loadTime = loadTime;
    }

    public String getYwDealStatus() {
        return ywDealStatus;
    }

    public void setYwDealStatus(String ywDealStatus) {
        this.ywDealStatus = ywDealStatus == null ? null : ywDealStatus.trim();
    }

    public String getYwDealType() {
        return ywDealType;
    }

    public void setYwDealType(String ywDealType) {
        this.ywDealType = ywDealType == null ? null : ywDealType.trim();
    }

    public Integer getYwDealPointsNum() {
        return ywDealPointsNum;
    }

    public void setYwDealPointsNum(Integer ywDealPointsNum) {
        this.ywDealPointsNum = ywDealPointsNum;
    }

    public String getZwDealStatus() {
        return zwDealStatus;
    }

    public void setZwDealStatus(String zwDealStatus) {
        this.zwDealStatus = zwDealStatus == null ? null : zwDealStatus.trim();
    }

    public String getZwDealType() {
        return zwDealType;
    }

    public void setZwDealType(String zwDealType) {
        this.zwDealType = zwDealType == null ? null : zwDealType.trim();
    }

    public Integer getZwDealPointsNum() {
        return zwDealPointsNum;
    }

    public void setZwDealPointsNum(Integer zwDealPointsNum) {
        this.zwDealPointsNum = zwDealPointsNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

	@Override
	public String toString() {
		return "StatementOfAccount [id=" + id + ", userNo=" + userNo + ", outOrderNo=" + outOrderNo + ", soaYwStatus="
				+ soaYwStatus + ", ywTradeType=" + ywTradeType + ", ywTradeScene=" + ywTradeScene + ", ywTime=" + ywTime
				+ ", ywReqId=" + ywReqId + ", fmpmsUpdateTime=" + fmpmsUpdateTime + ", soaZwStatus=" + soaZwStatus
				+ ", zwTradeType=" + zwTradeType + ", zwTradeScene=" + zwTradeScene + ", zwTrandate=" + zwTrandate
				+ ", zwSerialno=" + zwSerialno + ", zwTotalvalue=" + zwTotalvalue + ", fmpmsExchangeTime="
				+ fmpmsExchangeTime + ", consumePointsNum=" + consumePointsNum + ", dealTime=" + dealTime
				+ ", loadTime=" + loadTime + ", ywDealStatus=" + ywDealStatus + ", ywDealType=" + ywDealType
				+ ", ywDealPointsNum=" + ywDealPointsNum + ", zwDealStatus=" + zwDealStatus + ", zwDealType="
				+ zwDealType + ", zwDealPointsNum=" + zwDealPointsNum + ", remark=" + remark + "]";
	}
    
}