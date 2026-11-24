package org.example;

public class CombustivelAdapter extends SensorTanque {

    private INivelCombustivel combustivelCategoria;

    public CombustivelAdapter(INivelCombustivel combustivelCategoria) {
        this.combustivelCategoria = combustivelCategoria;
    }

    public String recuperarNivel() {
        if (this.getLitros() >= 40)
            combustivelCategoria.setNivel("Cheio");
        else
        if (this.getLitros() >= 20)
            combustivelCategoria.setNivel("Meio");
        else
        if (this.getLitros() >= 5)
            combustivelCategoria.setNivel("Reserva");
        else
            combustivelCategoria.setNivel("Vazio");
        return combustivelCategoria.getNivel();
    }

    public void salvarNivel() {
        if (combustivelCategoria.getNivel().equals("Cheio"))
            this.setLitros(40);
        else
        if (combustivelCategoria.getNivel().equals("Meio"))
            this.setLitros(20);
        else
        if (combustivelCategoria.getNivel().equals("Reserva"))
            this.setLitros(5);
        else
            this.setLitros(0);
    }
}
