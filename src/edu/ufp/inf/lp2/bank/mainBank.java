/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.bank;

import edu.ufp.inf.lp2.intro.Date;

/**
 *
 * @author bernardomaia
 */
public class mainBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws OverWithdraw  , IlicitDepositedException{
        Client c = new Client("123456789", "Bernardo Maia", "Rua X", new Date(9, 02, 2017));
        Client c1 = new Client("123546789", "Jorge Maia", "Rua Y", new Date(15, 03, 2017));
        Account a = new Account("789", 200, c1);
        Account a1 = new Account("908", 500, c);
        //adicionar contas
        c.addAcount(a1);
        c1.addAcount(a);

        AccountUnsafe au = new AccountUnsafe("908", 2000, c1);
        
        //associar contas
        au.associatedClient(c);
        
        au.balance();
        au.deposite(2000);
        au.withdraw(3000);
        
        
         AccountMoneyI a2 = new AccountSafe ("908",200,c);
    
    
         try{

         a2.withdraw(2000);
         a2.deposite(-100);
         }catch(OverWithdraw e){
        
        System.out.println(e.toString());
        
    }catch (IlicitDepositedException e){
        
             System.out.println(e.toString());
        
        
    }
         
}
}