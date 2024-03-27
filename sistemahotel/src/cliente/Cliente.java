package cliente;

import quarto.Quarto;

import java.util.List;

public class Cliente {

    private int codigoCliente;
    private String nomeCliente;
    private long rgCliente;
    private String enderecoCliente;
    private long telefoneCliente;

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public long getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(long rgCliente) {
        this.rgCliente = rgCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public long getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(long telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public void reservar(List<Quarto> quartos){

    }
}
