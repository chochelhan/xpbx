package com.xpbx.xpbx.domain;

import java.sql.Timestamp;

public class BasicGroup  {
    private int id;
    private String groupId;
    private String groupName;
    private String isGroupPartition;
    private String groupDescription;
    private Timestamp insertDate;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getGroupId() {
        return groupId;
    }
    public void setGroupId(String groupId) {

        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getIsGroupPartition() {

        return isGroupPartition;
    }
    public void setIsGroupPartition(String isGroupPartition) {
        this.isGroupPartition = isGroupPartition;
    }

    public String getGroupDescription() {

        return groupDescription;
    }
    public void setGroupDescription(String groupDescription) {

        this.groupDescription = groupDescription;
    }

    public Timestamp getInsertDate() {

        return insertDate;
    }
    public void setInsertDate(Timestamp insertDate) {

        this.insertDate = insertDate;
    }
}
