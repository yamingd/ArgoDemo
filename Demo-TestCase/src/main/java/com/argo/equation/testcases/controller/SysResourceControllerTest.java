package com.argo.equation.testcases.controller;

import com.argo.core.web.JsonResponse;
import com.argo.equation.testcases.BaseTestCase;
import com.google.common.collect.Maps;
import org.junit.Test;
import org.springframework.util.Assert;

import java.util.Map;

/**
 * Created by Administrator on 2014/10/9.
 */
public class SysResourceControllerTest extends BaseTestCase {

    @Test
    public void testAll() throws Exception {
        String url = "/acl/sys/resource/all";
        String html = super.getUrlView(url, null);
        Assert.notNull(html);
    }

    @Test
    public void testAdd() throws Exception {
        String url = "/acl/sys/resource/add";
        String html = super.getUrlView(url, null);
        Assert.notNull(html);

        url = "/acl/sys/resource/create";
        Map<String, Object> map = Maps.newHashMap();
        map.put("name", "HOME_PAGE");
        map.put("title", "网站首页");
        map.put("url", "/home");
        JsonResponse jsonResponse = super.postForm(url, map);
        System.out.println(jsonResponse);
    }

    @Test
    public void testAdd2() throws Exception {
        String url = "/acl/sys/resource/add";
        String html = super.getUrlView(url, null);
        Assert.notNull(html);

        url = "/acl/sys/resource/create";
        Map<String, Object> map = Maps.newHashMap();
        map.put("name", "HOME_PAGE");
        //map.put("title", "网站首页");
        map.put("url", "/home");
        JsonResponse jsonResponse = super.postForm(url, map);
        System.out.println(jsonResponse);
    }

    @Test
    public void testAdd3() throws Exception {
        String url = "/acl/sys/resource/add";
        String html = super.getUrlView(url, null);
        Assert.notNull(html);

        url = "/acl/sys/resource/create";
        Map<String, Object> map = Maps.newHashMap();
        map.put("name", "HOME_PAGEHOME_PAGEHOME_PAGEHOME_PAGEHOME_PAGEHOME_PAGEHOME_PAGEHOME_PAGEHOME_PAGEHOME_PAGE");
        //map.put("title", "网站首页");
        map.put("url", "/home");
        JsonResponse jsonResponse = super.postForm(url, map);
        System.out.println(jsonResponse);
    }

    @Test
    public void testSelect() throws Exception {
        String url = "/acl/sys/resource/select";
        JsonResponse html = super.getJson(url, null);
        Assert.notNull(html);
        System.out.println(html);
    }

    @Test
    public void testView() throws Exception {
        String url = "/acl/sys/resource/view/3";
        String html = super.getUrlView(url, null);
        Assert.notNull(html);

        url = "/acl/sys/resource/save/3";
        Map<String, Object> map = Maps.newHashMap();
        map.put("name", "ROLE_PI");
        map.put("title", "普通用户2");
        JsonResponse jsonResponse = super.postForm(url, map);
        System.out.println(jsonResponse);

        url = "/acl/sys/resource/remove/3";
        jsonResponse = super.postForm(url, map);
        System.out.println(jsonResponse);
    }
}
