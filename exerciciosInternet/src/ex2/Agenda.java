package ex2;
import java.util.Scanner;

public class Agenda {
	Pessoa [] p = new Pessoa[10];
	
	public void armazenaPessoa(String nome, int idade, float altura, int c) {
		p[c] = new Pessoa();
		p[c].setNome(nome);
		p[c].setIdade(idade);
		p[c].setAltura(altura);
	}
	
	/*  ainda nao sei como posso resolver isso!!!!
	 
	 public void removePessoa(String nome) {
		for (int i = 0; i < p.length; i++) {
			if (p[i].getNome().equals(nome)) {
				
			}
		}
	}
	*/
	
	public int buscaPessoa(String nome) {
		int pos = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i].getNome().equals(nome)) {
				pos = i;
				break;
			}
		}
		return pos;
	}
	
	public void imprimeAgenda() {
		for (int i = 0; i < p.length; i++) {
			System.out.println("== PESSOA DA POSIÇÃO " + i + " ==");
			System.out.println("Nome: " + p[i].getNome());
			System.out.println("Idade: " + p[i].getIdade());
			System.out.println("Altura: " + p[i].getAltura());
		}
	}
	
	public void imprimePessoa(int index) {
		System.out.println("\nIMPRIMINDO PESSOA DA POSIÇÃO " + index + "...");
		System.out.println(p[index].getNome());
		System.out.println(p[index].getIdade());
		System.out.println(p[index].getAltura());
	}
	
	public int menuAgenda() {
		int opcao;
		Scanner sc = new Scanner(System.in);
		System.out.println("== MENU DA AGENDA == ");
		System.out.println("[1] BUSCAR PESSOA");
		System.out.println("[2] REMOVER PESSOA");
		System.out.println("[3] IMPRIMIR AGENDA");
		System.out.println("[4] IMPRIMIR PESSOA");
		System.out.println("[5] SAIR");
		while (true) {
			opcao = sc.nextInt();
			if (opcao < 1 || opcao > 5) {
				System.out.println("[ERRO] Opção inválida. Tente novamente: ");
			} else {
				break;
			}
		}
		sc.close();
		return opcao;
	}
}
