public class Manobrista extends Funcionario {

	private String numCNH;

	private String categoriaCNH;

	private LocalDate dataVenCNH;

	public Manobrista(String nome, String nascimento, String cpf, String numCNH, String categoriaCNH, LocalDate dataVenCNH) {
		super(nome, nascimento, cpf);
		this.numCNH = numCNH;
		this.categoriaCNH = categoriaCNH;
		this.dataVenCNH = dataVenCNH;
	}

	
}
