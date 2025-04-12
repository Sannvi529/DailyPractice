package com.zss.io;

/**
 * @author 张英琪
 */
public class enum02 {
    public static void main(String[] args) {
        enumTest autumn = enumTest.AUTUMN;
        autumn.show();
        enumTest spring = enumTest.SPRING;
        spring.show();
        Persom p = new Persom();
        p.setAge(13);
        p.setName("lili");
        p.setSex(Gender.女);
        System.out.println(p.toString());
        System.out.println("-----------------------");
        Gender sex = Gender.女;
        switch (sex){
            case 女:
                System.out.println("是个女孩");
                break;
            case 男:
                System.out.println("是个男孩");
                break;
        }


    }
}
