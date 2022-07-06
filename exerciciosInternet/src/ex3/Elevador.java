package ex3;
import java.lang.Thread;

public class Elevador {
	private int andarAtual;
	private int totAndares;
	private int capacElevador;
	private int pesPresentes;
	
	public void inicializa(int capacElevador, int totAndares) {
		pesPresentes = 0;
		andarAtual = 0;
		this.capacElevador = capacElevador;
		this.totAndares = totAndares;
		System.out.println("O Elevador está no térreo e vazio.");
	}
	
	public void entra() throws InterruptedException {
		if (pesPresentes < capacElevador) {
			System.out.println("Mais uma pessoa entrando...");
			pesPresentes += 1;
			Thread.sleep(1000);
		} else {
			System.out.println("O elevador já está cheio!");
		}
	}
	
	public void sai() throws InterruptedException {
		if (pesPresentes >= 1) {
			System.out.println("Uma pessoa está saindo...");
			Thread.sleep(1000);
		} else {
			System.out.println("Não tem ninguém para sair!");
		}
	}
	
	public void sobe() throws InterruptedException {
		if (andarAtual < totAndares) {
			System.out.println("Subindo mais um andar...");
			Thread.sleep(1000);
		} else {
			System.out.println("O elevador já está no último andar.");
		}
	}
	
	public void desce() throws InterruptedException {
		if (andarAtual > 0) {
			System.out.println("Descendo mais um andar...");
			Thread.sleep(1000);
		} else {
			System.out.println("O elevador já está no térreo.");
		}
	}
	
	public int getAndarAtual() {
		return andarAtual;
	}
	
	public int getTotAndares() {
		return totAndares;
	}
	
	public int getCapacElevador() {
		return capacElevador;
	}
	
	public int getPesPresentes() {
		return pesPresentes;
	}
	
	public void setAndarAtual(int andarAtual) {
		if (andarAtual > this.totAndares) {
			System.out.println("O andar informado é maior que o total de andares do prédio!");
		} else {
			this.andarAtual = andarAtual;
		}
		
	}
	
	public void setTotAndares(int totAndares) {
		if (totAndares < 0) {
			System.out.println("O total de andares não pode ser negativo!");
		} else {
			this.totAndares = totAndares;
		}		
	}
	
	public void setPesPresentes(int pesPresentes) {
		if (pesPresentes < 0) {
			System.out.println("O total de pessoas presentes no elevador não pode ser negativo! Mudando para 0...");
			this.pesPresentes = 0;
		} else {
			this.pesPresentes = pesPresentes;
		}
		
	}
	
	public void informacoes() {
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Pessoas dentro: " + getPesPresentes());
		System.out.println("Capacidade total: " + getCapacElevador());
		System.out.println("Andar atual: " + getAndarAtual());
		System.out.println("Total de andares: " + getTotAndares());
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
	}
}
