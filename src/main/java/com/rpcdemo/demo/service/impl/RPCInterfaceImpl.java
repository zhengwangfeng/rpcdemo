package com.rpcdemo.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.rpcdemo.demo.ResultInfo;
import com.rpcdemo.demo.service.RPCInterface;
import org.springframework.stereotype.Service;

@Service
public class RPCInterfaceImpl implements RPCInterface {
//    /**
//     * 调用远程接口的实现类
//     */
//    @Reference
//    private RPCInterface RPCInterfaceImpl;

    @Override
    public ResultInfo getRPCInfo() {
//        ResultInfo resultInfo=RPCInterfaceImpl.getRPCInfo();
        return null;
    }
}
