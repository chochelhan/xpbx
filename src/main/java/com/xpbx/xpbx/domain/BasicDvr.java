package com.xpbx.xpbx.domain;

import java.sql.Timestamp;

public class BasicDvr {

    private int id;
    private String dvrId;
    private String dvrName;
    private String dvrMethod;
    private String dvrIpaddr;
    private String dvrPort;
    private String dvrPath;
    private String dvrToken;
    private String isUse;
    private String dvrDescription;
    private Timestamp insertDate;

    public int getId() {

        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDvrId() {

        return dvrId;
    }
    public void setDvrId(String dvrId) {

        this.dvrId = dvrId;
    }
    public String getDvrName() {

        return dvrName;
    }
    public void setDvrName(String dvrName) {

        this.dvrName = dvrName;
    }
    public String getDvrMethod() {

        return dvrMethod;
    }
    public void setDvrMethod(String dvrMethod) {

        this.dvrMethod = dvrMethod;
    }
    public String getDvrIpaddr() {

        return dvrIpaddr;
    }
    public void setDvrIpaddr(String dvrIpaddr) {

        this.dvrIpaddr = dvrIpaddr;
    }
    public String getDvrPort() {

        return dvrPort;
    }
    public void setDvrPort(String dvrPort) {

        this.dvrPort = dvrPort;
    }
    public String getDvrPath() {

        return dvrPath;
    }
    public void setDvrPath(String dvrPath) {

        this.dvrPath = dvrPath;
    }
    public String getDvrToken() {

        return dvrToken;
    }
    public void setDvrToken(String dvrToken) {

        this.dvrToken = dvrToken;
    }
    public String getIsUse() {

        return isUse;
    }
    public void setIsUse(String isUse) {

        this.isUse = isUse;
    }
    public String getDvrDescription() {

        return dvrDescription;
    }
    public void setDvrDescription(String dvrDescription) {

        this.dvrDescription = dvrDescription;
    }

    public Timestamp getInsertDate() {

        return insertDate;
    }
    public void setInsertDate(Timestamp insertDate) {
        this.insertDate = insertDate;
    }
}
