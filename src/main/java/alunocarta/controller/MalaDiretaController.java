package alunocarta.controller;

import alunocarta.service.MalaDiretaAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("maladireta")
public class MalaDiretaController {

    @Autowired
    MalaDiretaAlunoService malaDiretaAlunoService;

    @PostMapping(value = "notificaralunosrisco", produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer enviarEmailAlunosRiscoReprovacao() {
        return malaDiretaAlunoService.enviarEmailAlunosRiscoReprovacao();
    }

}
