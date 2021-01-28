package com.globits.da.view;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
public class ThymeleafConfig {

    @Bean
    public ClassLoaderTemplateResolver secondaryTemplateResolver() {
        ClassLoaderTemplateResolver secondaryTemplateResolver = new ClassLoaderTemplateResolver();
        //secondaryTemplateResolver.setPrefix("home/");
        //secondaryTemplateResolver.setPrefix("/");
        //secondaryTemplateResolver.setPrefix("vinazine-template/");
        //secondaryTemplateResolver.setPrefix("studypress-template/");
        secondaryTemplateResolver.setPrefix("nuce-new-template/");
        secondaryTemplateResolver.setSuffix(".html");
        secondaryTemplateResolver.setTemplateMode(TemplateMode.HTML);
        secondaryTemplateResolver.setCharacterEncoding("UTF-8");
        secondaryTemplateResolver.setOrder(1);
        secondaryTemplateResolver.setCheckExistence(true);
        secondaryTemplateResolver.setCacheable(false);
        return secondaryTemplateResolver;
    }
}
