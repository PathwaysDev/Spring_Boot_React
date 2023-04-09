package com.pathways.dev.trail1.model.resources;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
//used inside node, contains resources for the node
public class Resources {
    @Id
    @GeneratedValue
    private String name;
    private Long id;
    private String content;

    //maybe add type
}
