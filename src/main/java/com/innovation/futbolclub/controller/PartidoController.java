package com.innovation.futbolclub.controller;

import com.innovation.futbolclub.repository.PartidoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/partidos")
public class PartidoController {
    private final PartidoRepository repo;
    public PartidoController(PartidoRepository repo){ this.repo = repo; }

    @GetMapping
    public String listar(Model model){
        model.addAttribute("partidos", repo.findAllWithEquipos());
        return "partidos/listar";
    }
}
