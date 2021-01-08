package com.shangma.cn.entity;

import java.util.Date;

public class Returnfactory {
    private Long id;

    private String returnMark;

    private String creatorName;

    private Date addTime;

    private String approverName;

    private Date approverTime;

    private String approverStatus;

    private Long returnDetailid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReturnMark() {
        return returnMark;
    }

    public void setReturnMark(String returnMark) {
        this.returnMark = returnMark == null ? null : returnMark.trim();
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getApproverName() {
        return approverName;
    }

    public void setApproverName(String approverName) {
        this.approverName = approverName == null ? null : approverName.trim();
    }

    public Date getApproverTime() {
        return approverTime;
    }

    public void setApproverTime(Date approverTime) {
        this.approverTime = approverTime;
    }

    public String getApproverStatus() {
        return approverStatus;
    }

    public void setApproverStatus(String approverStatus) {
        this.approverStatus = approverStatus == null ? null : approverStatus.trim();
    }

    public Long getReturnDetailid() {
        return returnDetailid;
    }

    public void setReturnDetailid(Long returnDetailid) {
        this.returnDetailid = returnDetailid;
    }
}