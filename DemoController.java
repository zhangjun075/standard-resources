package com.ppdai.tars.web;

import com.ppdai.tars.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: junzhang
 * @Description:
 * @Date: 2018/11/6 5:57 PM
 **/
@RestController
public class DemoController {

    @Autowired
    DemoService demoService;

    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    public void demo() throws Exception {
        demoService.demo();
    }
}
