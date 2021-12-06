package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CadastraF {
	private int id;
	private ArrayList<Funcionario> funcionarios;

	public CadastraF(int id) {
		this.id = id;
		funcionarios = new ArrayList<Funcionario>();
	}

	public void listAlfa() { // mandar p thales 
		Set<String> nomes = new TreeSet<String>();
		for(int i=0; i<funcionarios.size(); i++){
			String nome = funcionarios.get(i).getNome();
			nomes.add(nome);
		}
		
        System.out.println(nomes);
        
        int n = nomes.size();

        List<String> list = new ArrayList<String>(nomes);

        for( String ele : list ){
            System.out.print(ele + " " );
        }

        for(int i=0; i<list.size(); i++){
            buscarNome(list.get(i));
        }
        
	}

    public Funcionario buscarNome(String nomeBuscado) {
		for (int i = 0; i < funcionarios.size(); i++) {
			if (funcionarios.get(i).getNome() == nomeBuscado) {
				Funcionario a = funcionarios.get(i);
                System.out.println(a.toString());
			}
		}
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
