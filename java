package com.tender.management.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Tender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    
    // Getters and Setters
}
