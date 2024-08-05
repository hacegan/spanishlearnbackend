package com.samet.project.repository;

import com.samet.project.entities.Words;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends MongoRepository<Words, String> {

    public Words findByWord(String word);
}
