package com.innovation.futbolclub.repository;

import com.innovation.futbolclub.model.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface PartidoRepository extends JpaRepository<Partido, Long> {

  @Query("""
         SELECT p FROM Partido p
         LEFT JOIN FETCH p.local l
         LEFT JOIN FETCH p.visitante v
         """)
  List<Partido> findAllWithEquipos();
}
