package src;
import java.time.LocalDate;

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
	
	public String getNumCNH() {
		return numCNH;
	}

	public String getCategoriaCNH() {
		return categoriaCNH;
	}

	public LocalDate getDataVenCNH() {
		return dataVenCNH;
	}

	public boolean isCursoCP() {
		return cursoCP;
	}

	public boolean isCursoTP() {
		return cursoTP;
	}
	
}
