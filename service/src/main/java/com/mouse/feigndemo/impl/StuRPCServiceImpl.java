package com.mouse.feigndemo.impl;

import com.mouse.feigndemo.intf.Param;
import com.mouse.feigndemo.intf.Result;
import com.mouse.feigndemo.intf.StuRpcService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author gongchangyou
 * @version 1.0
 * @date 2022/1/13 1:44 下午
 */
@Slf4j
@RestController
@RequestMapping(StuRpcService.path)
public class StuRPCServiceImpl implements StuRpcService {

    @Override
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String stringTest(Param param) {
        log.info("param {}", param);
        return param.getB();
    }

    @Override
    public Result<List<Long>> resultTest(Param param) {
        return Result.success(List.of(param.getC()));
    }
}
