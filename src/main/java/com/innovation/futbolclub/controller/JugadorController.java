package com.innovation.futbolclub.controller;

import com.innovation.futbolclub.repository.JugadorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/jugadores")
public class JugadorController {
    private final JugadorRepository repo;
    public JugadorController(JugadorRepository repo){ this.repo = repo; }

    @GetMapping
    public String listar(@RequestParam(required=false) Long equipoId, Model model){
        model.addAttribute("jugadores",
            equipoId == null ? repo.findAllWithEquipo() : repo.findByEquipoId(equipoId));
        return "jugadores/listar";
    }
}
