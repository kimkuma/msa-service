package com.kuma04.msa.spring.config;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    static final String h2DbWebConsoleContext = "/console/*";

    @Bean
    ServletRegistrationBean h2servletRegistration() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new WebServlet());
        servletRegistrationBean.addUrlMappings(h2DbWebConsoleContext);
        return servletRegistrationBean;
    }
}
