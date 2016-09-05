package com.ymatou.mongocrudservice;

import com.ymatou.mongocrudservice.InfraStructure.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@MapperScan(basePackages = {"com.ymatou.mongocrudservice.Repository"})
@Import({DynamicDataSourceRegister.class})
public class MongocrudserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongocrudserviceApplication.class, args);
	}
}
