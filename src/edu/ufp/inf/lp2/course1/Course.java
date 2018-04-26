package edu.ufp.inf.lp2.course1;

import java.util.ArrayList;

public class Course {

    private String name;

    /**
     *
     * @element-type Student
     */
    private ArrayList<Student> students = new ArrayList();

    public Course(String name) {
        this.name = name;
    }

    public void associateStudets(Student s) {
        int size = students.size();

        for (int i = 0; i < size; i++) {

            Student st = students.get(i);
            if (st.getName().compareTo(s.getName()) == 0) {

                System.out.println("Already Exit");
                return;

            }

        }
        students.add(s);
    }

    public Student desassociateStudents(String s) {

        for (Student sr : students) {
            if (sr.getName().compareTo(s) == 0) {
                this.students.remove(s);
            }
            return sr;
        }
        return null;
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
     * @return the students
     */
    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return name;
    }

}
