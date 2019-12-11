package com.gitc.demo.repository;

import com.gitc.demo.model.Image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImageRepository extends CrudRepository<Image, Long> {

    Optional<Image> getById(Long id);
}
