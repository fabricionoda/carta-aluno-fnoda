package alunocarta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class AlunoCarta {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AlunoCarta.class, args);
    }
}
