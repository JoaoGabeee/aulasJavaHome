package main.java.equipamento.maquinaxerox;

import main.java.equipamento.Equipamento;

public class MaquinaXerox extends Equipamento {

    private int capacidadeFolhas;
    private Tipo tipo;

    @Override
    public void iniciarOperacao() {
        System.out.println("Copiar");
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getCapacidadeFolhas() {
        return capacidadeFolhas;
    }

    public void setCapacidadeFolhas(int capacidadeFolhas) {
        this.capacidadeFolhas = capacidadeFolhas;
    }

    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }

    @Override
    public void mostrarStatus() {

    }
}
