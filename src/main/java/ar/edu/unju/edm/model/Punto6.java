package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto6 {

	private int num;

	public Punto6() {
		// TODO Auto-generated constructor stub
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String condicionAlumno() {

		String mensaje = null;
		boolean aux = true;
		while (aux == true) {
			if (num == 6)
				mensaje = "Alumno Regulariza";
			if (num >= 7 && num <= 10)
				mensaje = "El alumno promociona";
			if (num < 6 && num >= 1)
				mensaje = "El alumno desaprueba";
			if (num <= 0 || num > 10)
				mensaje = "Valor no permitido";
			aux = false;
		}
		return mensaje;
	}
}