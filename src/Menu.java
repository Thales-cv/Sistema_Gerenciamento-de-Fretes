
public class Menu {
	private CadastraF = bdfuncionarios;

	public static void home() {
		System.out.println(" ");
		System.out.println(" ");
		boolean i = true;
		while (i = true){
			System.out.println("== MENU PRINCIPAL ==");
			System.out.println("[1] - GERENCIAR FUNCIONÁRIOS");
			System.out.println("[2] - GERENCIAR VEÍCULOS");
			System.out.println("[3] - GERENCIAR FRETES");
			System.out.println("[0] - SAIR DO PROGRAMA");
			System.out.println("DIGITE A OPÇÃO DESEJADA: ");
			Scanner input = new Scanner(System.in);
			int opcao = input.nextInt();
		
			switch(opcao){
				case 1:
					menuFuncionarios();
					break;
				case 2:
					menuVeiculos();
					break;
				case 3:
					menuFretes();
					break;
				case 0:
					i = false;
					break; 
			}
	}
	}

	public static boolean menuFuncionarios() {
		boolean i = true;
		while (i = true){
			System.out.println("== GERENCIAR FUNCIONÁRIOS ==");
			System.out.println("[1] - CADASTRAR FUNCIOARNIO");
			System.out.println("[2] - LISTAR FUNCIOARNIOS EM ORDEM ALFABÉTICA");
			System.out.println("[3] - BUSCAR FUINCIOÁRIO POR CPF");
			System.out.println("[0] - VOLTAR AO MENU ANTERIOR");
			Scanner input = new Scanner(System.in);
			int opcao = input.nextInt();
			switch(opcao){
				case 1:
				System.out.println("SELECIONE O TIPOE DE FUNCIOÁRIO: ");
				System.out.println("[1] - ADMINISTRATIVO");
				System.out.println("[2] - MANOBRISTA");
				System.out.println("[3] - MOTORISTA");
				int tipo = input.nextInt();
				if (tipo == 1){
					System.out.println("DIGITE O NOME:");
					String nome = input.nextString();
					System.out.println("DIGITE A DATA DE NASCIMENTO: ");
					String dataNascimento = input.nextString(); // local date
					System.out.println("DIGITE O CPF ");
					String cpf = input.nextString();
					bdfuncionarios.cadastarFuncionario(new Administrativo(nome, dataNascimento, cpf));
				} else if(tipo == 2){
					System.out.println("DIGITE O NOME:");
					String nome = input.nextString();
					System.out.println("DIGITE A DATA DE NASCIMENTO: ");
					String dataNascimento = input.nextString(); // local date
					System.out.println("DIGITE O CPF ");
					String cpf = input.nextString();
					System.out.println("NÚMERO DA CNH: ");
					String cnh = input.nextString();
					System.out.println("CATEGORIA DA CNH: ");
					String categoriaCNH = input.nextString();
					System.out.println("DATA DE VENCIMENTO DA CNH: ");
					String validadeCNH = input.nextString();
					bdfuncionarios.cadastarFuncionario(new Manobrista(nome, dataNascimento, cpf, cnh, categoriaCNH, validadeCNH));
				} else if (tipo == 3)
					System.out.println("DIGITE O NOME:");
					String nome = input.nextString();
					System.out.println("DIGITE A DATA DE NASCIMENTO: ");
					String dataNascimento = input.nextString(); // local date
					System.out.println("DIGITE O CPF ");
					String cpf = input.nextString();
					bdfuncionarios.cadastarFuncionario(new Administrativo(nome, dataNascimento, cpf));
					break;
				case 2:
					// LISTAR FUNCIOARNIOS EM ORDEM ALFABÉTICA
					break;
				case 3:
					// BUSCAR FUINCIOÁRIO POR CPF
					break;
				case 0:
					// RETORNAR
					i = false;
					break;
				default:
				System.out.println("ERRO: TENTE NOVAMENTE");
			}
		}
	}

	public static boolean menuVeiculos() {
		boolean i = true;
		while (i = true){
			System.out.println("== GERENCIAR VEÍCULOS ==");
			System.out.println("[1] - CADASTRAR VEÍCULO");
			System.out.println("[2] - LISTAR VEÍCULOS EM ORDEM DE FABRICAÇÃO");
			System.out.println("[3] - BUSCAR VEÍCULOS POR PLACA");
			System.out.println("[0] - VOLTAR AO MENU ANTERIOR");
			Scanner input = new Scanner(System.in);
			int opcao = input.nextInt();
			switch(opcao){
				case 1:
					// CADASTRAR VEÍCULOS
					break;
				case 2:
					// LISTAR VEÍCULOS
					break;
				case 3:
					// BUSCAR VEÍCULOS
					break;
				case 0:
					// RETORNAR
					i = false;
					break;
				default:
				System.out.println("ERRO: TENTE NOVAMENTE");
			}
		}
	}

	public static boolean menuFretes() {
		boolean i = true;
			while (i = true){
			System.out.println("== GERENCIAR FRETES ==");
			System.out.println("[1] - CADASTRAR FRETAMENTO DE VEÍCULO");
			System.out.println("[2] - LISTAR MOTORISTAS LIVRES");
			System.out.println("[3] - LISTAR VEÍCULOS LIVRES");
			System.out.println("[4] - LISTAR TOP 5 MAIS LUCRATIVOS");
			System.out.println("[0] - VOLTAR AO MENU ANTERIOR");
			Scanner input = new Scanner(System.in);
			int opcao = input.nextInt();
			switch(opcao){
				case 1:
					// CADASTRAR FRETAMENTO DE VEÍCULO
					break;
				case 2:
					// LISTAR MOTORISTAS LIVRES
					break;
				case 3:
					// LISTAR TOP 5 MAIS LUCRATIVOS
					break;
				case 4:
					// 	LISTAR TOP 5 MAIS LUCRATIVOS
				case 0:
					// RETORNAR
					i = false;
					break;
				default:
				System.out.println("ERRO: TENTE NOVAMENTE");
			}
		}
	}

}
