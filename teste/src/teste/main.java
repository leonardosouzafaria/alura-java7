package teste;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		int vagas = Integer.parseInt(JOptionPane.showInputDialog("Qual  a quantidade de vagas"));
		Estacionamento02 a = new Estacionamento02();
		a.setVagas(10);
		String c = "";
		
		for (int i = 0; i < vagas; i++) {
			
			String marca = JOptionPane.showInputDialog("Qual a marca do carro: " + i);
			String modelo = JOptionPane.showInputDialog("Qual o modelo do carro: " + i);
			String placa = JOptionPane.showInputDialog("Qual a placa do carro: " + i);
			float entrada = Float.parseFloat(JOptionPane.showInputDialog("Qual  a hora de entrada do carro " + i));
			float saida = Float.parseFloat(JOptionPane.showInputDialog("Qual  a hora de saida do carro " + i));
			c = a.Criarcarro(marca, modelo, placa, entrada, saida);

		}

		for (int i = 0; i < vagas; i++) {
			JOptionPane.showMessageDialog(null,
					" O " + (i + 1) + " Carro é: " + c + "\n" + " A entrada foi as: " + [i].getEntrada() + " horas "
							+ "\n" + " A hora de saida foi: " + a[i].getSaida() + "horas" + "\n" + " O preço foi: R$:"
							+ a[i].getPreco() + "\n");
		}
	}

}
