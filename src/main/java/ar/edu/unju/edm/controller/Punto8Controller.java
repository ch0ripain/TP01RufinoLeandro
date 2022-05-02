package ar.edu.unju.edm.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Punto8;

@Controller
public class Punto8Controller {
	@GetMapping("/resolverPunto8")
	public String getPunto8Page(Model model) {
		Punto8 aPunto8 = new Punto8();

		int[] narray = aPunto8.multiplosCuatro();

		model.addAttribute("Punto8", Arrays.toString(narray));

		return "punto8";
	}
}