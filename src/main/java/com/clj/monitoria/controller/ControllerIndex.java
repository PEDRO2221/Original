package com.clj.monitoria.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.clj.monitoria.model.Comidas;
import com.clj.monitoria.repository.ComidaBD;

@Controller
public class ControllerIndex {
	@Autowired
	ComidaBD comida;

@GetMapping("/")
     public String Home(Model model) {
    	 model.addAttribute("comidas", comida.findAll());
    	 return "home";
     }
 @GetMapping("/listar")
     public String list(Model model) {
    	 model.addAttribute("comidas", comida.findAll());
    	 return "receitas";
     }


@GetMapping("/telInicial")
     public String user(Model model) {
    	 model.addAttribute("comidas", comida.findAll());
    	 return "index";
     }

 	@GetMapping("/cad")
 	public String home() {
 		return "cadastro";
 	}


 	@GetMapping("/cada")
 	public String enviar(@Valid Comidas cmd,BindingResult result
 			, RedirectAttributes attributes) {
 				if(result.hasErrors()) {
 		}
 		attributes.addFlashAttribute("mensagem", "Receita salva com sucesso.");
 		comida.save(cmd);
 		return "redirect:/telInicial";
 	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		comida.deleteById(id);
		return "redirect:/telInicial";

	}

	@GetMapping("/editar/{id}")
	public String editar(@PathVariable("id") Long id, Model model) {
		model.addAttribute("comidas", comida.findById(id));
		return "editar.html";

	}

}
