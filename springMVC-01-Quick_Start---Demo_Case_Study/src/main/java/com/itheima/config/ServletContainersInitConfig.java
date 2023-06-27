package com.itheima.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @author Mendy
 * @create 2023-06-27 12:42
 */
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {

    // Load the SpringMVC configuration class
    protected WebApplicationContext createServletApplicationContext() {
        // Initialize the WebApplicationContext object
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();

        // Load the specified configuration class
        ctx.register(SpringMvcConfig.class);

        return ctx;
    }




    // Set the requested mapping paths handled by SpringMVC controller
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


    // Load the Spring configuration class
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }

}

