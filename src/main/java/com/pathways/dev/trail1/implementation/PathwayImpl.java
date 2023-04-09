package com.pathways.dev.trail1.implementation;

import com.pathways.dev.trail1.model.pathway.Pathway;
import com.pathways.dev.trail1.model.pathway.PathwayRepository;
import com.pathways.dev.trail1.model.pathway.PathwayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
@Service
public class PathwayImpl implements PathwayService {
    @Autowired
    private PathwayRepository pathwayRepository;
    @Override
    public Collection<Pathway> findAll() {
        return null;
    }

    @Override
    public void save(Pathway pathway) {

    }

    @Override
    public Optional<Pathway> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(long id) {

    }
}
