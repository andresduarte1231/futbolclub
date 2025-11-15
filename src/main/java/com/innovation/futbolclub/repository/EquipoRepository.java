package com.innovation.futbolclub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import com.innovation.futbolclub.model.Equipo;

public interface EquipoRepository extends JpaRepository<Equipo, Long> {
  List<Equipo> findByClubId(Long clubId);

  @Query("select e from Equipo e left join fetch e.club")
  List<Equipo> findAllWithClub();
}
