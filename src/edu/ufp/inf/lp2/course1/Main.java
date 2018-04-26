/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.course1;

import java.util.ArrayList;

/**
 *
 * @author bernardomaia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Date1 today = new Date1();

        ArrayList<Student> s = new ArrayList();
        ArrayList<Discipline> d = new ArrayList();
        ArrayList<Course> c = new ArrayList();

        Course course = new Course("Engenharia Informatica");
        Course course1 = new Course ("Engenharia Ambiente");
        
        Student student = new Student("Bernardo Maia", "Rua Porto ", new Date1(19, 2, 1994), 29604L, "bernardomaia@hotamail.com",d,d);
        Student student1 = new Student("Bernardo Maia", "Rua X ", new Date1(20, 4, 1994), 29607L, "jorgemaia@hotamail.com", d, d);
        Student student2 = new Student("Maria Maia", "Rua Y ", new Date1(29, 6, 1994), 29608L, "mariamaia@hotamail.com", d, d);
       
   
        Discipline discipline1 = new Discipline("Multimedia", 5, 2, 2016, 15, student);
        Discipline discipline2 = new Discipline("AED", 7, 2, 2015, 18, student);
        Discipline discipline3 = new Discipline("LP1", 7, 2, 2015, 18, student1);
        Discipline discipline4 = new Discipline("SO", 7, 2, 2015, 18, student);

        course.associateStudets(student);
        course.associateStudets(student1);
        course.associateStudets(student2);
         
        course.desassociateStudents("Bernardo Maia");
      
        
        student.registerDiscipline(discipline1);
        student.registerDiscipline(discipline1);
        
       
 
        
     
          
      
    
           
           
    

}
}