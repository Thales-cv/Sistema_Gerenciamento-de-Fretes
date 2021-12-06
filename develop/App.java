package develop;
import src.*;

public class App {

	public static void main(String[] args){
		System.out.println("====== INICIANDO PROGRAMA ========");
		iniciar(); // popula os bancos
		Menu.home();

	}

	public static void iniciar(){
		// CRIANDO BANCOS
		CadastraF bdfuncionarios = new CadastraF(1); // CADASTRANDO BANCO DE FUNCIOARNIOS
		CadastroFretes bdfretes = new CadastroFretes(); // CADASTRANDO BANCO DE FRETES
		CadastroVeiculos bdveiculos = new CadastroVeiculos(); // CADASTRANDO BANCO DE VEICULOS
		
		// CADASTRANDO FUNCIONÁRIOS:
		// ==== MANOBISTRAS
		bdfuncionarios.cadastarFuncionario(new Manobrista("Bruno", "26/10/00", "000.000.000-01", "0138548", "B", 10));
		bdfuncionarios.cadastarFuncionario(new Manobrista("Zala", "26/10/00", "000.000.000-01", "0138548", "B", 10));
		bdfuncionarios.cadastarFuncionario(new Manobrista("Arcano", "26/10/00", "000.000.000-01", "0138548", "B", 10));
		bdfuncionarios.cadastarFuncionario(new Manobrista("Vicente", "26/10/00", "000.000.000-01", "0138548", "B", 10));
		
		// ==== MOTORISTAS
		bdfuncionarios.cadastarFuncionario(new Motorista("Mateus", "12/02/1975", "026.000.000-01", "7856644", "A", "25/12/2025", true, false));
		bdfuncionarios.cadastarFuncionario(new Motorista("Carlos", "12/02/1975", "026.000.000-01", "7856644", "A", "25/12/2025", true, false));
		bdfuncionarios.cadastarFuncionario(new Motorista("Roberto", "12/02/1975", "026.000.000-01", "7856644", "A", "25/12/2025", true, false));
		bdfuncionarios.cadastarFuncionario(new Motorista("Marcelo Neves", "12/02/1975", "026.000.000-01", "7856644", "A", "25/12/2025", true, false));
		// ==== ADMINISTRATIVO
		bdfuncionarios.cadastarFuncionario(new Administrativo("Thales", "24/03/1997", "026.122.420-40"));
		bdfuncionarios.cadastarFuncionario(new Administrativo("Victor", "24/03/1997", "026.122.420-40"));
		bdfuncionarios.cadastarFuncionario(new Administrativo("Ramiro", "24/03/1997", "026.122.420-40"));
		bdfuncionarios.cadastarFuncionario(new Administrativo("Sordadez", "24/03/1997", "026.122.420-40"));	
		
		// --------------------------------------------------------------------------------------------------------------------------------
		
		// CADASTRANDO VEÍCULOS
		// ==== PASSEIO E UTILITÁRIOS
		bdveiculos.cadastroVeiculos(new PasseioUtilitario());
		// ==== TRANSPORTE DE CARGA
		bdveiculos.cadastroVeiculos(new TransporteCarga());
		// ==== PASSAGEIROS
		bdveiculos.cadastroVeiculos(new Passageiros());
		// ---------------------------------------------------------------------------------------------------------------------------------
		
		// CADASTRANDO FRETES
		// ==== ONIBUS VAN
		bdfretes.cadastrarFrete(new onibusVan());
		// ==== UTILITÁRIOS CAMINHÃO
		bdfretes.cadastrarFrete(new UtilitariosCaminhao());

		System.out.println("=== INICIALIZAÇÃO BEM SUCEDIDA ===");
		
		bdfuncionarios.listAlfa(); // LISTAR EM ORDEM ALFABETICA FUNCIONARIOS
	}

}

