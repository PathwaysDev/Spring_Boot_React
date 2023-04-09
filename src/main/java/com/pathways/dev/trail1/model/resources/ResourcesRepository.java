package com.pathways.dev.trail1.model.resources;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pathways.dev.trail1.model.resources.Resources;

@Repository
public interface ResourcesRepository extends JpaRepository <Resources, String> {

}
