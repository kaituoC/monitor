package com.ifeng.bigdata.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chang on 2017/9/24.
 */
@RestController
public class Alert {
    private Logger logger = LoggerFactory.getLogger(Alert.class);

    @RequestMapping(value = "alert", method = RequestMethod.GET)
    public String demo(String username, String pass) {
        String str = "username=" + username + ", password=" + pass;
        logger.info(str);
        return str;
    }
}
