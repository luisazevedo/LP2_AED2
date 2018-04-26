package edu.ufp.inf.lp2.bank;

import edu.ufp.inf.lp2.intro.Date;
import edu.ufp.inf.lp2.intro.Person;
import java.util.ArrayList;


public class Client extends edu.ufp.inf.lp2.intro.Person{

  private String veatNumber;

    /**
   * 
   * @element-type Account
   */
  private ArrayList<Account> accounts = new ArrayList();

    public Client(String idNumber, String nome, String address, Date birthDate) {
        super(idNumber, nome, address, birthDate);
    }

    /**
     * @return the veatNumber
     */
    public String getVeatNumber() {
        return veatNumber;
    }
    
    public void addAcount (Account a){
        
        for (Account c :  accounts){
            
            if (c.getNumber() == a.getNumber()){
                
                System.out.println("Ja existe");
                return;
            }
            
            
        }
        this.accounts.add(a);
        System.out.println("O Cliente "+super.getNome()+" tem conta nr: "+a.getNumber());
        
    }

}