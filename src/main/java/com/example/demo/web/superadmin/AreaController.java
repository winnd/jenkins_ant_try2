package com.example.demo.web.superadmin;

import com.example.demo.enity.Area;
import com.example.demo.service.AreaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2018</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2018/10/5 16:39</p >
 * <p>Modify:2018/10/5 16:39 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 */
@Controller
@RequestMapping("/superadmin")
public class AreaController {
    Logger logger = LoggerFactory.getLogger(AreaController.class);
    @Autowired private AreaService areaService;

    @ResponseBody   // 转为json
    @RequestMapping(value = "/listarea", method = RequestMethod.GET)
    private Map<String, Object> listArea() {
        logger.info("===Start===");
        long startTime = System.currentTimeMillis();
        Map<String, Object> modeMap = new HashMap<>();
        List<Area> list = new ArrayList<Area>();

        try {
            list = areaService.getAreaList();
            modeMap.put("rows", list);
            modeMap.put("total", list.size());
        } catch (Exception e) {
            e.printStackTrace();
            modeMap.put("success", false);
            modeMap.put("errMsg", e.toString());
        }
        logger.error("test error"); 
        long endTime = System.currentTimeMillis();
        logger.debug("costTime:[{}ms]", endTime - startTime);
        logger.info("===End===");
        return modeMap;
    }
}
