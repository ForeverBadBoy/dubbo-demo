package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.demo.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.alibaba.dubbo.rpc.RpcContext;

/**
 * Created by BadBoy on 2018/5/5.
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }
}
