package org.example;

public class CombustivelCategoria implements INivelCombustivel {

    private String nivel;

    @Override
    public String getNivel() {
        return this.nivel;
    }

    @Override
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
