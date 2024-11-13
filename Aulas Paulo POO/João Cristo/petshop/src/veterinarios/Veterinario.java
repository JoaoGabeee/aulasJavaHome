package veterinarios;

public class Veterinario {

	private String nome;
	private int numeroCrv;
	private long telefoneresidencial;
	private long telefoneCelular;
	private EnderecoVeterinario enderecoVeterinario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroCrv() {
		return numeroCrv;
	}

	public void setNumeroCrv(int numeroCrv) {
		this.numeroCrv = numeroCrv;
	}

	public long getTelefoneresidencial() {
		return telefoneresidencial;
	}

	public void setTelefoneresidencial(long telefoneresidencial) {
		this.telefoneresidencial = telefoneresidencial;
	}

	public long getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(long telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public EnderecoVeterinario getEnderecoVeterinario() {
		return enderecoVeterinario;
	}

	public void setEnderecoVeterinario(EnderecoVeterinario enderecoVeterinario) {
		this.enderecoVeterinario = enderecoVeterinario;
	}

}
