package com.test01.Homework08;

public class SavingAccount extends BankAccount{
    private double rate = 0.01;
    private int count = 3;

    public SavingAccount(double balance) {
        super(balance);
    }
    public void earnMonthlyInterest(){//每个月调用一次
        count = 3;
        super.deposit(getBalance()*rate);
    }

    @Override
    public void deposit(double amount) {
        if(count > 0){
            super.deposit(amount);
            count--;
        }else{
            super.deposit(amount - 1);
        }

    }

    @Override
    public void withdraw(double amount) {
        if(count > 0){
            super.withdraw(amount);
            count--;
        }else{
            super.withdraw(amount+1);
        }
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
