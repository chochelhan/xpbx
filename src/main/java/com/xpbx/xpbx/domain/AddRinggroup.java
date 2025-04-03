package com.xpbx.xpbx.domain;

import java.sql.Timestamp;

public class AddRinggroup {

    private int id;
    private String ringGroupId;
    private String ringGroupNumber;
    private String memberExtension;
    private String ringType;
    private int ringTimeout;
    private int ringRetry;
    private int mohSrl;
    private String useRecord;
    private String useDvr;
    private String useSchedule;
    private String ringGroupDescription;
    private Timestamp insertDate;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getRingGroupId() {

        return ringGroupId;
    }
    public void setRingGroupId(String ringGroupId) {

        this.ringGroupId = ringGroupId;
    }

    public String getRingGroupNumber() {

        return ringGroupNumber;
    }
    public void setRingGroupNumber(String ringGroupNumber) {

        this.ringGroupNumber = ringGroupNumber;
    }

    public String getMemberExtension() {

        return memberExtension;
    }
    public void setMemberExtension(String memberExtension) {

        this.memberExtension = memberExtension;
    }
    public String getRingType() {

        return ringType;
    }
    public void setRingType(String ringType) {

        this.ringType = ringType;
    }
    public int getRingTimeout() {

        return ringTimeout;
    }
    public void setRingTimeout(int ringTimeout) {

        this.ringTimeout = ringTimeout;
    }
    public int getRingRetry() {

        return ringRetry;
    }
    public void setRingRetry(int ringRetry) {

        this.ringRetry = ringRetry;
    }
    public int getMohSrl() {

        return mohSrl;
    }
    public void setMohSrl(int mohSrl) {

        this.mohSrl = mohSrl;
    }

    public String getUseRecord() {

        return useRecord;
    }
    public void setUseRecord(String useRecord) {

        this.useRecord = useRecord;
    }
    public String getUseDvr() {

        return useDvr;
    }
    public void setUseDvr(String useDvr) {

        this.useDvr = useDvr;
    }
    public String getUseSchedule() {

        return useSchedule;
    }
    public void setUseSchedule(String useSchedule) {

        this.useSchedule = useSchedule;
    }
    public String getRingGroupDescription() {

        return ringGroupDescription;
    }
    public void setRingGroupDescription(String ringGroupDescription) {

        this.ringGroupDescription = ringGroupDescription;
    }

    public Timestamp getInsertDate() {

        return insertDate;
    }
    public void setInsertDate(Timestamp insertDate) {

        this.insertDate = insertDate;
    }
}
