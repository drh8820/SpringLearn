package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration /*取代xml配置，纯注解开发*/
@ComponentScan("org.example") /*扫描路径下所有注解*/
public class SpringConfig {
}
