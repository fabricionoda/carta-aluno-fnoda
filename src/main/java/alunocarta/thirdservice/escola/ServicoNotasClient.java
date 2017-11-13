package alunocarta.thirdservice.escola;

import alunocarta.thirdservice.escola.model.Boletim;
import alunocarta.thirdservice.escola.model.BoletimResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ServicoNotasClient {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${boletim.endpoint.url}")
    private String url;

    public List<Boletim> boletins() {
        return restTemplate.getForObject(url, BoletimResponse.class).getBoletins();
    }
}
