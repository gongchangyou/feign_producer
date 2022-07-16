package com.mouse.feigndemo.intf;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
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

    /**
     * 加法 简单的多个入参
     * @param a
     * @param b
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    int add(@RequestParam("a") int a,@RequestParam("b")  int b);

    /**
     * 复杂的入参 对象
     * @param param
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/stringTest")
    String stringTest(@RequestBody Param param);

    /**
     * 复杂的出入参
     * @param param
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/resultTest")
    Result<List<Long>> resultTest(@RequestBody Param param);

}
