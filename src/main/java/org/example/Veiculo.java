package org.example;

public class Veiculo {

    INivelCombustivel nivel;
    CombustivelAdapter tanque;

    public Veiculo() {
        nivel = new CombustivelCategoria();
        tanque = new CombustivelAdapter(nivel);
    }

    public void setNivel(String categoria) {
        nivel.setNivel(categoria);
        tanque.salvarNivel();
    }

    public String getNivel() {
        return tanque.recuperarNivel();
    }

    public int getLitros() {
        return tanque.getLitros();
    }
}
