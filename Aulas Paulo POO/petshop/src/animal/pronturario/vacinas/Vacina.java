package animal.pronturario.vacinas;

import java.time.LocalDate;

public class Vacina {

        private long id;
        private LocalDate dataAplicacao;
        private LocalDate vencimento;
        private String nome;
        private String marca;

        public long getId() {

                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public LocalDate getDataAplicacao() {
                return dataAplicacao;
        }

        public void setDataAplicacao(LocalDate dataAplicacao) {
                this.dataAplicacao = dataAplicacao;
        }

        public LocalDate getVencimento() {
                return vencimento;
        }

        public void setVencimento(LocalDate vencimento) {
                this.vencimento = vencimento;
        }

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
}
