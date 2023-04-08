package com.pathways.dev.trail1.model.node;

import com.pathways.dev.trail1.model.node.Node;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.Optional;

public interface NodeService {
    Collection<Node> findAll();

    void save(Node contactSubmission);

    Optional< Node > findById(Long id);

    void delete(long id);
}
