package com.pathways.dev.trail1.model.pathway;

import com.pathways.dev.trail1.model.pathway.Pathway;

import java.util.Collection;
import java.util.Optional;

public interface PathwayService {
    Collection<Pathway> findAll();

    void save(Pathway pathway);

    Optional< Pathway > findById(Long id);

    void delete(long id);
}
