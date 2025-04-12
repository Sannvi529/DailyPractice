package com.test01.extends_.improve;

public class Sub extends Base {//子类
  public Sub(){
      super("张英琪",18);
      System.out.println("Sub()...");
  }
  public void sayOk(){
      //我们发现父类的非private属性和方法
      //都可以访问
  }
}
