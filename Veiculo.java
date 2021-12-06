public class Veiculo {

	private String placa;

	private String modelo;

	private int anoFab;

	private double peso;

	public Veiculo(String placa, String modelo, int anoFab, int peso, String className) {
		this.placa=placa;
		this.modelo=modelo;
		this.anoFab=anoFab;
		this.peso=peso;
	}

	public String getPlaca() {
		return placa;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAnoFab() {
		return anoFab;
	}

	public double getPeso() {
		return peso;
	}
}
