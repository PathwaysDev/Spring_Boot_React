package com.pathways.dev.trail1.model.pathway;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pathways.dev.trail1.model.pathway.Pathway;


@Repository
public interface PathwayRepository extends JpaRepository <Pathway, Long> {
}
