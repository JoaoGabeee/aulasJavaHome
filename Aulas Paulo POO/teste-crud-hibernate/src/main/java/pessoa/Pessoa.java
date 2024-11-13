package pessoa;

import jakarta.persistence.*;

@Entity
@Table(name = "tbPessoa")
public class Pessoa {

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private int idade;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
