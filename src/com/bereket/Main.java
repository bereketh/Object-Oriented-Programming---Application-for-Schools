package com.bereket;

public class Main {

    public static void main(String[] args) {

        String [] studentNames = {"peter","joe","martha","chris","sam"};

        Classroom room1 = new Classroom ("David" , "math", studentNames);

        room1.addNewStudent( "peter");


        /*
 You're creating an application for school administrators to manage classroom information.
- Create a Classroom class and fields to represent the following information:
Primary teacher name
Subject being taught
A list of student names. The list should be a maximum of 5 names.
- Create a constructor
- Create a setters and getters for all fields
- Create a method to allow a new student to join the classroom.
It should take a student name as an argument and add the student's name to the array.
If the class size is 5, don't let any more students join.


         */
    }
}
