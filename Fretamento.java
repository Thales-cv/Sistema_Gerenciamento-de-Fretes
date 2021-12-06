import src.Motorista;

public class Fretamento {

	private int id;

	private Veiculo veiculo;

	private Motorista condutor;

	private String dataInicio;

	private String dataTermino;

	private double distanciaPercorrida;

	private double valorCobrado;

	public void fretamento(int id, Veiculo veiculo, int condutor, String dataInicio, String dataTermino, double distanciaPercorrisa, double valorCobrado) {
		this.id=id;
		this.veiculo=veiculo;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.valorCobrado = valorCobrado;
		// condutor - distancia percorrida
	}

}
