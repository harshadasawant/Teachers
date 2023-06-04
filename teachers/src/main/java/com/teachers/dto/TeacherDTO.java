package com.teachers.dto;

import com.teachers.entity.Skill;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

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
    private Set<Skill> skillSet;
    private String otherSkill;

}
