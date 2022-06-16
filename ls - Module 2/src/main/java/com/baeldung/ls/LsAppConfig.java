package com.baeldung.ls;

import com.baeldung.ls.Service.IProjectService;
import com.baeldung.ls.Service.ProjectServiceImplSetterInjection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LsAppConfig {

    @Bean
    public IProjectService projectServiceImplSetterInjection() {
        return new ProjectServiceImplSetterInjection();
    }
}