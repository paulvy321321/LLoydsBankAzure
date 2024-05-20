package com.lloyds.azure.lloydsazure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LloydsazureApplication {
	private static final Logger logger = LoggerFactory.getLogger(LloydsazureApplication.class);

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(LloydsazureApplication.class, args);

		/*int count = Runtime.getRuntime().availableProcessors();
		logger.info("count="+count);
		for (int i = 0; i < count; i++) {
			logger.info("Yes i going to sleep");
			new Thread(new Runnable() {
				public void run() {
					while (true) ;
				}
			}).start();*/
			double load = 0.8;
		logger.info("Yes!! i am going to sleep");
			Thread.sleep((long) Math.floor((1 - load) * 100000));
		logger.info("Yes!! i woke up");
		//}

	}
}