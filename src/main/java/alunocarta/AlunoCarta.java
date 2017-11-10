package alunocarta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class AlunoCarta {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AlunoCarta.class, args);
    }

    @PostMapping(value = "/maladireta", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String maladireta() {
        return "";
    }
}
