package funcionario;

import funcionario.beneficio.Beneficio;

public class Funcionario {

	private String nome;
	private long rg;
	private String dataNascimento;
	private ContratoFuncionario contratoFuncionario;
	private String cargo;
	private String funcao;
	private Sexo sexo;
	private EstadoCivil estadoCivil;
	private Endereco endereco;
	private GrauInstrucao grauInstrucao;
	private double salarioBruto;
	private Beneficio beneficio;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public ContratoFuncionario getContratoFuncionario() {
		return contratoFuncionario;
	}

	public void setContratoFuncionario(ContratoFuncionario contratoFuncionario) {
		this.contratoFuncionario = contratoFuncionario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public GrauInstrucao getGrauInstrucao() {
		return grauInstrucao;
	}

	public void setGrauInstrucao(GrauInstrucao grauInstrucao) {
		this.grauInstrucao = grauInstrucao;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public Beneficio getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(Beneficio beneficio) {
		this.beneficio = beneficio;
	}
	
	public static void agendarRevisao( ) {
		
		
	}

}
