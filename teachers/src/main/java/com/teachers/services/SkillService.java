package com.teachers.services;

import com.teachers.entity.Skill;

import java.util.List;

public interface SkillService {
    public List<Skill> getSkills();
    public Skill addSkill(Skill skill);

}
