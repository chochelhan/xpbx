package com.xpbx.xpbx.domain;

import java.sql.Timestamp;

public class BasicTrunk {

    private int id;
    private String trunkId;
    private String trunkName;
    private String trunkPrefix;
    private String trunkIpaddress;
    private String trunkContext;
    private String trunkSecret;
    private String trunkType;
    private String trunkInsecure;
    private String trunkDescription;
    private Timestamp insertDate;

    public int getId() {

        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTrunkId() {

        return trunkId;
    }
    public void setTrunkId(String trunkId) {
        this.trunkId = trunkId;
    }
    public String getTrunkName() {

        return trunkName;
    }
    public void setTrunkName(String trunkName) {
        this.trunkName = trunkName;
    }
    public String getTrunkPrefixt() {

        return trunkPrefix;
    }
    public void setTrunkPrefix(String trunkPrefix) {
        this.trunkPrefix = trunkPrefix;
    }
    public String getTrunkIpaddress() {

        return trunkIpaddress;
    }
    public void setTrunkIpaddress(String trunkIpaddress) {
        this.trunkIpaddress = trunkIpaddress;
    }
    public String getTrunkContext() {

        return trunkContext;
    }
    public void setTrunkContext(String trunkContext) {
        this.trunkContext = trunkContext;
    }
    public String getTrunkSecret() {

        return trunkSecret;
    }
    public void setTrunkSecret(String trunkSecret) {
        this.trunkSecret = trunkSecret;
    }
    public String getTrunkType() {

        return trunkType;
    }
    public void setTrunkType(String trunkType) {
        this.trunkType = trunkType;
    }
    public String getTrunkInsecure() {

        return trunkInsecure;
    }
    public void setTrunkInsecure(String trunkInsecure) {
        this.trunkInsecure = trunkInsecure;
    }
    public String getTrunkDescription() {

        return trunkDescription;
    }
    public void setTrunkDescription(String trunkDescription) {
        this.trunkDescription = trunkDescription;
    }
    public Timestamp getInsertDate() {

        return insertDate;
    }
    public void setInsertDate(Timestamp insertDate) {
        this.insertDate = insertDate;
    }
}
