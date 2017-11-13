package alunocarta;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlunoCartaTests {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void context_loads() {
        assertThat(restTemplate).isNotNull();
    }

}
