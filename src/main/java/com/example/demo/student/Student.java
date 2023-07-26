package com.example.demo.student;

import lombok.*;
@ToString
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Student
{
    private Long id;
    private String name;
    private Gender gender;
    private String email;
}
