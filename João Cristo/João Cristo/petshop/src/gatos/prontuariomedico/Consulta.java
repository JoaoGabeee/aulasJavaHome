package gatos.prontuariomedico;

import java.util.List;

public class Consulta {

	private String dataAtendimento;
	private String procedimento;
	private List<String> medicamentos;
	private Exame exame;

	public String getDataAtendimento() {
		return dataAtendimento;
	}

	public void setDataAtendimento(String dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}

	public String getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}

	public List<String> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<String> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

}
