package com.aeresilf._03;

import com.aeresilf._02.Student;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student petrov = new Student("Ivan", "Petrov");
        Student smirnov = new Student("Gleb", "Smirnov");
        Student avdeev = new Student("Fedor", "Avdeev");

        StudentServce service = new StudentServce();

        Student[] group1 = {petrov, smirnov, avdeev};

        fillRandomGrades(avdeev);
        fillRandomGrades(smirnov);
        fillRandomGrades(petrov);

        System.out.println(STR."студент с лучшей успеваемостью: \{service.bestStudent(group1)}\n\n");

        service.sortStudentsBySurname(group1);
        print(group1);
    }

    //#region support

    public static void print(@org.jetbrains.annotations.NotNull Student[] arr){
        for (Student student : arr) {
            System.out.println(student.getStudentInfo());
        }
    }
    public static void fillRandomGrades(Student student){
        Random rand = new Random();
        for(int i = 0; i< 10; i++){
            student.addGrade(rand.nextInt(2,6));
        }
    }
    //#endregion support
}
