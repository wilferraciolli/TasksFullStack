package com.wiltech.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * The type Task.
 */
@Entity
@Data
@AllArgsConstructor
public class Task {

    @Id @GeneratedValue
    private Long id;
    private String name;
    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate dueDate;
    private Boolean completed;

    /**
     * Instantiates a new Task.
     */
    public Task () {
        
    }

    /**
     * Instantiates a new Task.
     *
     * @param l                              the l
     * @param create_spring_boot_application the create spring boot application
     * @param now                            the now
     * @param b                              the b
     */
    public Task(long l, String create_spring_boot_application, LocalDate now, boolean b) {
    }
}
