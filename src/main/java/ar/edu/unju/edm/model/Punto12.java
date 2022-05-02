package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto12 {
	private int height;

	public Punto12() {
		// TODO Auto-generated constructor stub
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double calcularTiempo() {
		double tiempo = Math.sqrt((height * 2) / 9.81);

		// Math.round(double*100.0)/100.0; -> retorna el valor de un número redondeado
		// al entero más cercano

		return Math.round(tiempo * 100.0) / 100.0;
	}
}