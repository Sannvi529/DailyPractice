package com.test01.Ploy01.ployarr;

public class Array {
    public static void main(String[] args) {

        Person[] people = new Person[5];
        people[0] = new Person("Jack",18);
        people[1] = new Student("mack",18,99);
        people[2] = new Student("rose",18,99);
        people[3] = new Teacher("milk",28,20000);
        people[4] = new Teacher("smith",30,20000);
        "hello".equals("abc");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].say());
            if(people[i] instanceof Student){//判断类型是否为相应类型
                Student student = (Student)people[i];
                student.study();
            }else if(people[i] instanceof Teacher){
                ((Teacher)people[i]).teach();
            }else if(people[i] instanceof Person){

            }else{
                System.out.println("输入类型错误，自己检查");
            }
        }
    }
}
