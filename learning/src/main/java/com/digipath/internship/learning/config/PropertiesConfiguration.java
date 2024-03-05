package com.digipath.internship.learning.config;

import com.digipath.internship.learning.config.properties.ApplicationProperties;
import com.digipath.internship.learning.config.properties.DataSourceProperties;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertiesConfiguration {
    @Bean
    @ConfigurationProperties(prefix = "learning.app")
    public ApplicationProperties applicationProperties() {
        return new ApplicationProperties();
    }

    @Bean
    @ConfigurationProperties(prefix = "learning.datasource")
    public DataSourceProperties dataSourceProperties() {
        return new DataSourceProperties();
    }

//
//    @Bean
//    @ConfigurationProperties(prefix = "learning.security")
//    public SecurityProperties securityProperties() {
//        return new SecurityProperties();
//    }

}
