package com.codingshuttle.youtube.hospitalManagement.entity;


import com.codingshuttle.youtube.hospitalManagement.type.BloodGroupType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@ToString
@Getter
@Setter
@Table(
        name = "patient"
//        uniqueConstraints = {
//                @UniqueConstraint(name = "unique_patient_name_birthdate", columnNames = {"name","birthDate"})
//        },
//        indexes = {
//                @Index(name = "idx_patient_birth_date", columnList = "birthDate")
//        }
)
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( nullable = false,length = 40 )
    private String name;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column( unique = true, nullable = false )
    private String email;

    private String gender;

    @CreationTimestamp
    @Column(updatable = false, name = "created_at")
    private LocalDateTime createdAt;


    @Enumerated(EnumType.STRING)
    private BloodGroupType bloodGroup;

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
