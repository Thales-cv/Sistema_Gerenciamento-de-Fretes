import java.util.ArrayList;

public class CadastroFretes {

	private ArrayList<Fretamento> fretes;

	public void cadastroFrete() {
		fretes = new ArrayList<Fretamento>();
	}

	public String listHistorico() {
		return null;
	}

	public String listTop5() {
		return null;
	}

	public String listMotoristaLivres() {
		return null;
	}

	public String listVeiculosLivres() {
		return null;
	}

	public boolean cadastrarFretes(Fretamento frete) {
		return fretes.add(frete);
	}


}
