public class Passageiros extends Veiculo {

	private int lotacaoMax;

	public Passageiros(String placa, String modelo, int anoFab, int peso, String className, int lotacaoMax) {
        super(placa, modelo, anoFab, peso, className);
		this.lotacaoMax=lotacaoMax;
    }

}
