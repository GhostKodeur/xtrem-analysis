package com.josue.kodeur.xtremanalyse.application.repositories.personnes;

import com.josue.kodeur.xtremanalyse.application.entities.personnes.Passager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author JosueKodeur
 * **/

@Repository
public interface PassagerRepository extends JpaRepository<Passager, Long> {
}