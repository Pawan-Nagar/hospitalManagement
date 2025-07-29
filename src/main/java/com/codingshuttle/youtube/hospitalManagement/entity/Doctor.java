package com.codingshuttle.youtube.hospitalManagement.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Doctor {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=false, nullable=false, length=50)
    private String name;

    @Column(unique=true, nullable=false, length=100)
    private String specialization;

    @Column(unique=true, nullable=false, length=100)
    private String email;

}

