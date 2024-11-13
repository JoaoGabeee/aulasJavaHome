package animal.pronturario;

import pessoa.veterinario.Veterinario;

import java.time.LocalDate;

public class Exame {

    private long id;
    private String nome;
    private LocalDate dataRealizacao;
    private String localRealizado;
    private Veterinario veterinarioResponsavel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(LocalDate dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public String getLocalRealizado() {
        return localRealizado;
    }

    public void setLocalRealizado(String localRealizado) {
        this.localRealizado = localRealizado;
    }

    public Veterinario getVeterinarioResponsavel() {
        return veterinarioResponsavel;
    }

    public void setVeterinarioResponsavel(Veterinario veterinarioResponsavel) {
        this.veterinarioResponsavel = veterinarioResponsavel;
    }
}
