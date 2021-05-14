package com.jk.ssmrr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@MapperScan("com.jk.ssmrr.mapper")
public class SsmrrApplication {



    public static void main(String[] args) {
        SpringApplication.run(SsmrrApplication.class, args);
    }

}
