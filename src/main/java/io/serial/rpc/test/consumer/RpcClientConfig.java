package io.serial.rpc.test.consumer;

import io.serial.rpc.config.RpcConsumerConfig;
import io.serial.rpc.RpcProxyFactory;
import io.serial.rpc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: therpc
 * @description:
 * @author: sawyer
 * @create: 2020-07-05 15:24
 **/
@Configuration
public class RpcClientConfig extends RpcConsumerConfig {

    @Autowired
    RpcProxyFactory rpcProxyFactory;

    @Bean
    HelloService helloService() {
        return rpcProxyFactory.create(HelloService.class);
    }
}
