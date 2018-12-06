package com.wenhao.microservice.microservicecustommovieribbon.microservice.config;

import com.wenhao.microservice.microservicecustommovieribbon.config.RibbonConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "microservice-provider-user", configuration = RibbonConfiguration.class)
public class TestConfiguration {
}
