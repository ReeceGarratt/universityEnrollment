package com.bbd;

import java.util.ArrayList;

public class Student {
    private String name;
    private int studentNumber;
    private String DoB;
    private static ArrayList<Integer> studentNumbers = new ArrayList<Integer>();

    public Student(String name, int studentNumber, String DoB){
        addStudentToList(studentNumber);
        this.name = name;
        this.studentNumber = studentNumber;
        this.DoB = DoB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String doB) {
        DoB = doB;
    }

    private static void addStudentToList(int studentNumber){
        studentNumbers.add(studentNumber);
    }

    @Override
    public String toString(){

        return this.getName() + " " + this.getStudentNumber();
    }

}
