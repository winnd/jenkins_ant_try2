package com.example.demo.dao;

import com.example.demo.BaseTest;
import com.example.demo.enity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2018</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2018/10/5 14:44</p >
 * <p>Modify:2018/10/5 14:44 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */
public class AreaDaoTest extends BaseTest {
    @Autowired private AreaDao areaDao;

    @Test
    public void queryArea() {
        List<Area> areaList = areaDao.queryArea();
        assertEquals(2,areaList.size());
    }
}
