package revisao;

public class Revisao {

	private long id;
	private String dataatendimento;
	private String cliente;
	private String carro;
	private String funcionarioUsado;
	private String queixa;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDataatendimento() {
		return dataatendimento;
	}

	public void setDataatendimento(String dataatendimento) {
		this.dataatendimento = dataatendimento;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCarro() {
		return carro;
	}

	public void setCarro(String carro) {
		this.carro = carro;
	}

	public String getFuncionarioUsado() {
		return funcionarioUsado;
	}

	public void setFuncionarioUsado(String funcionarioUsado) {
		this.funcionarioUsado = funcionarioUsado;
	}

	public String getQueixa() {
		return queixa;
	}

	public void setQueixa(String queixa) {
		this.queixa = queixa;
	}

}
