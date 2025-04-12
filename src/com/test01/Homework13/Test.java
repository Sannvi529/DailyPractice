package com.test01.Homework13;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("张英琪",'女',18,"足球","2023");
        student.info();



        Teacher teacher = new Teacher("张飞",'男',30,"象棋",5);
        teacher.info();


        Person[] people = new Person[4];
        people[0] = new Student("张英琪",'女',18,"足球","2023");
        people[1] = new Student("Mary",'女',20,"足球","2024");
        people[2] = new Teacher("张飞",'男',30,"象棋",5);
        people[3] = new Teacher("李建杰",'男',40,"象棋",8);
//      先创建一个对象  再调用对象内的  bubbleSort方法
        Test test = new Test();
        test.bubbleSort(people);

        //输出数组 为了方便输出内容 可以在类中 创建toString方法
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }

        // 遍历数组 调用test方法 实际上是 调用子类的方法
        for (int i = 0; i < people.length; i++) {
            test.test1(people[i]);//无法输出 除非 你将study、teach方法返回类型改为0，以sout的输出形式
        }
    }
    //写一个方法 完成年龄排序
    public void bubbleSort(Person[]people){
        Person temp = null;//Person类先置空
        for (int i = 0; i < people.length - 1; i++) {
            for(int j = 0;j < people.length - 1 - i;j++){
                if(people[j].getAge() < people[j+1].getAge()){
                    temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                }
            }
        }
    }
    //向下转型 调用（Person的子类中的）方法
    public void test1(Person p){
        if(p instanceof Student){
            ((Student) p).study();
        }else if(p instanceof Teacher){
            ((Teacher)p).teach();
        }else{
            System.out.println("do nothing...");
        }
    }

}
