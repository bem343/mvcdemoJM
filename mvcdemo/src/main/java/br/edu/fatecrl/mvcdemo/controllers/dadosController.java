package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.Aluno;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/aluno")
public class dadosController {

    private  static final List<Aluno> alunos = new ArrayList<Aluno>();

    public dadosController() {
        alunos.add(new Aluno("Matheus Ladislau","POO",10,8));
        alunos.add(new Aluno("João Marcus","ENG",5,5));
        alunos.add(new Aluno("Felipe dos Santos","MAT",3,4));
    }

    @GetMapping()
    public List<Aluno> GetAlunos(){
        return alunos;
    }
}
