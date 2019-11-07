package com.clj.monitoria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.clj.monitoria.model.Comidas;
import com.clj.monitoria.repository.ComidaBD;
@Controller
public class ControllerIndex {
	@Autowired
	ComidaBD comida;
	
	
     @GetMapping("/")
     public String Home() {
    	 return "index";
     }    
     @GetMapping("/cadastro")
     public String cadastro() {
		return "cadastro";
    	 
     }
     
    @GetMapping("/deletar/{id}")
    public String delete(@PathVariable("id") Long id) {
    	comida.deleteById(id);
    	return "redirect:/";
     }
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") Long id,Model model) {
    	model.addAttribute("Comidas" , comida.findById(id));
    	return "editar";
     }
     
     
     
     
     
     
}
