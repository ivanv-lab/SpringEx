package com.dbcrud;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringExApplication {
    public static final Logger log=
            (Logger) LoggerFactory.getLogger(SpringExApplication.class);

    public static void main(String[] args){
        SpringApplication.run(SpringExApplication.class,args);
    }


}
