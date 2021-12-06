package src;
public class Manobrista extends Funcionario {

	private String numCNH;

	private String categoriaCNH;

	private String dataVenCNH;

	

	public Manobrista(String nome, String nascimento, String cpf, String numCNH, String categoriaCNH, String dataVenCNH) {
		super(nome, nascimento, cpf);
		this.numCNH = numCNH;
		this.categoriaCNH = categoriaCNH;
		this.dataVenCNH = dataVenCNH;
	}


	public String getNumCNH() {
		return numCNH;
	}

	public String getCategoriaCNH() {
		return categoriaCNH;
	}

	public int getDataVenCNH() {
		return dataVenCNH;
	}

}
