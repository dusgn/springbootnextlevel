package me.dusgn.springbootnextlevel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringbootnextlevelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootnextlevelApplication.class, args);
	}

}
