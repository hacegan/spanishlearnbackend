package com.samet.project.service;

import com.samet.project.entities.Words;
import com.samet.project.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaskService {

    @Autowired
    private WordRepository wordRepository;

    public List<Words> getAllWords() {
        try {
            List<Words> all = wordRepository.findAll();
            return all;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Words getSpecificWordInfo(String word) {
        return wordRepository.findByWord(word);
    }
}
