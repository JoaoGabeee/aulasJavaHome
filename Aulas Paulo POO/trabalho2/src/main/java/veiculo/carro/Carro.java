package main.java.veiculo.carro;

import main.java.veiculo.Veiculo;

public class Carro extends Veiculo {

    private int potencia;
    private int quantidadePortas;

    @Override
    public void efetuarRevisao() {

    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
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
