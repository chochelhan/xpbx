package com.xpbx.xpbx.domain;

import java.sql.Timestamp;

public class BasicTerminal {

    private int id;
    private String extensionCallerid;
    private String extensionName;
	private String extensionOutboundCid;

    private String extensionPwdstr;
    private String extensionLocation;
    private int groupSrl;
    private String groupId;
    private String isTrunk;
    private String autoPrefixType;

    private String autoPrefix;
    private int blockPrefixSrl;
    private String blacklistUse;
    private String apvUse;
    private String apvRtpPort;
    private String apvMacaddress;
    private int apvTemplateSrl;
    private String vmUse;
    private String vmEmail;

    private String vmPassword;
    private String vmAttach;
    private String vmDelete;
    private String ringTimeout;
    private int introRingSrl;
    private int mohSrl;

    private String useRecord;
    private String extensionDescription;
    private String dvrArea;
    private String dvrZone;
    private String dvrAddress;

    private String dvrServer;
    private String cameraNumber;
    private String cameraName;
    private Timestamp lastModifyDate;
    private Timestamp insertDate;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getExtensionCallerid() {
        return extensionCallerid;
    }
    public void setExtensionCallerid(String extensionCallerid) {
        this.extensionCallerid = extensionCallerid;
    }
    public String getExtensionName() {
        return extensionName;
    }
    public void setExtensionName(String extensionName) {
        this.extensionName = extensionName;
    }
    public String getExtensionOutboundCid() {
        return extensionOutboundCid;
    }
    public void setExtensionOutboundCid(String extensionOutboundCid) {
        this.extensionOutboundCid = extensionOutboundCid;
    }

    public String getExtensionPwdstr() {
        return extensionPwdstr;
    }
    public void setExtensionPwdstr(String extensionPwdstr) {
        this.extensionPwdstr = extensionPwdstr;
    }
    public String getExtensionLocation() {
        return extensionLocation;
    }
    public void setExtensionLocation(String extensionLocation) {
        this.extensionLocation = extensionLocation;
    }
    public int getGroupSrl() {
        return groupSrl;
    }
    public void setGroupSrl(int groupSrl) {
        this.groupSrl = groupSrl;
    }
    public String getGroupId() {
        return groupId;
    }
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    public String getIsTrunk() {
        return isTrunk;
    }
    public void setIsTrunk(String isTrunk) {
        this.isTrunk = isTrunk;
    }
    public String getAutoPrefixType() {
        return autoPrefixType;
    }
    public void setAutoPrefixType(String autoPrefixType) {
        this.autoPrefixType = autoPrefixType;
    }


    public String getAutoPrefix() {
        return autoPrefix;
    }
    public void setAutoPrefix(String autoPrefix) {
        this.autoPrefix = autoPrefix;
    }
    public int getBlockPrefixSrl() {
        return blockPrefixSrl;
    }
    public void setBlockPrefixSrl(int blockPrefixSrl) {
        this.blockPrefixSrl = blockPrefixSrl;
    }
    public String getBlacklistUse() {
        return blacklistUse;
    }
    public void setBlacklistUse(String blacklistUse) {
        this.blacklistUse = blacklistUse;
    }
    public String getApvUse() {
        return apvUse;
    }
    public void setApvUse(String apvUse) {
        this.apvUse = apvUse;
    }
    public String getApvRtpPort() {
        return apvRtpPort;
    }
    public void setApvRtpPort(String apvRtpPort) {
        this.apvRtpPort = apvRtpPort;
    }
    public String getApvMacaddress() {
        return apvMacaddress;
    }
    public void setApvMacaddress(String apvMacaddress) {
        this.apvMacaddress = apvMacaddress;
    }
    public int getApvTemplateSrl() {
        return apvTemplateSrl;
    }
    public void setApvTemplateSrl(int apvTemplateSrl) {
        this.apvTemplateSrl = apvTemplateSrl;
    }
    public String getVmUse() {
        return vmUse;
    }
    public void setVmUse(String vmUse) {
        this.vmUse = vmUse;
    }
    public String getVmEmail() {
        return vmEmail;
    }
    public void setVmEmail(String vmEmail) {
        this.vmEmail = vmEmail;
    }
    public String getVmPassword() {
        return vmPassword;
    }
    public void setVmPassword(String vmPassword) {
        this.vmPassword = vmPassword;
    }
    public String getVmAttach() {
        return vmAttach;
    }
    public void setVmAttach(String vmAttach) {
        this.vmAttach = vmAttach;
    }
    public String getVmDelete() {
        return vmDelete;
    }
    public void setVmDelete(String vmDelete) {
        this.vmDelete = vmDelete;
    }
    public String getRingTimeout() {
        return ringTimeout;
    }
    public void setRingTimeout(String ringTimeout) {
        this.ringTimeout = ringTimeout;
    }
    public int getIntroRingSrl() {
        return introRingSrl;
    }
    public void setIntroRingSrl(int introRingSrl) {
        this.introRingSrl = introRingSrl;
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
    public String getExtensionDescription() {
        return extensionDescription;
    }
    public void setExtensionDescription(String extensionLocation) {
        this.extensionLocation = extensionLocation;
    }
    public String getDvrArea() {
        return dvrArea;
    }
    public void setDvrArea(String dvrArea) {
        this.dvrArea = dvrArea;
    }
    public String getDvrZone() {
        return dvrZone;
    }
    public void setDvrZone(String dvrZone) {
        this.dvrZone = dvrZone;
    }
    public String getDvrAddress() {
        return dvrAddress;
    }
    public void setDvrAddress(String dvrAddress) {
        this.dvrAddress = dvrAddress;
    }
    public String getDvrServer() {
        return dvrServer;
    }
    public void setDvrServer(String dvrServer) {
        this.dvrServer = dvrServer;
    }
    public String getCameraNumber() {
        return cameraNumber;
    }
    public void setCameraNumber(String cameraNumber) {
        this.cameraNumber = cameraNumber;
    }

    public String getCameraName() {
        return cameraName;
    }
    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

    public Timestamp getLastModifyDate() {
        return lastModifyDate;
    }
    public void setLastModifyDate(Timestamp lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public Timestamp getInsertDate() {
        return insertDate;
    }
    public void setInsertDate(Timestamp insertDate) {
        this.insertDate = insertDate;
    }
}
