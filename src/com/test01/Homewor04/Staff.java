package com.test01.Homewor04;

public class Staff {
    private String name;
    private double perSalary;
    private int dayWork;
//    private double salary;
    private double grade;

    public Staff(String name, double perSalary, int dayWork,double grade) {
        this.name = name;
        this.perSalary = perSalary;
        this.dayWork = dayWork;
//        this.salary = salary;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerSalary() {
        return perSalary;
    }

    public void setPerSalary(double perSalary) {
        this.perSalary = perSalary;
    }

    public int getDayWork() {
        return dayWork;
    }

    public void setDayWork(int dayWork) {
        this.dayWork = dayWork;
    }

//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }

//    public String introduce(){
//        return ("name="+name+" perSalary="+perSalary+" dayWork="+dayWork+" salary="+salary+" grade="+grade);
//    }
    public void printSal(){
        System.out.println(name+" 的工资为"+dayWork*perSalary*grade);
    }
//        public void printSal(){
//            System.out.println("经理"+getName()+"的工资为"+dayWork*perSalary*grade);
//        }

}
