package pessoa;

import jakarta.persistence.*;

@Entity
@Table(name = "tbPessoa")
public class Pessoa {

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cpf;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
