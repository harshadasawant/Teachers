package com.teachers.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

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
    @ManyToMany(cascade= CascadeType.MERGE)
    @JoinTable(name="Teachers_skill",
            joinColumns=@JoinColumn(name="teacherId"),
            inverseJoinColumns=@JoinColumn(name="skillId")
    )
    private Set<Skill> skillSet;
    private String otherSkill;

}
