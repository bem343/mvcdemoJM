package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/aluno")
public class AlunoController {

    private  static final List<Aluno> alunos = new ArrayList<Aluno>();

    public AlunoController() {
        alunos.add(new Aluno("João","POO",10,8));
        alunos.add(new Aluno("Maria","ENG",5,5));
        alunos.add(new Aluno("José","MAT",3,4));
    }

    @GetMapping()
    public String GetAlunos(Model model){
        model.addAttribute("alunos", alunos);
        return "alunos";
    }
}
