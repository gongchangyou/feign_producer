package com.mouse.feigndemo.intf;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.URL;
import java.util.List;

/**
 * @author gongchangyou
 * @version 1.0
 * @date 2022/1/12 9:56 上午
 */
//服务名和nacos中的注册名保持一致
@FeignClient(value = "feign-service-name", path = StuRpcService.path)
public interface StuRpcService {
    String path = "stu";

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    int add(@RequestParam("a") int a,@RequestParam("b")  int b);

    @RequestMapping(method = RequestMethod.GET, value = "/stringTest")
    String stringTest(Param param);

    @RequestMapping(method = RequestMethod.GET, value = "/resultTest")
    Result<List<Long>> resultTest(Param param);

}
