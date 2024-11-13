package pessoa.proprietario;

import pessoa.Pessoa;

import java.time.LocalDate;

public class Proprietario extends Pessoa {

    private LocalDate dataNascimento;
    private Sexo sexo;

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
