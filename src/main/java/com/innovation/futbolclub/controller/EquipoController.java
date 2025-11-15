package com.innovation.futbolclub.controller;

import com.innovation.futbolclub.repository.EquipoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/equipos")
public class EquipoController {
  private final EquipoRepository repo;
  public EquipoController(EquipoRepository repo){ this.repo = repo; }

  @GetMapping
  public String listar(@RequestParam(required=false) Long clubId, Model model){
    // Si quieres garantizar el club cargado, usa el método con fetch-join (más abajo)
    model.addAttribute("equipos", clubId==null ? repo.findAll() : repo.findByClubId(clubId));
    model.addAttribute("equipos", clubId==null ? repo.findAllWithClub() : repo.findByClubId(clubId));

    return "equipos/listar";
  }
}
