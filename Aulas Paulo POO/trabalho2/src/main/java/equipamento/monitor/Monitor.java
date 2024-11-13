package main.java.equipamento.monitor;

import main.java.equipamento.Equipamento;

public class Monitor extends Equipamento {

    private int resolucao;
    private boolean ips;

    @Override
    public void iniciarOperacao() {

        System.out.println("Mostrar algo");

    }

    public int getResolucao() {
        return resolucao;
    }

    public void setResolucao(int resolucao) {
        this.resolucao = resolucao;
    }

    public boolean isIps() {
        return ips;
    }

    public void setIps(boolean ips) {
        this.ips = ips;
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
