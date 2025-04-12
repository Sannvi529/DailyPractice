package com.zss.generics;

import jdk.nashorn.internal.ir.CallNode;

/**
 * @author 张英琪
 */
public class Test01<E> extends test<E> {
     E m;
     E n;

    public static void main(String[] args) {
        //泛型
        test<String> t2 = new test<>();
        t2.a("aaa");
        t2.a("aa ");
        System.out.println(t2.aa);
        Test01<Integer> t1 = new Test01<>();
        t1.m = 1;
        System.out.println(t1.m);
        arr<String,Integer,Integer> as = new arr<>();
        System.out.println(as.a);
        as.a("aaa");

    }
}
class  m<E>{
    public void a(E a){

    }
    //泛型方法
    public <T> void b(T a){

    }


}
class test<E> {
    E aa ;
    public void a(E b){
        test<String> t1 = new test<>();
        t1.aa = "nihao";
        System.out.println(t1.aa);
        System.out.println(b);
    }

}
class arr<E,B,A>{
    E[] a = (E[]) new Object[12];
    A n;
    public void a(E a){
        arr<String,Integer,Integer> as = new arr<>();
        as.a = new String[]{"1", "2"};
        System.out.println(a);
    }
}