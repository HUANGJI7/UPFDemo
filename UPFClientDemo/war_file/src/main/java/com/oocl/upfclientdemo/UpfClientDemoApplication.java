package com.oocl.upfclientdemo;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.http.HttpStatus;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@RequestMapping
public class UpfClientDemoApplication extends SpringBootServletInitializer implements WebApplicationInitializer {


    private static final Logger LOGGER = LoggerFactory.getLogger(UpfClientDemoApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(UpfClientDemoApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(UpfClientDemoApplication.class);
    }
    @GetMapping("/demo204")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String demo204(){
        LOGGER.debug("SpringBoot demo return status : 204");
        return null;
    }

    @GetMapping("/demo200")
    @ResponseStatus(HttpStatus.OK)
    public String demo200(){
        LOGGER.debug("SpringBoot demo return status : "+HttpStatus.OK);
        return "SpringBoot demo return status :"+HttpStatus.OK;
    }

}
