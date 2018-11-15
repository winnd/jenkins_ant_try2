package com.example.demo.enity;

import java.util.Date;
import java.util.List;

public class Product {
    private Long productId;
    private String productName;
    private String productDesc;
    // 简略图
    private String imgAddr;
    private String normalPrice;         // 原价
    private String promotionPrice;      // 折扣价
    private Integer priority;
    private Date createTime;
    private Date updateTime;
    // 1-不可用 0-下架 1.在前端展示系统展示
    private Integer enableStatus;
    private List<ProductImg> productImglist;
    private ProductCategory productCategory;
    private Shop shop;
}
