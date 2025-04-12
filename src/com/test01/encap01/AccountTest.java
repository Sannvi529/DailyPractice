package com.test01.encap01;

public class AccountTest {
    public static void main(String [] args ){
        Account account = new Account();
        account.setName("张英琪");//方法调用时要传参 属性调用时要赋值
        account.setCode("123456");
        account.setBalance(30.0);
        account.info();
    }
}
