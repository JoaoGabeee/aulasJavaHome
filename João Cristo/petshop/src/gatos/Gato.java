package gatos;

public class Gato {

	private String nome;
	private String dataNascimento;
	private SexoGato sexoGato;
	private String raca;
	private String vacina;

	public void getNome(String nome) {
		this.nome = nome;
	}

	public String setNome(String nome) {
		return nome;

	}

	public void getDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String setDatanascimento(String dataNascimento) {
		return dataNascimento;

	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public SexoGato getSexoGato() {
		return sexoGato;
	}

	public void setSexoGato(SexoGato sexoGato) {
		this.sexoGato = sexoGato;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getVacina() {
		return vacina;
	}

	public void setVacina(String vacina) {
		this.vacina = vacina;
	}

	public String getNome() {
		return nome;
	}

}
