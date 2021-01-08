package com.shangma.cn.entity;

public class Returndetail {
    private Long id;

    private Long goodsId;

    private String returnSite;

    private String returnBecause;

    private String returnNote;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getReturnSite() {
        return returnSite;
    }

    public void setReturnSite(String returnSite) {
        this.returnSite = returnSite == null ? null : returnSite.trim();
    }

    public String getReturnBecause() {
        return returnBecause;
    }

    public void setReturnBecause(String returnBecause) {
        this.returnBecause = returnBecause == null ? null : returnBecause.trim();
    }

    public String getReturnNote() {
        return returnNote;
    }

    public void setReturnNote(String returnNote) {
        this.returnNote = returnNote == null ? null : returnNote.trim();
    }
}