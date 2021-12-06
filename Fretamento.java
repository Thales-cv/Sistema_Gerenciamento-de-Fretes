import java.time.LocalDate;
import src.*;

public class Fretamento {

	private int id;
	private Veiculo veiculo;
	private Motorista condutor;
	private LocalDate dataInicio;
	private LocalDate dataTermino;
	private double distanciaPercorrida;
	private double valorCobrado;

	public Fretamento(int id, Veiculo veiculo, Motorista condutor, LocalDate dataInicio, LocalDate dataTermino, 
	double distanciaPercorrida, double valorCobrado) {
		this.id = id;
		this.veiculo = veiculo;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.valorCobrado = valorCobrado;
		this.distanciaPercorrida = distanciaPercorrida;
		this.condutor = condutor;
		}
}

 