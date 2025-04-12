package com.test01.Homework08;

public class Test {
    public static void main(String[] args) {
//        CheckingAccount. checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(100);
//        System.out.println(checkingAccount.getBalance());

        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);

        System.out.println(savingAccount.getBalance());
        savingAccount.earnMonthlyInterest();
        System.out.println(savingAccount.getBalance());

    }
}
