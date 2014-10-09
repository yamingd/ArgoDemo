package com.equation.testcases.service;

import com.argo.acl.SysRole;
import com.argo.acl.service.SysRoleService;
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
public class SysRoleServiceTest extends BaseTestCase {

    @Test
    public void testAdd() throws Exception {
        SysRoleService sysRoleService = context.getBean(SysRoleService.class);
        SysRole sysRole = new SysRole();
        sysRole.setName("ROLE_PI");
        sysRole.setTitle("用户");
        Long id = sysRoleService.add(sysRole);
        Assert.assertNotNull(id);
        Assert.assertTrue( id > 0);
    }

    @Test
    public void testUpdate() throws Exception {
        SysRoleService sysRoleService = context.getBean(SysRoleService.class);
        SysRole sysRole = new SysRole();
        sysRole.setId(1);
        sysRole.setName("ROLE_USER");
        sysRole.setTitle("普通用户");
        boolean flag = sysRoleService.update(sysRole);
        Assert.assertTrue(flag);
    }

    @Test
    public void testRemove() throws Exception {
        SysRoleService sysRoleService = context.getBean(SysRoleService.class);
        boolean flag = sysRoleService.remove(1L);
        Assert.assertTrue(flag);

        flag = sysRoleService.remove(1L);
        Assert.assertFalse(flag);
    }

    @Test
    public void testFindAll() throws Exception {
        SysRoleService sysRoleService = context.getBean(SysRoleService.class);
        List<SysRole> roleList = sysRoleService.findAll();
        Assert.assertEquals(1L, roleList.size());
    }
}
