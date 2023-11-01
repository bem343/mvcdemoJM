package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.Carro;
import br.edu.fatecrl.mvcdemo.models.CartaPokemon;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/carro")
public class CarrosController {
    private  static final List<Carro> carros = new ArrayList<Carro>();

    public CarrosController() {
        carros.add(new Carro("Azul", "Fiat", "Fox"));
        carros.add(new Carro("Preto", "Ford", "Cherry"));
        carros.add(new Carro("Cinza", "Toyota", "Gol"));
    }

    @GetMapping()
    public String GetCarros(Model model){
        model.addAttribute("Carro", carros);
        return "carros";
    }
}

