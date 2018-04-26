package edu.ufp.inf.lp2.intro;

public class Person {

    private String idNumber;

    private String nome;

    private String address;

    private Date birthDate;

    public Person(String idNumber, String nome, String address, Date birthDate) {
        this.idNumber = idNumber;
        this.nome = nome;
        this.address = address;
        this.birthDate = birthDate;
    }

    /**
     * Função que calcula a idade
     *
     * @return idade
     */
    public int age() {
        Date today = new Date();
        int age = today.getYear() - this.getBirthDate().getYear();
        if(this.getBirthDate().getMonth() == today.getMonth()){
            if(this.getBirthDate().getDay() > today.getDay()){
                age--;
            }
        }
        if(this.getBirthDate().getMonth() > today.getMonth()){
            age--;
        }
        return age;
    }

    public boolean olderThan(Person p) {
        return false;
    }

    /**
     * @return the idNumber
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * @param idNumber the idNumber to set
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}
