package com.ifeng.bigdata.controller;

import com.ifeng.bigdata.entity.HealthStatus;
import com.ifeng.bigdata.service.StatusCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chang on 2017/9/24.
 */
@RestController
public class HealthCheck {

    @Autowired
    private StatusCheck statusCheck;

    @RequestMapping(value = "/healthCheck", method = RequestMethod.GET)
    @ResponseBody
    public HealthStatus healthCheck() {
        return statusCheck.check();
    }
}
