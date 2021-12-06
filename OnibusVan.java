import java.time.LocalDate;
import src.*;

public class OnibusVan extends Fretamento {

    public OnibusVan(int id, OnibusVan veiculo, Motorista condutor, LocalDate dataInicio, LocalDate dataTermino, 
	double distanciaPercorrida, double valorCobrado){
        super(id, veiculo, condutor, dataInicio, dataTermino, distanciaPercorrida, valorCobrado);
		int capacidade = veiculo.getLotacaoMax();
	}

    public void calculoFreteOnibusVan(int capacidade, int diasViagem, int distancia){
		

		if(capacidade<=15){
			double valor = ((diasViagem * 410)+(distancia* 2.20));
			System.out.print("R$" + valor);
		}else if(capacidade<=26){
			double valor = ((diasViagem * 490)+(distancia* 2.80));
			System.out.print("R$" + valor);
		}else{
			double valor = ((diasViagem * 560)+(distancia* 3));
			System.out.print("R$" + valor);
		}
	}




}
