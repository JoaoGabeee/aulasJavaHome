package funcionario;

import cliente.Cliente;
import quarto.Quarto;

public class Funcionario {

    private int matriculaFuncionario;
    private String nomeFuncionario;
    private long telefoneFuncionario;
    private String cargoFuncionario;

    public int getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(int matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public long getTelefoneFuncionario() {
        return telefoneFuncionario;
    }

    public void setTelefoneFuncionario(long telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }

    public String getCargoFuncionario() {
        return cargoFuncionario;
    }

    public void setCargoFuncionario(String cargoFuncionario) {
        this.cargoFuncionario = cargoFuncionario;
    }

    public boolean verificarQuartoOcupado(Quarto quarto){
        return false;
    }

    public void reservar(Quarto quarto, Cliente cliente){

    }
    public void inserir(Cliente cliente){

    }

    public void alterar(Cliente cliente)
    {

    }

}
