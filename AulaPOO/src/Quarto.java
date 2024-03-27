public class Quarto {

    private int numeroQuarto;
    private TipoDeQuarto tipoDeQuarto;
    private int numeroDeCamasQuarto;

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public TipoDeQuarto getTipoDeQuarto() {
        return tipoDeQuarto;
    }

    public void setTipoDeQuarto(TipoDeQuarto tipoDeQuarto) {
        this.tipoDeQuarto = tipoDeQuarto;
    }

    public int getNumeroDeCamasQuarto() {
        return numeroDeCamasQuarto;
    }

    public void setNumeroDeCamasQuarto(int numeroDeCamasQuarto) {
        this.numeroDeCamasQuarto = numeroDeCamasQuarto;
    }

    public TipoDeCama getTipoDeCama() {
        return tipoDeCama;
    }

    public void setTipoDeCama(TipoDeCama tipoDeCama) {
        this.tipoDeCama = tipoDeCama;
    }

    private TipoDeCama tipoDeCama;
}
