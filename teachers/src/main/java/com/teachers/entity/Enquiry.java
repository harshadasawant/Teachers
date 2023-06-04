package com.teachers.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Enquiry {
    @Id @GeneratedValue
    private int enquiryId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    @ManyToMany(cascade= CascadeType.MERGE)
    @JoinTable(name="Teachers_skill",
            joinColumns=@JoinColumn(name="teacherId"),
            inverseJoinColumns=@JoinColumn(name="skillId")
    )
    private Set<Skill> skillSet;
    private String otherSkill;
    private int exp;
    private String location;
    private boolean isOnline;
    private boolean isOffline;

}
