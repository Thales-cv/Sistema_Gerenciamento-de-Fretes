public class TransporteCarga extends Veiculo {

	private double capacidadeCarga;
	private int numEixos;
	private boolean unidadeAcoplada;

	public TransporteCarga(String placa, String modelo, int anoFab, int peso, String className,
			double capacidadeCarga, int numEixos, boolean unidadeAcoplada) {
		super(placa, modelo, anoFab, peso, className);

		this.capacidadeCarga = capacidadeCarga;

		this.numEixos = numEixos;

		this.unidadeAcoplada = unidadeAcoplada;

	}


	public void calculoFreteTransporteCarga(boolean cargaPerigosa, int distancia, int numEixos){
		// km x numero de eixos x 1,20 carga normal
		if(cargaPerigosa==false){
			double valor = (distancia * numEixos * 1.20);
			System.out.print("R$" + valor);
		}else {
			double valor = (distancia * numEixos * 1.50);
			System.out.print("R$" + valor);
		}
		//km x numero de eixos x 1,50 carga perigosa

	}
}
