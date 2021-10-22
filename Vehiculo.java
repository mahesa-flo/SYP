package es.tema1.ejerciosRepaso;

public class Vehiculo {
//Del ej.28: Cada veh�culo tendr� tres atributos: tipo (coche, motocicleta,�), marca y modelo.

	// los atributos
	String tipo;
	String marca;
	String modelo;

	// m�todo constructor vac�o
	Vehiculo() {
	}

	// m�todo const para definir los atributos
	Vehiculo(String tipo, String marca, String modelo) {
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
	}

	// los getters y setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

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

	// m�todo toString
	public String muestraAtrib() {
		return ("Tipo: " + getTipo() + " - Marca: " + getMarca() + " - Modelo: " + getModelo() + ".");
	}

}
