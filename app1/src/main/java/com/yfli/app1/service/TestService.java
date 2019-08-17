package com.yfli.app1.service;

import com.yfli.app1.dto.TestReq;
import com.yfli.app1.dto.TestRsp;
import org.springframework.stereotype.Service;

@Service
public interface TestService {
    public TestRsp test(TestReq req);
}
