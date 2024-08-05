package com.samet.project.entities;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Words")
@Data
public class Words {
    @Id
    private String id;
    private String word;
    private String translation;
    private String image;


}
