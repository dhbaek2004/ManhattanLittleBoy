package BaekInternational.ManhattanLittleBoy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManhattanLittleBoyApplication {

	private static final Logger logger = LoggerFactory.getLogger(ManhattanLittleBoyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ManhattanLittleBoyApplication.class, args);
		//System.out.println("Manhattan Project");
		//System.out.println("Branch Test");
		logger.info("Starting Manhattan Project");
	}

}