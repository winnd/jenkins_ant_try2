package com.example.demo.dao;

import com.example.demo.BaseTest;
import com.example.demo.enity.Area;
import com.example.demo.enity.PersonInfo;
import com.example.demo.enity.Shop;
import com.example.demo.enity.ShopCategory;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2019</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2019.1.9 11:34</p >
 * <p>Modify:2019.1.9 11:34 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */
public class ShopDaoTest extends BaseTest {
    @Autowired
    ShopDao shopDao;
    @Autowired
    ShopMapper shopMapperDao;

    @Test
    @Ignore
    public void testInserShop() {
        Shop shop = new Shop();
        PersonInfo owner = new PersonInfo();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();
        owner.setUserId(1L);
        area.setAreaId(2);
        shop.setOwner(owner);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setShopName("测试的店铺");
        shop.setShopDesc("test");
        shop.setPhone("test");
        shop.setShopImg("test");
        shop.setCreateTime(new Date());
        shop.setAdvice("审核中");
        shop.setEnableStatus(1);
        int effectedNum = shopDao.insertShop(shop);
        assertEquals(1, effectedNum);
    }

    @Test
    public void testUpdateShop() {
        Shop shop = new Shop();
        shop.setShopId(1);
        shop.setShopName("测试的店铺");
        shop.setShopDesc("测试的");
        shop.setEnableStatus(1);
        shop.setUpdateTime(new Date());
        int effectedNum = shopDao.updateByPrimaryKey(shop);
        assertEquals(1, effectedNum);
    }
}