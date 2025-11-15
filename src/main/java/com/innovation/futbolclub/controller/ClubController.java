package com.innovation.futbolclub.controller;

import com.innovation.futbolclub.repository.ClubRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clubes")
public class ClubController {
    private final ClubRepository repo;
    public ClubController(ClubRepository repo){ this.repo = repo; }

    @GetMapping
    public String listar(Model model){
        model.addAttribute("clubes", repo.findAll());
        return "clubes/listar";
    }
}
