package src;
import LocalDate;
import String;

public class Manobrista extends Funcionario {

	private String numCNH;

	private String categoriaCNH;

	private int dataVenCNH;

	

	public Manobrista(String nome, String nascimento, String cpf, String numCNH, String categoriaCNH, int dataVenCNH) {
		super(nome, nascimento, cpf);
		this.numCNH = numCNH;
		this.categoriaCNH = categoriaCNH;
		this.dataVenCNH = dataVenCNH;
	}

	
}