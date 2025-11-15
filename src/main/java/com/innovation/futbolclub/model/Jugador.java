package com.innovation.futbolclub.model;

import jakarta.persistence.*;

@Entity
public class Jugador {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombre;
  private Integer dorsal;
  private String posicion;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "equipo_id")
  private Equipo equipo;

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public String getNombre() { return nombre; }
  public void setNombre(String nombre) { this.nombre = nombre; }
  public Integer getDorsal() { return dorsal; }
  public void setDorsal(Integer dorsal) { this.dorsal = dorsal; }
  public String getPosicion() { return posicion; }
  public void setPosicion(String posicion) { this.posicion = posicion; }
  public Equipo getEquipo() { return equipo; }
  public void setEquipo(Equipo equipo) { this.equipo = equipo; }
}
