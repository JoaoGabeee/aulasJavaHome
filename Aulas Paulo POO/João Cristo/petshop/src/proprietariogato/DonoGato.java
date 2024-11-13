package proprietariogato;

import java.util.List;

public class DonoGato {

	private String nome;
	private String dataNascimento;
	private long telefoneResidencial;
	private long telefoneCelular;
	private long telefoneComercial;
	private SexoDono sexoDono;
	private List<EnderecoPropietario> enderecosProprietario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public long getTelefoneResidencial() {
		return telefoneResidencial;
	}

	public void setTelefoneResidencial(long telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}

	public long getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(long telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public long getTelefoneComercial() {
		return telefoneComercial;
	}

	public void setTelefoneComercial(long telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}

	public SexoDono getSexoDono() {
		return sexoDono;
	}

	public void setSexoDono(SexoDono sexoDono) {
		this.sexoDono = sexoDono;
	}

	public List<EnderecoPropietario> getEnderecosProprietario() {
		return enderecosProprietario;
	}

	public void setEnderecosProprietario(List<EnderecoPropietario> enderecosProprietario) {
		this.enderecosProprietario = enderecosProprietario;
	}

}
