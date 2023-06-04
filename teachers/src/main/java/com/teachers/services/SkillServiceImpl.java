package com.teachers.services;

import com.teachers.entity.Skill;
import com.teachers.entity.Teacher;
import com.teachers.repository.SkillRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
@Transactional
@Service
public class SkillServiceImpl implements SkillService {
    @Autowired
    SkillRepository skillRepository;
    @Override
    public List<Skill> getSkills() {
        List<Skill> skills = StreamSupport.stream(skillRepository.findAll().spliterator(),true)
                .collect(Collectors.toList());
        return skills;
    }

    @Override
    public Skill addSkill(Skill skill) {
        skillRepository.save(skill);
        return skill;
    }
}
