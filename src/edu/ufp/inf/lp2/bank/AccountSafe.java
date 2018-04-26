package edu.ufp.inf.lp2.bank;

public class AccountSafe extends Account implements AccountMoneyI, AccountRelationshipsI {

    public AccountSafe(String number, double balance, Client owner) {
        super(number, balance, owner);
    }

    @Override
    public double withdraw(double amount) throws OverWithdraw {
        if (this.getBalance() > amount) {

            this.setBalance(this.getBalance() - amount);

        } else {

            throw new OverWithdraw("Not Allowed to withdraw above balance");

        }
        return getBalance();
    }

    @Override
    public double deposite(double amount) throws IlicitDepositedException {
        if (amount > 0) {
            this.setBalance(this.getBalance() + amount);
        } else {
            throw new IlicitDepositedException("Nao é possivel depositar valores negativos !");
        }
        return getBalance();
    }

    @Override
    public double transfer(AccountMoneyI a, double amount) throws OverWithdraw, IlicitDepositedException {
        double b = this.withdraw(amount);
        try {
            a.deposite(amount);
        } catch (IlicitDepositedException e) {
            this.setBalance(this.getBalance() + amount);
            throw new IlicitDepositedException("Nao é possivel depositar valores negativos, anterior levantamento foi corrigido !");
        }
        return b;
    }

}
