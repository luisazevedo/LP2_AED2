package edu.ufp.inf.lp2.course;


import java.util.ArrayList;



public class CourseClass {

  private String name;

    /**
   * 
   * @element-type Student
   */
 public ArrayList <Student> students= new ArrayList();
    /**
   * 
   * @element-type Discipline
   */
  public ArrayList <Discipline> disciplines = new ArrayList();
  
  
  public CourseClass(String name) {
        this.name = name;
    }

  public ArrayList<Student> searchStudent(String name) {
  return null;
  }

  public Student searchStudent(int number) {
  return null;
  }

  public void registerStudent(Student s) {
      this.students.add(s);
      System.out.println("O Aluno esta registado: " +s.getNome());
  }

  public Student unregisterStudent(String name) {
   for (Student s : students){
       
       if(s.getNome().compareTo(name)==0){
           
           this.students.remove(s);
       }
       System.out.println("Disciplina desregistada");
   }
   return null;
  }

  public void associateDiscipline(Discipline d) {
    this.disciplines.add(d);
      System.out.println("Esta Associado: " +d.getName());
  }

    

  public void desassociateDiscipline(String dname) {
  
      for(Discipline d : disciplines){
         
         if(d.getName().compareTo(dname)==0){
             
           this.disciplines.add(d);
            
         }
    System.out.println("Foi removido");
     }
  }

  public void launchGrade(String disciplineName, int studentNumber, float grade) {
  }

  public void associateGrade2Discipline(String disciplineName, long studentNumber, float grade) {
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

}