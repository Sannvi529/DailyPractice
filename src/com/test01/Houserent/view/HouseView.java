package com.test01.Houserent.view;

import com.test01.Houserent.domain.House;
import com.test01.Houserent.service.HouseService;
import com.test01.Houserent.utils.Utility;

public class HouseView {
    private boolean loop = true;//终止菜单选择
    private char key = ' ';//用户选择
    private HouseService houseService = new HouseService(2);
    private int code;
    private char choice;
    //1.创建HouseService类 指向houseService
    //设置数组大小为10
    //当调用某个包里的class的构造器时，先new一个  名字（参数）
    //创建类之后，就可以调用类中的成员了   ----类似main方法 --先创建对象 再调用成员
    //编写listHouse()显示房屋列表



    //修改房屋信息
    //1.选择要修改的id（exist）findById(int findId)
    // 2.
    public void UpdateHouse(){
        System.out.println("--------------修改房屋信息-----");
        System.out.println("请选择待修改房屋的编号（-1退出）");
        int updateId = Utility.readInt();
        if(updateId == -1){
            System.out.println("----------已放弃修改信息----");
            return;
        }
        //根据输入得到的updateId，查找对象
        House house = houseService.findById(updateId);
        if(house == null){
            System.out.println("-------房屋编号不存在-");
            return;
        }
        System.out.print("姓名("+house.getName()+"):");;
        String name = Utility.readString(8,"");
        //这里表示用户如果不想修改信息，就直接回车，默认“”
        if(!"".equals(name)){
            house.setName(name);
        }

        System.out.print("电话("+house.getPhone()+"):");
        String phone = Utility.readString(12,"");
        if(!"".equals(phone)){
            house.setPhone(phone);
        }

        System.out.print("地址("+house.getAddress()+"):");
        String address = Utility.readString(18,"");
        if(!"".equals(address)){
            house.setAddress(address);
        }

        System.out.print("租金("+house.getRent()+"):");
        int rent = Utility.readInt(-1);
        if(rent != -1){
            house.setRent(rent);
        }

        System.out.print("状态("+house.getState()+"):");
        String state = Utility.readString(3,"");
        if(!"".equals(state)){
            house.setState(state);
        }

        System.out.println("---------------修改成功---------");


    }
    public void findHouse(){
        System.out.println("----------------------查找房屋信息------------------");
        System.out.println("请输入要查找的id:");//exist inexistence
        int findId = Utility.readInt();
        //调用方法
        House house = houseService.findById(findId);
        if(house != null){
            System.out.println(house);
        }else{
            System.out.println("未查找到相应信息");
        }
    }

    public void exit(){
        //判断输入的是不是y/n
        char c = Utility.readConfirmSelection();
        if(c=='Y'){
            //判断是不是y 退出菜单
            loop = false;
        }
    }


    public void delete(){
        System.out.println("------------------------删除房屋----------------------");
        System.out.println("请选择待删除房屋编号(-1退出)：");
        code = Utility.readInt();
        if(code == -1){
            System.out.println("---------放弃删除--------");
            return;
        }
        //如何做删除房屋编号的业务？
        System.out.println("确认是否删除(y/n):请小心选择:");
       // choice = Utility.readString(1);
//        System.out.println("请输入你的选择：(y/n)");
        choice = Utility.readConfirmSelection();
        if(choice == 'Y') {
            if(houseService.deleteHouse(code)){
                System.out.println("-----------------------删除完成-------------------------");

            }else{
                System.out.println("-----------------房屋编号不存在，删除失败-------------------");
            }
        }else{
            System.out.println("---------放弃删除--------");

        }
    }



    //编写addHouse() 接收输入，创建House对象 调用add()方法
    public void addHouse(){
        System.out.println("==================添加房屋===============");
        System.out.print("姓名： ");
        String name = Utility.readString(4);//字符串长度《 4
        System.out.print("电话： ");
        String phone = Utility.readString(4);
        System.out.print("地址： ");
        String address = Utility.readString(14);
        System.out.print("月租： ");
        int rent = Utility.readInt();
        System.out.print("状态： ");
        String state = Utility.readString(3);
        //创建一个新的House对象，注意id是系统分配的，用户不能输入
        House newHouse = new House(0, name, phone, address, rent, state);
        if(houseService.add(newHouse)){
            System.out.println("==================房屋分配成功=================");

        }else{
            System.out.println("==================房屋分配失败=================");

        }

    }

    public void listHouse(){
        System.out.println("==============房屋列表==============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租）");
        House[] list = houseService.list();
        //房屋数组中的信息 由houseService.list()提供
        //调用houseService.list()
        //得到所有的房屋信息
        //遍历数组
        for (int i = 0; i < list.length; i++) {
            //如果数组初始化对象没有那么多 就判断一下
            if(list[i] == null){
                break;
            }
            System.out.println(list[i]);//toString  ----House对象
        }
        System.out.println("===========房屋列表显示完毕=================");
    }
    public void mainMenu(){
        //打印菜单 do while 控制
        do{
            System.out.println("=============房屋出租系统菜单================");
            System.out.println("\t\t\t1 新增房源");
            System.out.println("\t\t\t2 查找房屋");
            System.out.println("\t\t\t3 删除房屋信息");
            System.out.println("\t\t\t4 修改房屋信息");
            System.out.println("\t\t\t5 房屋列表");
            System.out.println("\t\t\t6 退       出");
            System.out.println("\t\t\t请输入你的选择(1-6)");
           //用户选择
            key = Utility.readChar();
            //设置选择对应的通道
            switch(key){
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delete();
                    break;
                case '4':
                    UpdateHouse();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    break;
                default:
                    System.out.println("输入范围（1-6），请重新输入");
                    break;
            }
        }while(loop);
    }




}
