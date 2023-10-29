package br.gov.sp.fatec.projetospring.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;



@RestController
@RequestMapping(value = "/turma")
@CrossOrigin
public class turmaController {

    @Autowired
    private turmaService turmaService;

    @GetMapping("/todos")
    public List<Turma> todos() {
        return turmaService.todasAsTurmas();
    }

    @GetMapping("/buscarPorAnoETamanho")
    public List<Turma> buscarPorAnoETamanho(@RequestParam Integer ano, @RequestParam Integer tamanho) {
        return turmaService.buscarTurmasPorAnoETamanho(ano, tamanho);
    }

    
    @PostMapping("/cadastro")
    public ResponseEntity<Turma> cadastrarTurma(@RequestBody Turma turma) {
        Turma novaTurma = turmaService.cadastrarTurma(turma);
        return new ResponseEntity<>(novaTurma, HttpStatus.CREATED);
    }
}

