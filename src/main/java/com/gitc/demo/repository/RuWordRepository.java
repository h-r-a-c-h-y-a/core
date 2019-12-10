package com.gitc.demo.repository;

import com.gitc.demo.model.RuWord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RuWordRepository extends CrudRepository<RuWord, Long> {
    Optional<RuWord> getById(long id);
}
