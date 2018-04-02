package com.rpcdemo.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.rpcdemo.demo.ResultInfo;
import com.rpcdemo.demo.service.RPCInterface;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DubboController {

    @Reference
    private RPCInterface rpcInterface;

    @RequestMapping("/dubbo")
    @ResponseBody
    public String errorNginxTest(){
        ResultInfo resultInfo=rpcInterface.getRPCInfo();
        return "result:"+resultInfo.getResultInfo();
    }
}
