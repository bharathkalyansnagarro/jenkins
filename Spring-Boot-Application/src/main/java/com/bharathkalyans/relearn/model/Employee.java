package com.bharathkalyans.relearn.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @SequenceGenerator(name = "employee_sequence_generator", sequenceName = "employee_sequence_generator", initialValue = 101, allocationSize = 1)
    @GeneratedValue(generator = "employee_sequence_generator", strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;

}
