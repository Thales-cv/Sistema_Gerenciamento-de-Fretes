import src.*;
public class UtilitariosCaminhao extends Fretamento {

	private boolean cargaPerigosa;

	public UtilitariosCaminhao(int id, Veiculo veiculo, Motorista condutor, String dataInicio, String dataTermino, 
	double distanciaPercorrida, double valorCobrado, boolean cargaPerigosa){

        super(id, veiculo, condutor, dataInicio, dataTermino, distanciaPercorrida, valorCobrado);

		this.cargaPerigosa=cargaPerigosa;
    }

	public boolean isCargaPerigosa() {
		return cargaPerigosa;
	}

	

	
}
