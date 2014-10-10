package com.argo.equation.testcases.controller;

import com.argo.core.web.JsonResponse;
import com.argo.equation.testcases.BaseTestCase;
import com.google.common.collect.Maps;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

/**
 * Created by Administrator on 2014/10/9.
 */
public class SysRoleUserControllerTest extends BaseTestCase {

    @Test
    public void testAdd() throws Exception {
        String url = "/acl/sys/role/user/add";
        Map<String, Object> map = Maps.newHashMap();
        map.put("roleId", 1);
        map.put("itemId", 1);
        JsonResponse jsonResponse = super.postForm(url, map);
        Assert.assertEquals(200L, jsonResponse.getCode() * 1L);
    }

    @Test
    public void testAdd2() throws Exception {
        String url = "/acl/sys/role/user/add";
        Map<String, Object> map = Maps.newHashMap();
        map.put("roleId", 1);
        //map.put("itemId", 1);
        JsonResponse jsonResponse = super.postForm(url, map);
        Assert.assertNotEquals(200L, jsonResponse.getCode() * 1L);
        System.out.println(jsonResponse);
    }

    @Test
    public void testAdd3() throws Exception {
        String url = "/acl/sys/role/user/add";
        Map<String, Object> map = Maps.newHashMap();
        //map.put("roleId", 1);
        map.put("itemId", 1);
        JsonResponse jsonResponse = super.postForm(url, map);
        Assert.assertNotEquals(200L, jsonResponse.getCode() * 1L);
        System.out.println(jsonResponse);
    }

    @Test
    public void testRemove() throws Exception {
        String url = "/acl/sys/role/user/remove";
        Map<String, Object> map = Maps.newHashMap();
        map.put("roleId", 1);
        map.put("itemId", 1);
        JsonResponse jsonResponse = super.postForm(url, map);
        Assert.assertEquals(200L, jsonResponse.getCode() * 1L);
    }

    @Test
    public void testRemove2() throws Exception {
        String url = "/acl/sys/role/user/remove";
        Map<String, Object> map = Maps.newHashMap();
        map.put("roleId", 1);
        //map.put("itemId", 1);
        JsonResponse jsonResponse = super.postForm(url, map);
        Assert.assertNotEquals(200L, jsonResponse.getCode() * 1L);
        System.out.println(jsonResponse);
    }

    @Test
    public void testRemove3() throws Exception {
        String url = "/acl/sys/role/user/remove";
        Map<String, Object> map = Maps.newHashMap();
        //map.put("roleId", 1);
        map.put("itemId", 1);
        JsonResponse jsonResponse = super.postForm(url, map);
        Assert.assertNotEquals(200L, jsonResponse.getCode() * 1L);
        System.out.println(jsonResponse);
    }
}
