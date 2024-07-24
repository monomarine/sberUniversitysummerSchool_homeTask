package com.aeresilf._02;

public class Student {
    private String name;
    private String surname;
    private int[] grades;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.grades = new int[10];
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int[] getGrades() {
        return grades;
    }


    public void addGrade(int newGrade){
        for (int i = 0; i< grades.length-1; i++){
            grades[i] = grades[i+1];
        }
        grades[grades.length-1] = newGrade;
    }

    public double getAverageGrade(){
        int summ = 0;
        for (int grade : grades) {
            summ += grade;
        }

        return (double) summ / grades.length;
    }

    public String getStudentInfo(){
        return STR."студент \{this.getSurname()} \{this.getName()} успеваемость: \{this.getAverageGrade()}";
    }

    @Override
    public String toString(){
        return surname;
    }


}
