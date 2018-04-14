package com.winter.model;

import java.util.Date;

public class shopWxMenu extends shopWxMenuKey {
    private String menuNm;

    private Integer menuParentId;

    private String menuOpType;

    private Integer menuOpId;

    private String menuOpTitle;

    private Byte menuSts;

    private Byte sortNo;

    private String createId;

    private Date createDt;

    private String modifyId;

    private Date modifyDt;

    private String menuOpCom;

    public String getMenuNm() {
        return menuNm;
    }

    public void setMenuNm(String menuNm) {
        this.menuNm = menuNm == null ? null : menuNm.trim();
    }

    public Integer getMenuParentId() {
        return menuParentId;
    }

    public void setMenuParentId(Integer menuParentId) {
        this.menuParentId = menuParentId;
    }

    public String getMenuOpType() {
        return menuOpType;
    }

    public void setMenuOpType(String menuOpType) {
        this.menuOpType = menuOpType == null ? null : menuOpType.trim();
    }

    public Integer getMenuOpId() {
        return menuOpId;
    }

    public void setMenuOpId(Integer menuOpId) {
        this.menuOpId = menuOpId;
    }

    public String getMenuOpTitle() {
        return menuOpTitle;
    }

    public void setMenuOpTitle(String menuOpTitle) {
        this.menuOpTitle = menuOpTitle == null ? null : menuOpTitle.trim();
    }

    public Byte getMenuSts() {
        return menuSts;
    }

    public void setMenuSts(Byte menuSts) {
        this.menuSts = menuSts;
    }

    public Byte getSortNo() {
        return sortNo;
    }

    public void setSortNo(Byte sortNo) {
        this.sortNo = sortNo;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public String getModifyId() {
        return modifyId;
    }

    public void setModifyId(String modifyId) {
        this.modifyId = modifyId == null ? null : modifyId.trim();
    }

    public Date getModifyDt() {
        return modifyDt;
    }

    public void setModifyDt(Date modifyDt) {
        this.modifyDt = modifyDt;
    }

    public String getMenuOpCom() {
        return menuOpCom;
    }

    public void setMenuOpCom(String menuOpCom) {
        this.menuOpCom = menuOpCom == null ? null : menuOpCom.trim();
    }
}