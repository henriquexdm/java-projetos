package listaveiculos;

public class Caminhoes {
	private String marca;
	private String modelo;
	private int ano;
	
	// Construtor
	public Caminhoes (String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	// Getters e Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "\nMarca='" + marca + '\'' +
                ", \nModelo='" + modelo + '\'' +
                ", \nAno=" + ano + ".\n";			
	}
}
