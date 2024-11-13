package main.java.veiculo.caminhao;

import main.java.veiculo.Veiculo;

public class Caminhao extends Veiculo {

    private int quantidadeEixos;
    private Cabine cabine;

    @Override
    public void efetuarRevisao() {

    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    public Cabine getCabine() {
        return cabine;
    }

    public void setCabine(Cabine cabine) {
        this.cabine = cabine;
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
