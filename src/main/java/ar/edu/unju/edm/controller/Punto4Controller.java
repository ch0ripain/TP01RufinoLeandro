package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Punto4;

@Controller
public class Punto4Controller {

	@GetMapping("/resolverPunto4")
	public String getPunto4Page(@RequestParam(name = "num") int num, Model model) {
		String month;
		Punto4 aPunto4 = new Punto4();
		aPunto4.setNum(num);
		if (aPunto4.esMes() == true)
			month = "SI es un mes";
		else
			month = "NO es un mes";

		model.addAttribute("Punto4", month);
		model.addAttribute("numeroMes", num);

		return "punto4";
	}
}