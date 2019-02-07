package com.example.demo.enity;

import java.security.acl.Owner;
import java.util.Date;

public class Shop {
    private Integer shopId;

    private Integer ownerId;

    private Integer areaId;

    private Integer shopCategoryId;

    private String shopName;

    private String shopDesc;

    private String shopAddr;

    private String phone;

    private String shopImg;

    private Integer priority;

    private Date createTime;

    private Date updateTime;

    private Integer enableStatus;

    private String advice;

    private Area area;

    private ShopCategory shopCategory;

    private PersonInfo owner;

    public Shop(Integer shopId, Integer ownerId, Integer areaId, Integer shopCategoryId, String shopName, String shopDesc, String shopAddr, String phone, String shopImg, Integer priority, Date createTime, Date updateTime, Integer enableStatus, String advice) {
        this.shopId = shopId;
        this.ownerId = ownerId;
        this.areaId = areaId;
        this.shopCategoryId = shopCategoryId;
        this.shopName = shopName;
        this.shopDesc = shopDesc;
        this.shopAddr = shopAddr;
        this.phone = phone;
        this.shopImg = shopImg;
        this.priority = priority;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.enableStatus = enableStatus;
        this.advice = advice;
    }

    public Shop() {
        super();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getShopCategoryId() {
        return shopCategoryId;
    }

    public void setShopCategoryId(Integer shopCategoryId) {
        this.shopCategoryId = shopCategoryId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopDesc() {
        return shopDesc;
    }

    public void setShopDesc(String shopDesc) {
        this.shopDesc = shopDesc == null ? null : shopDesc.trim();
    }

    public String getShopAddr() {
        return shopAddr;
    }

    public void setShopAddr(String shopAddr) {
        this.shopAddr = shopAddr == null ? null : shopAddr.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getShopImg() {
        return shopImg;
    }

    public void setShopImg(String shopImg) {
        this.shopImg = shopImg == null ? null : shopImg.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice == null ? null : advice.trim();
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public ShopCategory getShopCategory() {
        return shopCategory;
    }

    public void setShopCategory(ShopCategory shopCategory) {
        this.shopCategory = shopCategory;
    }

    public PersonInfo getOwner() {
        return owner;
    }

    public void setOwner(PersonInfo owner) {
        this.owner = owner;
    }
}