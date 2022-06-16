package manson112.TCCSVCAUTH;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TccSvcAuthApplication {
	public static void main(String[] args) {
		SpringApplication.run(TccSvcAuthApplication.class, args);
	}
}
