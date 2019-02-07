package com.example.demo;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>Title:</p >
 * <p>Description:</p >
 * <p>Copyright:Copyright (c) 2018</p >
 * <p>Company:易泓咨询管理公司 </p >
 * <p>Date:2018/10/5 14:45</p >
 * <p>Modify:2018/10/5 14:45 </p >
 * <p>Bug:</p >
 *
 * @author fengye.ren
 * @version 1.1
 * 配置spring和junit整合,junit启动时加载springIOC容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BaseTest {
}
