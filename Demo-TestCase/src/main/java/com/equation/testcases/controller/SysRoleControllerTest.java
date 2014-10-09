package com.equation.testcases.controller;

import com.argo.acl.SysRole;
import com.argo.core.web.BsonResponse;
import com.argo.core.web.JsonResponse;
import com.equation.testcases.BaseTestCase;
import com.google.common.collect.Maps;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2014/10/9.
 */
public class SysRoleControllerTest extends BaseTestCase {

    @Test
    public void testAll() throws Exception {
        String url = "/acl/sys/role/all";
        String html = super.getUrlView(url, null);
        Assert.assertNotNull(html);
    }

    @Test
    public void testAdd() throws Exception {
        String url = "/acl/sys/role/add";
        String html = super.getUrlView(url, null);
        Assert.assertNotNull(html);

        url = "/acl/sys/role/create";
        Map<String, Object> map = Maps.newHashMap();
        map.put("name", "ROLE_USER555");
        map.put("title", "普通用户");
        JsonResponse jsonResponse = super.postForm(url, map);
        Assert.assertEquals(200L, jsonResponse.getCode() * 1L);
        System.out.println(jsonResponse);
    }

    @Test
    public void testAdd2() throws Exception {
        String url = "/acl/sys/role/add";
        String html = super.getUrlView(url, null);
        Assert.assertNotNull(html);

        url = "/acl/sys/role/create";
        Map<String, Object> map = Maps.newHashMap();
        map.put("name", "ROLE_USER2");
        JsonResponse jsonResponse = super.postForm(url, map);
        Assert.assertNotEquals(200L, jsonResponse.getCode() * 1L);
        System.out.println(jsonResponse);
    }

    @Test
    public void testAdd3() throws Exception {
        String url = "/acl/sys/role/add";
        String html = super.getUrlView(url, null);
        Assert.assertNotNull(html);

        url = "/acl/sys/role/create";
        Map<String, Object> map = Maps.newHashMap();
        map.put("name", "ROLE_USER3ROLE_USER3ROLE_USER3ROLE_USER3ROLE_USER3ROLE_USER3ROLE_USER3");
        //map.put("title", "普通用户");
        JsonResponse jsonResponse = super.postForm(url, map);
        Assert.assertNotEquals(200L, jsonResponse.getCode() * 1L);
        System.out.println(jsonResponse);
    }

    @Test
    public void testSelect() throws Exception {
        String url = "/acl/sys/role/select";
        JsonResponse html = super.getJson(url, null);
        Assert.assertNotNull(html);
        System.out.println(html);
    }

    @Test
    public void testSelect2() throws Exception {
        String url = "/acl/sys/role/select.bson";
        BsonResponse html = super.getBson(url, null);
        Assert.assertNotNull(html);
        List<SysRole> roles = html.dataBeans(SysRole.class);
        System.out.println(roles);
    }

    @Test
    public void testView() throws Exception {
        String url = "/acl/sys/role/view/3";
        String html = super.getUrlView(url, null);
        Assert.assertNotNull(html);

        url = "/acl/sys/role/save/3";
        Map<String, Object> map = Maps.newHashMap();
        map.put("name", "ROLE_PI");
        map.put("title", "普通用户2");
        JsonResponse jsonResponse = super.postForm(url, map);
        System.out.println(jsonResponse);

        url = "/acl/sys/role/remove/3";
        jsonResponse = super.postForm(url, map);
        System.out.println(jsonResponse);
    }
}
