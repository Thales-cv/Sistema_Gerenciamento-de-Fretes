package develop;
import src.*;

public class App {

	public static void main(String[] args){

		Funcionario funcionario = new Funcionario("Marcelo", "26/10/00", "000.000.000-01");
		CadastraF cf = new CadastraF(1);
		cf.cadastarFuncionario(funcionario);

		Manobrista novo = new Manobrista("Thales", "24/03/1997", "000.000.000-01", "12345678910", "B", 10);
		cf.cadastarFuncionario(novo);
		

		


	}

}
