package edu.ufp.inf.lp2.course1;

import java.util.ArrayList;

public class Discipline {
    private String name;

    private int ects;

    private int semeste;

    private int year;

    private int grade;

    private Student student;

    public Discipline(String name, int ects, int semeste, int year, int grade, Student student) {
        this.name = name;
        this.ects = ects;
        this.semeste = semeste;
        this.year = year;
        this.grade = grade;
        this.student = student;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ects
     */
    public int getEcts() {
        return ects;
    }

    /**
     * @param ects the ects to set
     */
    public void setEcts(int ects) {
        this.ects = ects;
    }

    /**
     * @return the semeste
     */
    public int getSemeste() {
        return semeste;
    }

    /**
     * @param semeste the semeste to set
     */
    public void setSemeste(int semeste) {
        this.semeste = semeste;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * @return the student
     */
    public Student getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(Student student) {
        this.student = student;
    }

   
}
