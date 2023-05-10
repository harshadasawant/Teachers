package com.teachers.controller;

import com.teachers.dto.TeacherDTO;
import com.teachers.services.TeacherService;
import com.teachers.entity.Teacher;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {


    @Autowired
    TeacherService teacherService;

    @GetMapping("/teachers")
    public ResponseEntity<List<Teacher>> getAllTeachers(){
        List<Teacher> teachers = teacherService.getTeachers();
        return new ResponseEntity<List<Teacher>>(teachers, HttpStatus.OK);
    }

    @PostMapping("/teachers")
    public ResponseEntity<Teacher> addTeacher(@RequestBody TeacherDTO teachersDTO){
        Teacher teacher = teacherService.addTeachers(teachersDTO);
        return new ResponseEntity<Teacher>(teacher, HttpStatus.CREATED);
    }
}
