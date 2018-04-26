package edu.ufp.inf.lp2.bank;

public interface AccountMoneyI {

    public double withdraw(double amount) throws OverWithdraw;

    public double deposite(double amount) throws IlicitDepositedException;

    public double transfer(AccountMoneyI a, double amount) throws OverWithdraw, IlicitDepositedException;

}
