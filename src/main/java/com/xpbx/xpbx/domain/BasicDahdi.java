package com.xpbx.xpbx.domain;

import java.sql.Timestamp;

public class BasicDahdi {

    private int id;
    private String dahdiId;
    private int dahdiGroupId;
    private String dahdiOverlapMode;
    private String dahdiSwitchType;
    private String dahdiSignalling;
    private String dahdiPridialplan;
    private String dahdiPrilocaldialplan;
    private String dahdiChannel;
    private String dahdiDescription;
    private Timestamp insertDate;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDahdiId() {

        return dahdiId;
    }
    public void setDahdiId(String dahdiId) {
        this.dahdiId = dahdiId;
    }
    public int getDahdiGroupId() {

        return dahdiGroupId;
    }
    public void setDahdiGroupId(int dahdiGroupId) {
        this.dahdiGroupId = dahdiGroupId;
    }
    public String getDahdiOverlapMode() {

        return dahdiOverlapMode;
    }
    public void setDahdiOverlapMode(String dahdiOverlapMode) {
        this.dahdiOverlapMode = dahdiOverlapMode;
    }


    public String getDahdiSwitchType() {

        return dahdiSwitchType;
    }
    public void setDahdiSwitchType(String dahdiSwitchType) {
        this.dahdiSwitchType = dahdiSwitchType;
    }
    public String getDahdiSignalling() {

        return dahdiSignalling;
    }
    public void set(String dahdiSignalling) {
        this.dahdiSignalling = dahdiSignalling;
    }
    public String getDahdiPridialplan() {

        return dahdiPridialplan;
    }
    public void setDahdiPridialplan(String dahdiPridialplan) {
        this.dahdiPridialplan = dahdiPridialplan;
    }
    public String getDahdiPrilocaldialplan() {

        return dahdiPrilocaldialplan;
    }
    public void setDahdiPrilocaldialplan(String dahdiPrilocaldialplan) {
        this.dahdiPrilocaldialplan = dahdiPrilocaldialplan;
    }
    public String getDahdiChannel() {

        return dahdiChannel;
    }
    public void setDahdiChannel(String dahdiChannel) {
        this.dahdiChannel = dahdiChannel;
    }
    public String getDahdiDescription() {

        return dahdiDescription;
    }
    public void setDahdiDescription(String dahdiDescription) {
        this.dahdiDescription = dahdiDescription;
    }

    public Timestamp getInsertDate() {

        return insertDate;
    }
    public void setInsertDate(Timestamp insertDate) {
        this.insertDate = insertDate;
    }
}
