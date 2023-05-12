package com.teachers.services;

import com.teachers.dto.TeacherDTO;
import com.teachers.entity.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TeacherService {
    public List<Teacher> getTeachers();
    public Teacher addTeachers(TeacherDTO teacherDTO);
    public Teacher updateTeachers(TeacherDTO teacherDTO);
}
