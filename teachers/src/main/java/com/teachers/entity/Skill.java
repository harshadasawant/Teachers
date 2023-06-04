package com.teachers.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Skill {
    @Id
    @GeneratedValue
    private int skillId;
    private String skillName;

}
