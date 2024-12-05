/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ExamenParcial2.controller;
import com.example.ExamenParcial2.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


 
@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("registration", new Registration());
        return "register";
    }

    @PostMapping("/register")
    public String registrarParticipante(@ModelAttribute("registration") Registration registration) {
        // Aquí puedes guardar los datos en una base de datos si es necesario
        return "redirect:/success";
    }

    @GetMapping("/success")
    public String mostrarPaginaExito() {
        return "success";
    }
}
