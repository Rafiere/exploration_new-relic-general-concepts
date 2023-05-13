package com.poc.newrelicgeneralconcepts.tag.repository;

import com.poc.newrelicgeneralconcepts.tag.domain.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, String> {

}
