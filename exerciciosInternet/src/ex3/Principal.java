package ex3;
import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		Elevador el = new Elevador();
		while (true) {
			int opcao = menu();
			if (opcao == 1) {
				System.out.println("Qual é a capacidade do elevador? ");
				int capacElevador = sc.nextInt();
				System.out.println("Existem quantos andares no prédio (desconsiderando o Térreo)? ");
				int totAndares = sc.nextInt();
				el.inicializa(capacElevador, totAndares);
			}
			
			else if (opcao == 2) {
				el.entra();
			}
			
			else if (opcao == 3) {
				el.sai();
			}
			
			else if (opcao == 4) {
				el.sobe();
			}
			
			else if (opcao == 5) {
				el.desce();
			}
			
			else if (opcao == 6) {
				el.informacoes();
			}
			
			else if (opcao == 0) {
				System.out.println("Adeus! :)");
				break;
			}
		}
				
	}
	
	public static int menu() {
		System.out.println("=====================");
		System.out.println("[1] INICIALIZAR");
		System.out.println("[2] INSERIR PESSOA");
		System.out.println("[3] REMOVER PESSOA");
		System.out.println("[4] SUBIR UM ANDAR");
		System.out.println("[5] DESCER UM ANDAR");
		System.out.println("[6] INFORMAÇÕES");
		System.out.println("[0] SAIR");
		System.out.println("====================");
		
		int opcao;
		while (true) {
			opcao = sc.nextInt();
			if (opcao < 0 || opcao > 6) {
				System.out.println("[ERRO] Opção inválida. Tente novamente: ");
			} else {
				break;
			}
		}
		
		return opcao;
	}
	
}
