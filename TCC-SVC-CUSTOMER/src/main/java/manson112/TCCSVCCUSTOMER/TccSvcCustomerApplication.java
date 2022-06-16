package manson112.TCCSVCCUSTOMER;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TccSvcCustomerApplication {
	public static void main(String[] args) {
		SpringApplication.run(TccSvcCustomerApplication.class, args);
	}
}
