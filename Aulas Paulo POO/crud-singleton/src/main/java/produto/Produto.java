package produto;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "tbProduto")
public class Produto {

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String marca;

    @Column(nullable = false)
    private LocalDate dataFabricacao;

    @Column(nullable = false)
    private BigDecimal preco;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
