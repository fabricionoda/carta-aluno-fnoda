package alunocarta.controller;

import alunocarta.model.MalaDiretaAluno;
import alunocarta.service.MalaDiretaAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("maladireta")
public class MalaDiretaController {

    @Autowired
    MalaDiretaAlunoService malaDiretaAlunoService;

    @PostMapping(value = "alunosrisco", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, MalaDiretaAluno> getAlunosRisco() {
        return malaDiretaAlunoService.alunosRiscoReprovacao();
    }

}
