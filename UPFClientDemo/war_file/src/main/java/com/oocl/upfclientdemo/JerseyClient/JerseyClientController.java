package com.oocl.upfclientdemo.JerseyClient;



import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

@RestController
@RequestMapping()
public class JerseyClientController {

    private static final Logger LOGGER = LoggerFactory.getLogger(JerseyClientController.class);


    @GetMapping("/JerseyClientReadEntity")
    public String JerseyClient(String url){
        System.out.println("URL : "+url);
        Client client = ClientBuilder.newClient();
        long startTime=System.currentTimeMillis();
        Response response = client.target(url)
                .request(String.valueOf(MediaType.APPLICATION_JSON)).method("GET");
        String result=response.readEntity(String.class);
        System.out.println("response : "+response);
        long endTime=System.currentTimeMillis();
        LOGGER.debug("JerseyClientDemo Response return Time : "+ (endTime-startTime));
        return result;
    }

    @GetMapping("/JerseyClientGet")
    public String JerseyClientGet(String url){
        System.out.println("URL : "+url);
        Client client = ClientBuilder.newClient();
        long startTime=System.currentTimeMillis();
        Response response = client.target(url)
                .request(String.valueOf(MediaType.APPLICATION_JSON)).get();
        String result=response.readEntity(String.class);
        long endTime=System.currentTimeMillis();
        LOGGER.debug("JerseyClientDemo Response return Time : "+ (endTime-startTime));
        return result;
    }

    @GetMapping("/JerseyClientGetThenReturnEntity")
    @ResponseBody
    public Object JerseyClientGetThenReturnEntity(String url){
        System.out.println("URL : "+url);
        Client client = ClientBuilder.newClient();
        long startTime=System.currentTimeMillis();
        Response response = client.target(url)
                .request(String.valueOf(MediaType.APPLICATION_JSON)).get();
        Object result=response.getEntity().toString();
        long endTime=System.currentTimeMillis();
        LOGGER.debug("JerseyClientDemo Response return Time : "+ (endTime-startTime));
        return result;
    }

}
