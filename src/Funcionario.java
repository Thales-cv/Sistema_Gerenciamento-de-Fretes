package src;

public class Funcionario {

	public String nome;
	public String nascimento;// Não sei usar o formato Local Date no Array
	public String cpf;

	public Funcionario(String nome, String nascimento, String cpf) {
		this.nome=nome;
		this.nascimento=nascimento;
		this.cpf=cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getNascimento() {
		return nascimento;
	}
	public String getCpf() {
		return cpf;
	}
	
	
}