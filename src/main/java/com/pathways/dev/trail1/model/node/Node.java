package com.pathways.dev.trail1.model.node;

import com.pathways.dev.trail1.model.resources.Resources;
import com.pathways.dev.trail1.model.category.Category;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Node {
    @Id
    @GeneratedValue
    private Long id;
    //private Instant date;
    @NonNull
    private String title;
    @OneToMany(fetch = FetchType.LAZY)
    private Set<Category> categoryStruct;
//    private Resources resources;
    private String timeUpdated; //use Date object later
    private String description;
//    @ManyToMany
//    private Set<User> attendees;
    // from group, rip
    //    @OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    //    private Set<Event> events;
}