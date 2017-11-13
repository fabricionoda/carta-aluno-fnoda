package alunocarta.controller;

import alunocarta.service.MalaDiretaAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("maladireta")
public class MalaDiretaController {

    @Autowired
    private MalaDiretaAlunoService malaDiretaAlunoServiceImpl;

    @PostMapping(value = "notificaralunosrisco", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> enviarEmailAlunosRiscoReprovacao() {
        return ResponseEntity.ok(malaDiretaAlunoServiceImpl.enviarEmailAlunosRiscoReprovacao());
    }
}
