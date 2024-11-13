package gatos.prontuariomedico;

public class Exame {

	private String nome;
	private String dataRealizacao;
	private String local;
	private String nomeVeterinario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataRealizacao() {
		return dataRealizacao;
	}

	public void setDataRealizacao(String dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getNomeVeterinario() {
		return nomeVeterinario;
	}

	public void setNomeVeterinario(String nomeVeterinario) {
		this.nomeVeterinario = nomeVeterinario;
	}

}
