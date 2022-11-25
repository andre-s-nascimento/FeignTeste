package org.snascimento.feignteste01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignTesteApplication {
    public static void main(String[] args){
        SpringApplication.run(FeignTesteApplication.class, args);
    }
}
