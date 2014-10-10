package com.equation.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yaming_deng on 2014/10/10.
 */
@Controller
@RequestMapping("/")
public class IndexController extends BaseController {

    @RequestMapping(value = "/", method= RequestMethod.GET)
    public String get(){
        return "index";
    }

}
