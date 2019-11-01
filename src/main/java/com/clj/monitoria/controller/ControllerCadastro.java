package com.clj.monitoria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerCadastro {
	@GetMapping("/cadastro")
    public String Cadastro() {
   	  return "redirect:/cadastro";
    }
    
}
