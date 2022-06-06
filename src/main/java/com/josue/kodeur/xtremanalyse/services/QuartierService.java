package com.josue.kodeur.xtremanalyse.services;

import com.josue.kodeur.xtremanalyse.entities.Quartier;
import com.josue.kodeur.xtremanalyse.exceptions.NotFoundException;

import java.util.List;

/**
 * @author JosueKodeur
 */

//tutorialRepository.findAll().forEach(tutorials::add);

public interface QuartierService {
    Quartier save(String nom, Long villeID) throws NotFoundException, NotFoundException;
    Quartier update(Long ID, Quartier quartier) throws NotFoundException, NotFoundException;
    void delete(Long ID);
    List<Quartier> listAll();
}