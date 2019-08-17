package com.yfli.app1.service.impl;

import com.yfli.app1.dto.TestReq;
import com.yfli.app1.dto.TestRsp;
import com.yfli.app1.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public TestRsp test(TestReq req){
        TestRsp testRsp = new TestRsp();
        testRsp.setHello("hello world ,this is my first application");
        return testRsp;
    }
}
