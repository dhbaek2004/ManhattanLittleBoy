package BaekInternational.ManhattanLittleBoy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ManhattanLittleBoyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManhattanLittleBoyApplication.class, args);
		log.info("Starting Manhattan Project");
	}

}