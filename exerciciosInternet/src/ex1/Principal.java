package ex1;
import java.util.Scanner;
import java.util.Calendar;

public class Principal {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		Scanner sc = new Scanner(System.in);
		System.out.println("=== REGISTRO DE PESSOA ===");
		while (true) {
			System.out.println("Digite seu nome: ");
			String nome = sc.nextLine().trim();
			if (nome.length() == 0) {
				System.out.println("[ERRO] Campo NOME vazio. Tente novamente.");
			} else {
				p.setNome(nome);
				break;
			}
		}
		
		Calendar cal = Calendar.getInstance();
		while (true) {
			System.out.println("Digite sua data de nascimento (COM /): ");
			String dataNasc = sc.nextLine().trim();
			if (dataNasc.length() == 10 && dataNasc.substring(0, dataNasc.indexOf("/")).length() == 2 && dataNasc.substring(3, dataNasc.lastIndexOf("/")).length() == 2 && (dataNasc.substring(6)).length() == 4 && 
				Integer.parseInt(dataNasc.substring(6)) < cal.get(Calendar.YEAR)) {
				p.setDataNasc(dataNasc);
				break;
			} else {
				System.out.println("[ERRO] Campo DATA DE NASCIMENTO inválido. Tente novamente.");	
			}
		}
		
		while (true) {
			System.out.println("Digite sua altura (em cm): ");
			int altura = sc.nextInt();
			if (altura > 0) {
				p.setAltura(altura);
				break;
			} else {
				System.out.println("[ERRO] Campo ALTURA inválido. Tente novamente.");
			}
		}
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("CADASTRO DEFINIDO COM SUCESSO!");
		System.out.println("Seu nome é " + p.getNome());
		System.out.println("Idade: " + p.getIdade() + " anos");
		System.out.println("Sua altura: " + p.getAltura() + "cm");
		sc.close();
		
	}
}
