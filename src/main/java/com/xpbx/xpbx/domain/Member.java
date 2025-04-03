package com.xpbx.xpbx.domain;

import java.sql.Timestamp;

public class Member {

    private int memberSrl;
    private String userId;
    private String emailAddress;
    private String password;
    private String userName;
    private Timestamp regdate;
    private Timestamp lastLogin;

    public int getMemberSrl() {
        return memberSrl;
    }
    public void setMemberSrl(int memberSrl) {
        this.memberSrl = memberSrl;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId =userId;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password =password;
    }
    public Timestamp getRegdate() {
        return regdate;
    }
    public void setRegdate(Timestamp regdate) {
        this.regdate = regdate;
    }
    public Timestamp getLastLogin() {
        return lastLogin;
    }
    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }

}
