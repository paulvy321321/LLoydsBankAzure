package com.lloyds.azure.lloydsazure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages={"com.lloyds.azure.lloydsazure"})
@EnableJpaRepositories(basePackages= "com.lloyds.azure.lloydsazure.paymentRepository")
public class LloydsazureApplication {
	private static final Logger logger = LoggerFactory.getLogger(LloydsazureApplication.class);

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(LloydsazureApplication.class, args);


			/*double load = 0.8;
		logger.info("Yes!! i am going to sleep");
			Thread.sleep((long) Math.floor((1 - load) * 100000));
		logger.info("Yes!! i woke up");*/
		//}

	}
}