package br.cleilsonandrade.springviacep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringViacepApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringViacepApplication.class, args);
	}

}
