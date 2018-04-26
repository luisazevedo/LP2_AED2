package edu.ufp.inf.lp2.bank;

public class AccountUnsafe extends Account implements AccountMoneyI, AccountRelationshipsI {



    public AccountUnsafe(String number, double balance, Client owner) {
        super(number, balance, owner);
    }
    
     public double transfer(AccountMoneyI a, double amount) {

        this.withdraw(amount);
        ((AccountUnsafe)a).deposite(amount);
        return this.getBalance();
    }

    public double balance() {
        System.out.println("O saldo da conta nr " + super.getNumber() + " é " + super.balance);
        return super.balance;

    }

    public double withdraw(double amount) {

        super.balance -= amount;
        return super.balance;

    }

    public double deposite(double a) {

        System.out.println("Foi feito um deposito de " + a + " € na conta nr " + super.getNumber());
        super.balance += a;
        return this.balance;

    }

    public void associatedClient(Client c) {

        if (super.owner == null) {

            super.setOwner(c);
            c.addAcount(this);

        }
        System.out.println("O Cliente : " + c.getNome() + " foi associado a conta nr:" + super.getNumber());

    }
}
