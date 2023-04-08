package com.pathways.dev.trail1.model.node;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pathways.dev.trail1.model.node.Node;


import java.util.Collection;
import java.util.List;


@Repository
public interface NodeRepository extends JpaRepository <Node, Long>{
    Node findByTitle(String seattleJug);
}
