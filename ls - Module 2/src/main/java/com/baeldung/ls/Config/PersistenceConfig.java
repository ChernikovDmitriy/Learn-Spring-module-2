package com.baeldung.ls.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.baeldung.ls.persistence" })
public class PersistenceConfig {
    //
}