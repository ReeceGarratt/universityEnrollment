package com.bbd;

import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Student> students = new ArrayList<Student>(); //TODO: might this be an issue
    private int capacity;
    private static int numberOfCourses;

    public Course(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        setNumberOfCourses(getNumberOfCourses()+1);
    }

    public static int getNumberOfCourses() {
        return numberOfCourses;
    }

    public static void setNumberOfCourses(int numberOfCourses) {
        Course.numberOfCourses = numberOfCourses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean enrollStudent(Student s){

        if(this.students.size() < this.capacity){
            this.students.add(s);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean unenrollStudent(Student s){
        if(this.students.remove(s)){
            return true;
        }
        else{
            return false;
        }
    }

    public String printCurrentEnrolled(){
        StringBuilder strB = new StringBuilder();
        for (Student s : students){
            strB.append(s.toString());
            strB.append(", ");
        }
        return strB.toString();
    }
}
