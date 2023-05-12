package com.teachers.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeacherDTO {
    private int teacherId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private String confirmedPassword;
}
