package com.mouse.feigndemo.intf;

import org.springframework.cloud.openfeign.FeignClient;

import java.net.URL;
import java.util.List;

/**
 * @author gongchangyou
 * @version 1.0
 * @date 2022/1/12 9:56 上午
 */
public interface StuRpcService {
    String name = "StuRpcService";
    String path = "stu";


    int add(int a, int b);

    String stringTest(Param param);

    Result<List<Long>> resultTest(Param param);

}
