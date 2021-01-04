package com.shangma.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author shangmaxueyuan
 * @create 2021-01-04 17:17
 */
@SpringBootApplication
@MapperScan(basePackages = "com.shangma.cn.mapper")
@EnableTransactionManagement
public class CrmProject {
    public static void main(String[] args) {
        SpringApplication.run(CrmProject.class);
    }
}
