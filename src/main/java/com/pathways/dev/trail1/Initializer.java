package com.pathways.dev.trail1;

import com.pathways.dev.trail1.model.node.Node;
import com.pathways.dev.trail1.model.node.NodeRepository;
import com.pathways.dev.trail1.model.node.NodeService;
import com.pathways.dev.trail1.model.resources.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Collections;
import java.util.stream.Stream;

@Component
class Initializer implements CommandLineRunner {

    private final NodeRepository repository;
    @Autowired
    private NodeService nodeService;

    public Initializer(NodeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) {
        Stream.of("Topological Sort", "Depth First Search", "Master Theorem",
                "Greedy").forEach(title ->
                repository.save(new Node(title))
        );

        Node djug = repository.findByTitle("Seattle JUG");
//        Event e = Event.builder().title("Micro Frontends for Java Developers")
//                .description("JHipster now has microfrontend support!")
//                .date(Instant.parse("2022-09-13T17:00:00.000Z"))
//                .build();
        //djug.setEvents(Collections.singleton(e));
        repository.save(djug);

        repository.findAll().forEach(System.out::println);
    }
}