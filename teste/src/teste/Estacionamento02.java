package teste;

public class Estacionamento02 {
	private int vagas;
	private Carro02[] carros;
	private float entrada;
	private float saida;
	private float preco;

	public float getSaida() {
		return saida;
	}

	public void setSaida(float saida) {
		this.saida = saida;
	}

	public float getPreco() {
		if (saida - entrada <= 4) {
			preco = (float) ((saida - entrada) * 4.8);
			return preco;
		}

		else {
			preco = (float) 23.00;
			return preco;
		}
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

	public String Criarcarro(String marca, String modelo, String placa, float entrada, float saida) {
		Carro02 carros = new Carro02();
		carros.setMarca(marca);
		carros.setModelo(modelo);
		carros.setPlaca(placa);
		setEntrada(entrada);
		setSaida(saida);
		getPreco();
		return carros.getMarca() + " " + carros.getModelo();
	}

	public float getEntrada() {
		return entrada;

	}

	public void setEntrada(float entrada) {
		this.entrada = entrada;
	}
	
	public Carro02 getCarro(int indice) {
		return carros[indice];
	}

}
