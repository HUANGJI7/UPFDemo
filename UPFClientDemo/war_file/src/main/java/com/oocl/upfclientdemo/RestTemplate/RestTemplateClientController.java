package com.oocl.upfclientdemo.RestTemplate;


import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplateClientController {



    private static final Logger LOGGER = LoggerFactory.getLogger(RestTemplateClientController.class);


    @GetMapping("/RestTemplateGetForEntity")
    public String RestTemplateGetForEntity(String url){
        RestTemplate restTemplate = new RestTemplate();
        long startTime=System.currentTimeMillis();
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        long endTime=System.currentTimeMillis();
        LOGGER.debug("RestTemplate Response Return Time : "+(endTime-startTime));
        return response.toString();
    }

}
