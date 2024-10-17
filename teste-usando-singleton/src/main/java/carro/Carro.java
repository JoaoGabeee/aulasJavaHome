package carro;

import jakarta.persistence.*;

@Entity
@Table(name = "tbCarro")
public class Carro {

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String placa;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
