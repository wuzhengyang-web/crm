package com.shangma.cn.entity;

public class Returngoods {
    private Long id;

    private Long goodId;

    private String trackingInform;

    private String configuration;

    private String returnType;

    private Long afterId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public String getTrackingInform() {
        return trackingInform;
    }

    public void setTrackingInform(String trackingInform) {
        this.trackingInform = trackingInform == null ? null : trackingInform.trim();
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration == null ? null : configuration.trim();
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType == null ? null : returnType.trim();
    }

    public Long getAfterId() {
        return afterId;
    }

    public void setAfterId(Long afterId) {
        this.afterId = afterId;
    }
}