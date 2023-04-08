package com.pathways.dev.trail1.model.resources;

import com.pathways.dev.trail1.model.resources.Resources;

import java.util.Collection;
import java.util.Optional;

public interface ResourceService {
        Collection<Resources> findAll();

        void save(Resources contactSubmission);

        Optional< Resources > findById(Long id);

        void delete(long id);
}
