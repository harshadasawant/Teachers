package com.teachers.repository;

import com.teachers.entity.Skill;
import com.teachers.entity.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface SkillRepository extends CrudRepository<Skill, Integer> {
}
