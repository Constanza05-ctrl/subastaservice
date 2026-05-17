package com.proyectosemestral.subasta.Repository;

import com.proyectosemestral.subasta.Model.Subasta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubastaRepository extends JpaRepository<Subasta, Long> {

}
