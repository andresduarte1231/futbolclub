package com.innovation.futbolclub.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Equipo {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nombre;
  private String categoria;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "club_id")
  private Club club;

  @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Jugador> jugadores = new ArrayList<>();

  @OneToMany(mappedBy = "local")
  private List<Partido> comoLocal = new ArrayList<>();

  @OneToMany(mappedBy = "visitante")
  private List<Partido> comoVisitante = new ArrayList<>();

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public String getNombre() { return nombre; }
  public void setNombre(String nombre) { this.nombre = nombre; }
  public String getCategoria() { return categoria; }
  public void setCategoria(String categoria) { this.categoria = categoria; }
  public Club getClub() { return club; }
  public void setClub(Club club) { this.club = club; }
  public List<Jugador> getJugadores() { return jugadores; }
  public void setJugadores(List<Jugador> jugadores) { this.jugadores = jugadores; }
}
