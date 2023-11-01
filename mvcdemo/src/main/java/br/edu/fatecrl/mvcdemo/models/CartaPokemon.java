package br.edu.fatecrl.mvcdemo.models;

public class CartaPokemon {
    private String Nome;
    private String Tipo;
    private int Dano;

    public CartaPokemon(String nome, String tipo, int dano) {
        Nome = nome;
        Tipo = tipo;
        Dano = dano;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getDano() {
        return Dano;
    }

    public void setDano(int dano) {
        Dano = dano;
    }
}
