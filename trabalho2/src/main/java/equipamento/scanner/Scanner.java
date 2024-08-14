package main.java.equipamento.scanner;

import main.java.equipamento.Equipamento;
import main.java.equipamento.maquinaxerox.Tipo;

public class Scanner extends Equipamento {

    private int velocidadeDigitalizacao;
    private Tipo tipo;

    @Override
    public void iniciarOperacao() {
        System.out.println("Scanear");
    }

    public int getVelocidadeDigitalizacao() {
        return velocidadeDigitalizacao;
    }

    public void setVelocidadeDigitalizacao(int velocidadeDigitalizacao) {
        this.velocidadeDigitalizacao = velocidadeDigitalizacao;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
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
