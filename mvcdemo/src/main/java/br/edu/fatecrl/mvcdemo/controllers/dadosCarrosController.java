package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.Carro;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/carro")
public class dadosCarrosController {
    private  static final List<Carro> carros = new ArrayList<Carro>();

    public dadosCarrosController() {
        carros.add(new Carro("Azul", "Fiat", "Fox"));
        carros.add(new Carro("Preto", "Ford", "Cherry"));
        carros.add(new Carro("Cinza", "Toyota", "Gol"));
    }

    @GetMapping()
    public List<Carro> GetCarros(){ return carros; }
}