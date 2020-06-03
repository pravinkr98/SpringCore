package com.ps.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = { PresentationConfig.class,BusinessConfig.class,PersistanceConfig.class})
public class AppConfig {

}
