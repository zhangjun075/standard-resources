package com.xx.tars;

import feign.Request;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;


/**
 * @Author: junzhang
 * @Description:
 * @Date: 2018/10/31 10:46 AM
 **/

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
public class MerchantRebateBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(MerchantRebateBootstrap.class,args);
    }

    /**
     * @Description: 配置feign的连接超时(10s)和读取超时(4s)
     * @params: []
     * @return: feign.Request.Options
     **/
    @Bean
    Request.Options options() {
        return new Request.Options(1000*10,4*1000);
    }
}
