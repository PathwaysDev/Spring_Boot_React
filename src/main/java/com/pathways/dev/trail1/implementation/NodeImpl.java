package com.pathways.dev.trail1.implementation;

import com.pathways.dev.trail1.model.node.Node;
import com.pathways.dev.trail1.model.node.NodeRepository;
import com.pathways.dev.trail1.model.node.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class NodeImpl implements NodeService {
    @Autowired
    private NodeRepository nodeRepository;
    @Override
    public Optional<Node> findById(Long id) {
        return nodeRepository.findById(id);
    }
    @Override
    public void save(Node node) {
        nodeRepository.save(node);
    }
    @Override
    public Collection< Node > findAll() {
        return nodeRepository.findAll();
    }
    @Override
    public void delete(long id) {
        nodeRepository.deleteById(id);
    }
}
