package com.test01.encap01;

public class Account {



        //封装时，不要忘记private
        private String name;
        private double balance;
        private String code;
//    int len =name.length();
        //提供两个构造器

        public Account() {
        }

        public Account(String name, double balance, String code) {
            setName(name);
            setBalance(balance);
            setCode(code);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if(name.length() >= 2 && name.length() <= 4 ) {
                this.name = name;
            }else{
                System.out.println("名字错误，名字长度2-4，设为：无名");
                this.name = "无名";
            }
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            if(balance > 20) {
                this.balance = balance;
            }else{
                System.out.println("余额不足，请充钱，若访问余额，自动显示为0，但真实金额，以实际为准");
            }
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            if(code.length() == 6) {
                this.code = code;
            }else{
                System.out.println("输入错误，密码需输入六位，给定默认值：000000");
                this.code="000000";
            }
        }
        public void info(){
            System.out.println("name="+getName()+" balance="+getBalance()+" code="+getCode());
        }



}
