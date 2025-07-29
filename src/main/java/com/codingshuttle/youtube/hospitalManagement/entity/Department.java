package com.codingshuttle.youtube.hospitalManagement.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Department {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
     private Long id;

    @Column(unique=true, nullable=false, length=50)
     private String name;

     @OneToOne
     private Doctor headDoctor;

     @ManyToMany
     @JoinTable(
             name = "my_dpt_doctor",
             joinColumns = @JoinColumn(name = "dpt_id"),
             inverseJoinColumns = @JoinColumn(name = "doctor_id")
     )
     private Set<Doctor> doctors = new HashSet<Doctor>();


}
