package com.innovation.futbolclub.repository;

import com.innovation.futbolclub.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador, Long> {

  List<Jugador> findByEquipoId(Long equipoId);

  @Query("SELECT j FROM Jugador j LEFT JOIN FETCH j.equipo")
  List<Jugador> findAllWithEquipo();
}
