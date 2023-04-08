package com.pathways.dev.trail1.web;

import com.pathways.dev.trail1.model.node.Node;
import com.pathways.dev.trail1.model.node.NodeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Collection;
import java.util.Optional;

public class NodeController {
    private final Logger log = LoggerFactory.getLogger(com.pathways.dev.trail1.model.node.Node.class);
    private NodeRepository nodeRepository;

    public NodeController(NodeRepository nodeRepository){
        this.nodeRepository = nodeRepository;
    }

    @RequestMapping("/node")
    Optional<Collection<Node>> nodes(){

        Collection<Node> nodeList = nodeRepository.findAll();

        return Optional.of(nodeList);
    }


    @RequestMapping("/node/{id}")
    ResponseEntity<?> getNode(@PathVariable Long id){
        Optional<Node> node = nodeRepository.findById(id);
        return node.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
