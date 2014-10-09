package com.equation.testcases.service;

import com.argo.acl.SysRoleResource;
import com.argo.acl.service.SysRoleResourceService;
import com.equation.testcases.BaseTestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Yaming
 * Date: 2014/10/6
 * Time: 10:14
 */
public class SysRoleResourceServiceTest extends BaseTestCase {

    @Test
    public void testAdd() throws Exception {
        SysRoleResourceService service = context.getBean(SysRoleResourceService.class);
        SysRoleResource item = new SysRoleResource();
        item.setResourceId(1);
        item.setRoleId(1);
        Long id = service.add(item);
        Assert.assertNotNull(id);
        Assert.assertTrue( id > 0);
    }

    @Test
    public void testRemove() throws Exception {
        SysRoleResourceService service = context.getBean(SysRoleResourceService.class);
        SysRoleResource item = new SysRoleResource();
        item.setResourceId(1);
        item.setRoleId(1);

        boolean flag = service.remove(item);
        Assert.assertTrue(flag);

        flag = service.remove(item);
        Assert.assertFalse(flag);
    }

    @Test
    public void testFindByRole() throws Exception {
        SysRoleResourceService service = context.getBean(SysRoleResourceService.class);
        List<Integer> roleList = service.findByRole(1L);
        Assert.assertEquals(1L, roleList.size());
    }
}
