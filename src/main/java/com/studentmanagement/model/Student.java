package com.studentmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("students")  // Map this class to the "students" table
@Getter
@Setter
@NoArgsConstructor  // Lombok will generate a no-argument constructor
@AllArgsConstructor // Lombok will generate a constructor with all fields
@ToString           // Lombok will generate a toString() method
public class Student {

    @Id
    private Long id;

    private String name;
    private String email;
    private String course;
}
