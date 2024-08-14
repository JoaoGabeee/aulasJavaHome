package main.java.equipamento;

import main.java.gerenciavel.Gerenciavel;

public abstract class Equipamento implements Gerenciavel {

    protected long id;
    protected String nome;
    protected String marca;
    protected String modelo;

    public void mostrarIndentificacao() {

        System.out.println(id + "\n" + nome + "\n" + marca + "\n" + modelo);

    }

    public abstract void iniciarOperacao();

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
