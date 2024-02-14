package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User {
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
