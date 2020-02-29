package com.bereket;

public class Classroom {
    private String PrimaryTeacherName;
    private String SubjectBeingTaught;
    private String[] studentNames;

    public Classroom(String primaryTeacherName, String subjectBeingTaught, String[] studentNames) {

        this.PrimaryTeacherName = primaryTeacherName;
        this.SubjectBeingTaught = subjectBeingTaught;
        this.studentNames = studentNames;
    }
    public String getPrimaryTeacherName() {
        return PrimaryTeacherName;
    }
    public void setPrimaryTeacherName(String primaryTeacherName) {
        PrimaryTeacherName = primaryTeacherName;
    }
    public String getSubjectBeingTaught() {
        return SubjectBeingTaught;
    }
    public void setSubjectBeingTaught(String subjectBeingTaught) {
        SubjectBeingTaught = subjectBeingTaught;
    }
    public String[] getStudentNames() {
        return studentNames;
    }
    public void setStudentNames(String[] studentNames) {
        this.studentNames = studentNames;
    }
    public void addNewStudent(String studentNames) {
        for (int i = 0; i <= studentNames.length(); i++) {
            System.out.println("class full");
        }
    }
}