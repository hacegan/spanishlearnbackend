package com.samet.project.controller;

import com.samet.project.entities.Words;
import com.samet.project.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/getAll")
    public List<Words> getAll() {
       return taskService.getAllWords();
    }

    @GetMapping("/getWordInfo/{word}")
    public Words getWordInfo(@PathVariable("word") String word) {
        return taskService.getSpecificWordInfo(word);
    }

}
