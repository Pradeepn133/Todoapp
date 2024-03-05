package com.restapis.withdatabase.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Todo_data")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String todo;

    @Temporal(TemporalType.DATE)
    private LocalDate date;
    @PrePersist
    public void prepersist() {
        date = LocalDate.now();
    }

}


