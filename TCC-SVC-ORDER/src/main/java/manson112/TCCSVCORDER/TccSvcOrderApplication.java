package manson112.TCCSVCORDER;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TccSvcOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TccSvcOrderApplication.class, args);
	}

}
