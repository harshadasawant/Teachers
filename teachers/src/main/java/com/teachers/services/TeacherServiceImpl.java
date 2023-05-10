package com.teachers.services;

import com.teachers.dto.TeacherDTO;
import com.teachers.repository.TeacherRepository;
import com.teachers.entity.Teacher;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Transactional
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public List<Teacher> getTeachers() {
        List<Teacher> teachers = StreamSupport.stream(teacherRepository.findAll().spliterator(),true)
                .collect(Collectors.toList());
        return teachers;
    }

    @Override
    public Teacher addTeachers(TeacherDTO teacherDTO) {
      Teacher teacher = new Teacher();
      teacher.setName(teacherDTO.getName());
      Teacher teacher1 = teacherRepository.save(teacher);
        return teacher1;
    }
}
