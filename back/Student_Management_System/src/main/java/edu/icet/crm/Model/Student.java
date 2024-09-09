package edu.icet.crm.Model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    private String name;
    private int age;
    private String gender;
    private String address;
    private String guardName;
    private String phone;
}
