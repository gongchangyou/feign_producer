package com.mouse.feigndemo.impl;

import com.mouse.feigndemo.intf.Param;
import com.mouse.feigndemo.intf.Result;
import com.mouse.feigndemo.intf.StuRpcService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gongchangyou
 * @version 1.0
 * @date 2022/1/13 1:44 下午
 */
@Slf4j
@Service
public class StuRPCServiceImpl implements StuRpcService {

    @Override
    public int add(int a, int b) {
        return 0;
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
