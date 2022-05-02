package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto1 {
	// Atributos
	private int number;

	// Constructores
	public Punto1() {
		// TODO Auto-generated constructor stub
	}

	// Getter y Setter
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int resolverFactorial(int number) {

		// Factorial con un bucle for

		int facteano = 1;
		for (int i = 1; i <= number; i++) {
			facteano = i * facteano;
		}
		return facteano;
	}
}