package com.teachers.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Teacher {
    @Id @GeneratedValue
    private int teacherId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private String confirmedPassword;
}
