public class Motorista extends Funcionario {

	private String numCNH;

	private String categoriaCNH;

	private LocalDate dataVenCNH;

	private boolean cursoCP;

	private boolean cursoTP;

	public Motorista(String nome, String nascimento, String cpf, String numCNH, String categoriaCNH, LocalDate dataVenCNH, boolean cursoCP, boolean cursoTP) {
		super(nome, nascimento, cpf);
		this.numCNH = numCNH;
		this.categoriaCNH = categoriaCNH;
		this.dataVenCNH = dataVenCNH;
		this.cursoCP = cursoCP;
		this.cursoTP = cursoTP;
	}
	
}
