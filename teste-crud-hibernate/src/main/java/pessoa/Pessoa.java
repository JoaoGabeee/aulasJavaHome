package pessoa;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = tbPessoa)
public class Pessoa {

private String nome;
private int idade;
private long cpf;


}
