package com.innovation.futbolclub.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Partido {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private LocalDateTime fecha;
  private String estadio;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="local_id")
  private Equipo local;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="visitante_id")
  private Equipo visitante;

  private Integer golesLocal;
  private Integer golesVisitante;

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public LocalDateTime getFecha() { return fecha; }
  public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }
  public String getEstadio() { return estadio; }
  public void setEstadio(String estadio) { this.estadio = estadio; }
  public Equipo getLocal() { return local; }
  public void setLocal(Equipo local) { this.local = local; }
  public Equipo getVisitante() { return visitante; }
  public void setVisitante(Equipo visitante) { this.visitante = visitante; }
  public Integer getGolesLocal() { return golesLocal; }
  public void setGolesLocal(Integer golesLocal) { this.golesLocal = golesLocal; }
  public Integer getGolesVisitante() { return golesVisitante; }
  public void setGolesVisitante(Integer golesVisitante) { this.golesVisitante = golesVisitante; }
}
