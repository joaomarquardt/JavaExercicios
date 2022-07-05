package ex1;
import java.util.Calendar;

public class DataNasc {
	private int dia;
	private int mes;
	private int ano;
	
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String getDataNasc() {
		return dia + "/" + mes + "/" + ano; 
	}
	

	public int calculaIdade() {
		Calendar cal = Calendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);
		int mesAtual = cal.get(Calendar.MONTH);
		int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
		int idade = anoAtual - ano;
		if (mesAtual < mes) {
			idade -= 1;
		} else if (mesAtual == mes) {
			if (diaAtual < dia) {
				idade -= 1;
			}
		}
		
		return idade;
		
	}
}
