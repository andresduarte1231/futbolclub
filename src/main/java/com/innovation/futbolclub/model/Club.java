package com.innovation.futbolclub.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Club {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombre;
  private String ciudad;
  private Integer fundacion;

  @OneToMany(mappedBy = "club", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Equipo> equipos = new ArrayList<>();

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public String getNombre() { return nombre; }
  public void setNombre(String nombre) { this.nombre = nombre; }
  public String getCiudad() { return ciudad; }
  public void setCiudad(String ciudad) { this.ciudad = ciudad; }
  public Integer getFundacion() { return fundacion; }
  public void setFundacion(Integer fundacion) { this.fundacion = fundacion; }
  public List<Equipo> getEquipos() { return equipos; }
  public void setEquipos(List<Equipo> equipos) { this.equipos = equipos; }
}
