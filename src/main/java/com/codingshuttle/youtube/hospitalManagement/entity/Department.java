package com.codingshuttle.youtube.hospitalManagement.entity;


import jakarta.persistence.*;
import lombok.*;

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

}
