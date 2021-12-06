import java.util.ArrayList;

public class CadastroVeiculos {

	private ArrayList<Veiculo> veiculos;

	public CadastroVeiculos() {
		veiculos = new ArrayList<Veiculo>();
	}

	public String listAno() {
		
		return null;
	}

	public Veiculo buscarPlaca(String placa) {
		for (int i = 0; i < veiculos.size(); i++) {
			if (veiculos.get(i).getPlaca() == placa) {
				return veiculos.get(i);
			}
		}
		return null;
	}

	public String listarVeiculos() {
		
	}

	public boolean cadastrarVeiculo(Veiculo veiculo) {
		return veiculos.add(veiculo);
	}

}
public void listAlfa() { // mandar p thales 
	Set<String> nomes = new TreeSet<String>();
	for(int i=0; i<veiculo.size(); i++){
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
