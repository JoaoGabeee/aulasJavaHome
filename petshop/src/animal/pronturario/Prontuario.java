package animal.pronturario;

import animal.pronturario.vacinas.Vacina;
import pessoa.veterinario.Veterinario;

import java.time.LocalDate;
import java.util.List;

public class Prontuario {

    private long id;
    private LocalDate dataAtendimentro;
    private String queixa;
    private Veterinario veterinarioResponsavel;
    private String procedimentoRealizado;
    private List<Medicamento> medicamentos;

    public List<Vacina> getVacinas() {
        return vacinas;
    }

    public void setVacinas(List<Vacina> vacinas) {
        this.vacinas = vacinas;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getProcedimentoRealizado() {
        return procedimentoRealizado;
    }

    public void setProcedimentoRealizado(String procedimentoRealizado) {
        this.procedimentoRealizado = procedimentoRealizado;
    }

    public Veterinario getVeterinarioResponsavel() {
        return veterinarioResponsavel;
    }

    public void setVeterinarioResponsavel(Veterinario veterinarioResponsavel) {
        this.veterinarioResponsavel = veterinarioResponsavel;
    }

    public String getQueixa() {
        return queixa;
    }

    public void setQueixa(String queixa) {
        this.queixa = queixa;
    }

    public LocalDate getDataAtendimentro() {
        return dataAtendimentro;
    }

    public void setDataAtendimentro(LocalDate dataAtendimentro) {
        this.dataAtendimentro = dataAtendimentro;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private List<Vacina> vacinas;

}
