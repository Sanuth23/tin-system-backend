package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String nameWithInitials;
    private String fullName;
    private String nic;
    private String birthday;
    private String birthCountry;
    private String gender;
    private String income;
    private String address;
    private String contactNumber;
    private String civilStatus;
    private String profession;

}
