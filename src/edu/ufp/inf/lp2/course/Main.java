/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.course;

import edu.ufp.inf.lp2.intro.Date;
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
        Discipline dis1 = new Discipline("LP2", 7, 2, 2);
        
        Student student = new Student (2904,new Date(),"bernardomaia_94@hotmail.com", "bernardo","222","Bernardo Maia","Rua X", new Date());
        CourseClass course = new CourseClass("Informatica");
        
        Grade g1 = new Grade(11.3f, new Date(), dis1);
        Grade g2 = new Grade(11.2f, new Date(), dis1);
        Grade g3 = new Grade(15.6f, new Date(), dis1);
        
        dis1.associateGrade(g1);
        dis1.associateGrade(g2);
        dis1.associateGrade(g3);
        
        ArrayList<Grade> result = new ArrayList();
        result = dis1.getRangeGrades(13, 16);
        for (Grade g : result) {
            
            System.out.println(g.getGrade());
            
            course.associateDiscipline(dis1);
            course.registerStudent(student);
           course.desassociateDiscipline("LP2");

            
        }
        
    }
}
