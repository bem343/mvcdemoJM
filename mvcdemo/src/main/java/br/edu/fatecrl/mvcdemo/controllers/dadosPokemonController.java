package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.CartaPokemon;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/pokemon")
public class dadosPokemonController {
    private  static final List<CartaPokemon> cartas = new ArrayList<CartaPokemon>();

    public dadosPokemonController() {
        cartas.add(new CartaPokemon("Pikachu","Elétrico",10));
        cartas.add(new CartaPokemon("Bubasalro","Planta",5));
        cartas.add(new CartaPokemon("Piplup","Água",3));
    }

    @GetMapping()
    public List<CartaPokemon> GetAlunos(){
        return cartas;
    }
}
