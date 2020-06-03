package com.ps.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.ps")
@ImportResource(locations = "com/ps/cfgs/applicationContext.xml")
public class AppConfig {

}
