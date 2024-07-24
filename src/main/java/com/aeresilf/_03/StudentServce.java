package com.aeresilf._03;

import com.aeresilf._02.Student;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;

public class StudentServce {
    public Student bestStudent(Student @NotNull [] students){
        Student bestStudent = students[0];
        for(int i = 1; i< students.length; i++){
            if(bestStudent.getAverageGrade() < students[i].getAverageGrade()){
                bestStudent = students[i];
            }
        }
        return bestStudent;
    }

    public  void sortStudentsBySurname(Student[] students){
        Arrays.sort(students, Comparator.comparing(Student::getSurname));
    }
}
