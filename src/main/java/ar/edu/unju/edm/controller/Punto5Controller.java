package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Punto5;

@Controller
public class Punto5Controller {

	@GetMapping("/resolverPunto5")
	public String getPunto5Page(@RequestParam(name = "num") int num, Model model) {
		String mes;
		Punto5 aPunto5 = new Punto5();
		aPunto5.setNum(num);
		mes = aPunto5.queMes(num);
		model.addAttribute("Punto5", mes);
		model.addAttribute("numMes", num);
		return "punto5";
	}
}