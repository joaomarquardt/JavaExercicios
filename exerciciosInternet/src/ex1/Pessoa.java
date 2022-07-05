package ex1;

public class Pessoa {
	DataNasc d = new DataNasc();
	private String nome;
	private int altura;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public void setDataNasc(String dataNasc) {
		int dia = Integer.parseInt(dataNasc.substring(0, 2));
		int mes = Integer.parseInt(dataNasc.substring(3, 5));
		int ano = Integer.parseInt(dataNasc.substring(6));
		d.setData(dia, mes, ano);
	}
	
	public int getIdade() {
		return d.calculaIdade();
	}
	
	public void imprimeDados() {
		System.out.println("Nome: " + nome + "\nAno de Nascimento: " + d.getDataNasc());
	}
	
}
