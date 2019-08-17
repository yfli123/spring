package com.yfli.app1.controller.impl;

import com.yfli.app1.controller.TestController;
import com.yfli.app1.dto.TestReq;
import com.yfli.app1.dto.TestRsp;
import com.yfli.app1.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllerImpl implements TestController {

    @Autowired
    TestService testService;

    @Override
    public TestRsp test(@RequestBody TestReq testReq) {
        return testService.test(testReq);
    }
}
