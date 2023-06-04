package com.teachers.controller;

import com.teachers.entity.Skill;
import com.teachers.entity.Teacher;
import com.teachers.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SkillController {
    @Autowired
    SkillService skillService;

    @GetMapping("/skills")
    public ResponseEntity<List<Skill>> getAllSkill(){
        List<Skill> skills = skillService.getSkills();
        return new ResponseEntity<List<Skill>>(skills, HttpStatus.OK);
    }
    @PostMapping("/skill")
    public ResponseEntity<Skill> addSkill(@RequestBody Skill skill){
        Skill addedSkill = skillService.addSkill(skill);
        return new ResponseEntity<Skill>(addedSkill, HttpStatus.OK);
    }

}
