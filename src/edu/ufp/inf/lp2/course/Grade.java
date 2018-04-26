package edu.ufp.inf.lp2.course;

import edu.ufp.inf.lp2.intro.Date;

public class Grade {

  private float grade;

  private Date date;

    private Discipline discipline;
    private Student student;

    public Grade(float grade, Date date, Discipline discipline) {
        this.grade = grade;
        this.date = date;
        this.discipline = discipline;
    }

    public Grade(float grade, Date date, Student student) {
        this.grade = grade;
        this.date = date;
        this.student = student;
    }
    
    

  public Discipline associatedDiscipline() {
 
  return this.getDiscipline();
  }

  public void associateDiscipline(Discipline d) {
      this.setDiscipline(d);
  }

  public Student associatedStudent() {
  return this.getStudent();
  }

  public void associateStudent(Student s) {
      this.setStudent(s);
  }

    /**
     * @return the grade
     */
    public float getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(float grade) {
        this.grade = grade;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the discipline
     */
    public Discipline getDiscipline() {
        return discipline;
    }

    /**
     * @param discipline the discipline to set
     */
    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
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