package com.example.demo.service.impl;

import com.example.demo.dao.AreaDao;
import com.example.demo.enity.Area;
import com.example.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2018</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2018/10/5 16:03</p >
 * <p>Modify:2018/10/5 16:03 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */

@Service 
public class AreaServiceImpl implements AreaService {
    @Autowired private AreaDao areaDao;
    
    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    } 
}
