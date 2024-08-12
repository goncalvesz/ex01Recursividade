package view;

import controller.RecursividadeController;
import javax.swing.JOptionPane;

public class Menu {
	public static void main(String[] args) {
		int n=0;
		
		try { //Tenta realizar as linhas posteriores
			n = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira até qual fatorial calcular"));
			
			RecursividadeController rec = new RecursividadeController();
			
			JOptionPane.showMessageDialog(null, "O resultado de " + n + "! é: " + rec.calcSomatoria(n));
			
		} catch (NumberFormatException nfe) { //Interrompe caso o numero inserido nao seja valido
				JOptionPane.showMessageDialog(null, "Insira um número inteiro!!!");
		} //Fim Catch
		
	} //fim main
	
} // fim classe
