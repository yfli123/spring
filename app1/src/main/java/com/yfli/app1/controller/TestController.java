package com.yfli.app1.controller;

import com.yfli.app1.dto.TestReq;
import com.yfli.app1.dto.TestRsp;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public interface TestController {
    @PostMapping(value = "test",name = "spring boot 测试",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public TestRsp test(@RequestBody  TestReq testReq);
}
