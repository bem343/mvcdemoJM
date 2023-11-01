package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.CartaPokemon;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/pokemon")
public class PokemonsController {
    private  static final List<CartaPokemon> cartas = new ArrayList<CartaPokemon>();

    public PokemonsController() {
        cartas.add(new CartaPokemon("Pikachu","Elétrico",10));
        cartas.add(new CartaPokemon("Bubasalro","Planta",5));
        cartas.add(new CartaPokemon("Piplup","Água",3));
    }

    @GetMapping()
    public String GetAlunos(Model model){
        model.addAttribute("cartas", cartas);
        return "cartas";
    }
}
