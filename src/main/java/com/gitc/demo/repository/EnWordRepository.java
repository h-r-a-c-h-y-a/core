package com.gitc.demo.repository;

import com.gitc.demo.model.EnWord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EnWordRepository extends CrudRepository<EnWord, Long> {
    Optional<EnWord> getById(long id);
}
