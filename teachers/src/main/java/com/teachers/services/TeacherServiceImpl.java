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
      teacher.setFirstName(teacherDTO.getFirstName());
      teacher.setLastName(teacherDTO.getLastName());
      teacher.setEmail(teacherDTO.getEmail());
      teacher.setPhone(teacherDTO.getPhone());
      teacher.setPassword(teacherDTO.getPassword());
      teacher.setConfirmedPassword(teacherDTO.getConfirmedPassword());
        System.out.println(teacherDTO.getSkillSet());
        System.out.println(teacherDTO.getOtherSkill());
      teacher.setSkillSet(teacherDTO.getSkillSet());
      teacher.setOtherSkill(teacherDTO.getOtherSkill());
//     if(teacherDTO.getSkillSet() != null && !teacherDTO.getSkillSet().isEmpty()){
//         teacher.getSkillSet().forEach(skill ->{
//
//         });
//     }
      Teacher teacher1 = teacherRepository.save(teacher);
        return teacher1;
    }

    @Override
    public Teacher updateTeachers(TeacherDTO teacherDTO) {
        Teacher teacher = new Teacher();

        teacher.setFirstName(teacherDTO.getFirstName());
        teacher.setLastName(teacherDTO.getLastName());
        teacher.setEmail(teacherDTO.getEmail());
        teacher.setPhone(teacherDTO.getPhone());
        teacher.setPassword(teacherDTO.getPassword());
        teacher.setConfirmedPassword(teacherDTO.getConfirmedPassword());
        Teacher teacher1 = teacherRepository.save(teacher);

        return null;
    }
}
