package com.example.demo.student;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController
{
    public List<Student> getAllStudents()
    {
       List<Student> students =  Arrays.asList(new Student(1L, "Jamila",Gender.FEMALE,  "jamila@amigoscode.edu"));
       return students;
    }

}
