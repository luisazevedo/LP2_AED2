package edu.ufp.inf.lp2.bank;

public class Account {

    private String number;

    protected double balance;

    protected Client owner;

    public Account(String number, double balance, Client owner) {
        this.number = number;
        this.balance = balance;
        this.owner = owner;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the owner
     */
    public Client getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(Client owner) {
        this.owner = owner;
    }

}
