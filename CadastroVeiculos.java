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
