package ar.alefuentes.study.tooldataale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToolDataAleApplication {

	public static void main(String[] args) {

		System.out.println("[ALE] FROM main: starting...");
		SpringApplication.run(ToolDataAleApplication.class, args);
	}

}
