package ex2;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Agenda a = new Agenda();
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;
		float altura;
		System.out.println("=== CADASTRO DE AGENDA ===");
		for (int c = 0; c < a.p.length; c++) {
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println((c + 1) + "ª PESSOA:");
			while (true) {
				System.out.println("Nome: ");
				nome = sc.nextLine();
				if (nome.equals("")) {
					System.out.println("Escreve teu nome aí, o pangaré!");
				} else {
					break;
				}
			}
			while (true) {
				System.out.println("Idade: ");
				idade = sc.nextInt();
				if (idade < 0) {
					System.out.println("Tem idade negativa, é?");
				} else {
					break;
				}
			}
				
			while (true) {
				System.out.println("Altura (em m): ");
				altura = sc.nextFloat();
				if (altura <= 0) {
					System.out.println("Valeu ô átomo!");
				} else {
					break;
				}
			}
			a.armazenaPessoa(nome, idade, altura, c);
		}
		
		while (true) {
			int opcao = a.menuAgenda();
			System.out.println("Qual o nome da pessoa que você deseja buscar? ");
			nome = sc.nextLine();
			if (opcao == 1) {
				a.buscaPessoa(nome);
			}
			
			else if (opcao == 2) {
				System.out.println("Opção indisponível no momento.");
				continue;
			}
			
			else if (opcao == 3) {
				a.imprimeAgenda();
			}
			
			else if (opcao == 4) {
				System.out.println("Deseja ver os dados da pessoa de que posição da agenda? ");
				int i = sc.nextInt();
				a.imprimePessoa(i);
			}
			
			else if (opcao == 5) {
				System.out.println("Goodbye, mutchatcho! ");
				break;
			}
			
			
		}
		
	}
}
