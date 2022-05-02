package ar.edu.unju.edm.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Punto7;

@Controller
public class Punto7Controller {
	@GetMapping("/resolverPunto7")
	public String getPunto7Page(Model model) {
		Punto7 aPunto7 = new Punto7();

		int[] narray = aPunto7.generarSecuencia();

		model.addAttribute("Punto7", Arrays.toString(narray));

		/*
		 * Arrays.toString -> Devuelve una representación de cadena del contenido de la
		 * matriz especificada. La representación de cadena consta de una lista de los
		 * elementos de la matriz, entre corchetes ("[]"). Los elementos adyacentes
		 * están separados por los caracteres “,” (una coma seguida de un espacio).
		 * Devuelve "nulo" si a es nulo.
		 */

		return "punto7";
	}
}