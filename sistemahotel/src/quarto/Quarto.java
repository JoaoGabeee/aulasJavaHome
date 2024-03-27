package quarto;


import quarto.cama.Cama;
import java.util.List;

public class Quarto {

    private int numeroQuarto;
    private TipoQuarto tipoQuarto;
    private int numeroCamas;

    private List<Cama> camas;

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public TipoQuarto getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(TipoQuarto tipoDeQuarto) {
        this.tipoQuarto = tipoDeQuarto;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

}
