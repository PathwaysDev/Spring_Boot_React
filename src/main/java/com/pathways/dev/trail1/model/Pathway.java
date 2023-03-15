package com.pathways.dev.trail1.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.time.Instant;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Pathway {

    @Id
    @GeneratedValue
    private Long id;
    //private Instant date;
    private String title;
    private String description;
    @ManyToMany
    private Set<Node> nodeStruct;
}