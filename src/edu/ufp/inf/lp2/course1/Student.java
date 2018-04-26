package edu.ufp.inf.lp2.course1;

import java.util.ArrayList;

public class Student {

    private ArrayList<Discipline> disciplines = new ArrayList();

    private String name;

    private String adress;

    private Date1 brith;

    private long number;

    private String email;

    public Student(String name, String adress, Date1 brith, long number, String email, ArrayList myDiscipline, ArrayList discipline) {
        this.name = name;
        this.adress = adress;
        this.brith = brith;
        this.number = number;
        this.email = email;

    }

    public int age() {
        Date1 today = new Date1();
        int age = today.getYear() - this.brith.getYear();
        if (this.brith.getMonth() == today.getMonth()) {

            if (this.brith.getDay() > today.getDay()) {

                age--;

            }

        }
        if (this.brith.getMonth() > today.getMonth()) {

            age--;
        }
        return age;
    }

    public void registerDiscipline(Discipline d) {
        int size = disciplines.size();
        for (int i = 0; i < size; i++) {
            Discipline dis = disciplines.get(i);
            if (dis.getName().compareTo(d.getName()) == 0) {
                System.out.println("Disciplina ja Registada: " + d.getName());
                return;
            }
        }
        disciplines.add(d);
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
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the brith
     */
    public Date1 getBrith() {
        return brith;
    }

    /**
     * @param brith the brith to set
     */
    public void setBrith(Date1 brith) {
        this.brith = brith;
    }

    /**
     * @return the number
     */
    public long getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(long number) {
        this.number = number;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
