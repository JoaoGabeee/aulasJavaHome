package cliente;

import funcionario.Sexo;

public class Cliente {

	private long id;
	private String nome;
	private long cpf;
	private Sexo sexo;
	private String dataNascimento;
	private String possuiCarro;

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

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getPossuiCarro() {
		return possuiCarro;
	}

	public void setPossuiCarro(String possuiCarro) {
		this.possuiCarro = possuiCarro;
	}

	
	public static void agendarRevisao() {
		
	}
	
}
