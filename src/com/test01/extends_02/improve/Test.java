package com.test01.extends_02.improve;

public class Test {
    public static void main(String[] args) {
        PC pc = new PC(1,1,"C盘","张英琪");
        NotePad notePad = new NotePad(1,1,"b盘",'粉');
        pc.info();
        notePad.info();
    }
}
