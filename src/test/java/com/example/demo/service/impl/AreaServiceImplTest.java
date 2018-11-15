package com.example.demo.service.impl;

import com.example.demo.BaseTest;
import com.example.demo.enity.Area;
import com.example.demo.service.AreaService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2018</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2018/10/5 16:22</p >
 * <p>Modify:2018/10/5 16:22 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */
public class AreaServiceImplTest extends BaseTest {

    @Autowired private AreaService areaService;

    @Test
    public void testGetAreaList() {
        List<Area> areaList = areaService.getAreaList();
        assertEquals("西苑",areaList.get(0).getAreaName());
    }
}
 
