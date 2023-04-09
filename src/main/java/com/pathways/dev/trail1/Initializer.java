package com.pathways.dev.trail1;

import com.pathways.dev.trail1.model.node.Node;
import com.pathways.dev.trail1.model.node.NodeService;
import com.pathways.dev.trail1.model.node.NodeRepository;
import com.pathways.dev.trail1.model.pathway.Pathway;
import com.pathways.dev.trail1.model.pathway.PathwayRepository;
import com.pathways.dev.trail1.model.pathway.PathwayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;
import java.util.Collection;

@Component
class Initializer implements CommandLineRunner {

    private final NodeRepository nodeRepository;
    private final PathwayRepository pathRepository;
    @Autowired
    private NodeService nodeService;

    @Autowired
    private PathwayService pathwayService;

    public Initializer(NodeRepository nodeRepository, PathwayRepository pathwayRepository) {
        this.nodeRepository = nodeRepository;
        this.pathRepository = pathwayRepository;
    }

    @Override
    public void run(String... strings) {
        Stream.of("Topological Sort", "Depth First Search", "Master Theorem",
                "Greedy").forEach(title ->
                nodeRepository.save(new Node(title))
        );

        Node testnode1 = nodeRepository.findByTitle("Topological");
        testnode1.setDescription("Topological test node for testing purposes, this would be a description of the content :)");
        nodeRepository.save(testnode1);

        Node testnode2 = nodeRepository.findByTitle("Depth First Search");
        testnode1.setDescription("Depth First Search test node for testing purposes, this would be a description of the content :)");
        nodeRepository.save(testnode2);

        Node testnode3 = nodeRepository.findByTitle("Master Theorem");
        testnode1.setDescription("Master Theorem test node for testing purposes, this would be a description of the content :)");
        nodeRepository.save(testnode3);


        nodeRepository.findAll().forEach(System.out::println);

        Pathway path = new Pathway();
        path.setName("math path");
        path.setDescription("path description for math");
        path.setNodeStruct(nodeRepository.findAll());
        pathRepository.save(path);


//        Event e = Event.builder().title("Micro Frontends for Java Developers")
//                .description("JHipster now has microfrontend support!")
//                .date(Instant.parse("2022-09-13T17:00:00.000Z"))
//                .build();
//        djug.setEvents(Collections.singleton(e));
    }
}