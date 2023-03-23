package com.pathways.dev.trail1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Node {
    @Id
    @GeneratedValue
    private Long id;
    //private Instant date;
    private String title;
    @OneToMany
    private Set<Category> categoryStruct;
    private Resources resources;
    private String timeUpdated; //use Date object later
    private String description;
//    @ManyToMany
//    private Set<User> attendees;
}