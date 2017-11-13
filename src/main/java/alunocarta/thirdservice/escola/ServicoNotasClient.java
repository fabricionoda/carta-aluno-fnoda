package alunocarta.thirdservice.escola;

import alunocarta.thirdservice.escola.model.Boletim;
import alunocarta.thirdservice.escola.model.BoletimResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ServicoNotasClient {

    public static final String HTTP_BOLETIM_MOCK = "http://www.mocky.io/v2/5a0892693200000807137ffc";

    @Autowired
    private RestTemplate restTemplate;

    public List<Boletim> boletins() {
        return restTemplate.getForObject(HTTP_BOLETIM_MOCK, BoletimResponse.class).getBoletins();
    }
}
