package com.dubbox.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by frinder6 on 2017/2/15.
 */
@Configuration
@ImportResource("classpath*:applicationContext-dubbo.xml")
public class DubboxServiceRegister {
}
