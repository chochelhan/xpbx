package com.xpbx.xpbx.domain;

import java.sql.Timestamp;

public class BasicOutbound {

    private int id;
    private String outboundId;
    private String outboundContext;
    private String accessCode;
    private String outboundDialplan;
    private String trunkType;
    private int trunkSrl;
    private String trunkId;
    private String trunkPrefix;
    private String outboundDescription;
    private Timestamp insertDate;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getOutboundId() {
        return outboundId;
    }
    public void setOutboundId(String outboundId) {

        this.outboundId = getOutboundId();
    }
    public String getOutboundContext() {
        return outboundContext;
    }
    public void setOutboundContext(String outboundContext) {

        this.outboundContext = outboundContext;
    }
    public String getAccessCode() {
        return accessCode;
    }
    public void setAccessCode(String accessCode) {

        this.accessCode = accessCode;
    }
    public String getOutboundDialplan() {
        return outboundDialplan;
    }
    public void setOutboundDialplan(String outboundDialplan) {

        this.outboundDialplan = outboundDialplan;
    }
    public String getOutboundDescription() {
        return outboundDescription;
    }
    public void setOutboundDescription(String outboundDescription) {

        this.outboundDescription = outboundDescription;
    }

    public int getTrunkSrl() {
        return trunkSrl;
    }
    public void setTrunkSrl(int  trunkSrl) {

        this.trunkSrl = trunkSrl;
    }
    public String getTrunkId() {
        return trunkId;
    }
    public void setTrunkId(String trunkId) {
        this.trunkId = trunkId;
    }

    public String getTrunkPrefixt() {

        return trunkPrefix;
    }
    public void setTrunkPrefix(String trunkPrefix) {
        this.trunkPrefix = trunkPrefix;
    }
    public String getTrunkType() {

        return trunkType;
    }
    public void setTrunkType(String trunkType) {
        this.trunkType = trunkType;
    }
    public Timestamp getInsertDate() {

        return insertDate;
    }
    public void setInsertDate(Timestamp insertDate) {
        this.insertDate = insertDate;
    }
}
