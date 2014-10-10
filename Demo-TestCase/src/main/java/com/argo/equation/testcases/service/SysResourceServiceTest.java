package com.argo.equation.testcases.service;

import com.argo.acl.SysResource;
import com.argo.acl.service.SysResourceService;
import com.argo.equation.testcases.BaseTestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Yaming
 * Date: 2014/10/6
 * Time: 10:14
 */
public class SysResourceServiceTest extends BaseTestCase {

    @Test
    public void testAdd() throws Exception {
        SysResourceService sysResourceService = context.getBean(SysResourceService.class);
        SysResource item = new SysResource();
        item.setTitle("首页");
        item.setName("home_page");
        item.setUrl("/home");
        Long id = sysResourceService.add(item);
        Assert.assertNotNull(id);
        Assert.assertTrue( id > 0);
    }

    @Test
    public void testUpdate() throws Exception {
        SysResourceService sysResourceService = context.getBean(SysResourceService.class);
        SysResource item = new SysResource();
        item.setId(2);
        item.setTitle("首页访问");
        item.setName("HOME_PAGE");
        item.setUrl("/home");
        boolean flag = sysResourceService.update(item);
        Assert.assertTrue(flag);
    }

    @Test
    public void testRemove() throws Exception {
        SysResourceService sysResourceService = context.getBean(SysResourceService.class);
        boolean flag = sysResourceService.remove(2L);
        Assert.assertTrue(flag);

        flag = sysResourceService.remove(2L);
        Assert.assertFalse(flag);
    }

    @Test
    public void testFindAll() throws Exception {
        SysResourceService sysResourceService = context.getBean(SysResourceService.class);
        List<SysResource> roleList = sysResourceService.findAll();
        Assert.assertEquals(1L, roleList.size());
    }
}
