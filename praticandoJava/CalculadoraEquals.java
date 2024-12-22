package java_Praticando;

import javax.swing.JOptionPane;

public class CalculadoraEquals {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite um numero: ");
		String operador = JOptionPane.showInputDialog("Escolha a Operação: (+ - * /)");
		String valor2 = JOptionPane.showInputDialog("Digite outro numero: ");
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double resultado = 0 ;

		resultado = operador.equals("+") ? (numero1 + numero2) : resultado;
		resultado = operador.equals("-") ? (numero1 - numero2) : resultado;
		resultado = operador.equals("*") ? (numero1 * numero2) : resultado;
		resultado = operador.equals("/") ? (numero1 / numero2) : resultado;
		
		System.out.println(valor1 + " " + operador + " " + valor2 + " = " + resultado);	
	}
}
