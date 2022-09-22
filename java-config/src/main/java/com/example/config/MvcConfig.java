package com.example.config;

import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.loader.Loader;
import com.mitchellbosecke.pebble.loader.ServletLoader;
import com.mitchellbosecke.pebble.spring.extension.SpringExtension;
import com.mitchellbosecke.pebble.spring.servlet.PebbleViewResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.ServletContext;

@Configuration(proxyBeanMethods = false)
@ComponentScan(basePackages = { "com.example.controller", "com.example.service" })
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/").setCachePeriod(31556926);
    }

    @Bean
    public PebbleEngine pebbleEngine(Loader<?> templateLoader,
                                     SpringExtension springExtension) {
        return new PebbleEngine.Builder()
                .loader(templateLoader)
                .extension(springExtension)
                .build();
    }

    @Bean
    public SpringExtension springExtension(MessageSource messageSource) {
        return new SpringExtension(messageSource);
    }

    @Bean
    public Loader<?> templateLoader(ServletContext servletContext) {
        return new ServletLoader(servletContext);
    }

    @Bean
    public ViewResolver viewResolver(PebbleEngine pebbleEngine) {
        PebbleViewResolver viewResolver = new PebbleViewResolver(pebbleEngine);
        viewResolver.setPrefix("/WEB-INF/templates/");
        viewResolver.setSuffix(".html");
        return viewResolver;
    }

}
