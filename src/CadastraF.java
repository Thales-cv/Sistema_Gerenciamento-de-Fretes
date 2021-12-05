package src;

import java.util.ArrayList;

public class CadastraF {
	private int id;
	private ArrayList<Funcionario> funcionarios;

	public CadastraF(int id) {
		this.id = id;
		funcionarios = new ArrayList<Funcionario>();
	}

	public String listAlfa() {
		return null;
	}

	public Funcionario buscarCPF(String cpf) {
		for (int i = 0; i < funcionarios.size(); i++) {
			if (funcionarios.get(i).getCpf() == cpf) {
				return funcionarios.get(i);
			}
		}
		return null;
	}

	public String listMotoristas() {
		return null;
	}

	public boolean cadastarFuncionario(Funcionario funcionario) {
		return funcionarios.add(funcionario);

	}

}
