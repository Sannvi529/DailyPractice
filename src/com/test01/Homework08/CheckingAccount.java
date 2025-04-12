package com.test01.Homework08;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);//存款的钱中扣一元的手续费
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);//取钱的时候 多取一元的手续费
    }
}
