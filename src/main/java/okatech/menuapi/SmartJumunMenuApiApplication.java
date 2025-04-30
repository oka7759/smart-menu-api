package okatech.menuapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SmartJumunMenuApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartJumunMenuApiApplication.class, args);
    }

}
