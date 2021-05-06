package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		/*
		 * Capturar: dia, mes e ano em variaveis diferentes
		 * Valide o dia para que ele esteja entre 1 e 30 ou 1 e 31 ou 1 e 29
		 * Valide o mes para que esteja entre 1 e 12
		 * Valide o ano para que seja menor que 2003 e maior que 1952
		 * 
		 * No final, exibam a data completa
		 */
		
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia entre 1 e 30: "));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes entre 1 e 12: "));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano entre 1952 e 2003: "));
		
		
		
		while ((dia < 1 || dia > 30) || (mes < 1 || mes > 12) || (ano < 1952 || ano > 2003)) {
			System.out.println("Digite uma data dentro dos parametros citados");
			dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia entre 1 e 30: "));
			mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes entre 1 e 12: "));
			ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano entre 1952 e 2003: "));
		} 
		
		System.out.println("Data de aniversario é: " + dia + "/" + mes + "/" + ano);
		
		
		
		/*
		 * byte dia = Byte.parseByte(JOptionPane.showInputDialog("Dia: "));
		byte mes = Byte.parseByte(JOptionPane.showInputDialog("Mes"));
		short ano = Short.parseShort(JOptionPane.showInputDialog("Ano"));
		
		while(ano>=2003 || ano<=1952) {
			ano = Short.parseShort(JOptionPane.showInputDialog("Ano novamente"));
		}
		
		while (mes<1 || mes>12) {
			mes = Byte.parseByte(JOptionPane.showInputDialog("Mes novamente"));
		}
		
		if (mes==2) {
			while(dia<1 || dia>29) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Dia novamente: "));
			}
		}else if (mes==4 || mes==6 || mes==9 || mes==11) { //meses com 30 dias
			while(dia<1 || dia>30) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Dia novamente: "));
			}
		}else { // meses com 31 dias
			while(dia<1 || dia>31) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Dia novamente: "));
			}
		}
		
		System.out.println("Data: " + dia + "/" + mes + "/" + ano);
		 */
		
	}

}
