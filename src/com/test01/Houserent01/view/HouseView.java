package com.test01.Houserent01.view;

import com.test01.Houserent.domain.House;
import com.test01.Houserent.service.HouseService;
import com.test01.Houserent.utils.Utility;

public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(2);
    private int delId;
    private char choice;


    public void UpdateHouse(){
        System.out.println("--------------修改房屋信息-----");
        System.out.println("请选择待修改房屋的编号（-1退出）");
        int updateId = Utility.readInt();
        if(updateId == -1){
            System.out.println("----------已放弃修改信息----");
            return;
        }
        House house = houseService.findById(updateId);
        if(house == null){
            System.out.println("未找到该房屋信息");
        }
        System.out.println("姓名("+house.getName()+"):");
        String name = Utility.readString(4,"");
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
        System.out.println("------------------查找房屋信息------------");
        System.out.println("请输入你要查找房屋的编号(-1退出)：");
        int findId = Utility.readInt();
        if(findId == -1){
            System.out.println("你已放弃查找");
            return;
        }
        House house = houseService.findById(findId);
        if(house != null){
            System.out.println(house);
        }else{
            System.out.println("该房屋信息不存在");
        }
        //判断id存在
    }

    public void delete(){
        System.out.println("-------------删除房子---------");
        System.out.println("请选子要删除房屋的编号(-1退出)：");
        delId = Utility.readInt();
        if(delId == -1){
            System.out.println("你已放弃删除");
            return;
        }
        System.out.println("确认是否删除(y/n):请小心选择:");
        choice = Utility.readConfirmSelection();
        if(choice == 'Y'){
            //房屋存在
            if(houseService.deleteHouse(delId)){
                System.out.println("已删除");
            }else{
                System.out.println("房屋编号不存在");
            }
        }else{
            System.out.println("你已放弃删除");
        }


    }

    public void addHouse(){
        System.out.println("==================添加房屋信息===============");
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
        House newHouse = new House(0,name,phone,address,rent,state);
        if(houseService.add(newHouse)){
            System.out.println("==================房屋分配成功=================");

        }else{
            System.out.println("==================房屋分配失败=================");

        }
    }
    public void listHouse(){
        System.out.println("==============房屋列表==============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租）");
        House[] house = houseService.list();//加载信息
        for (int i = 0; i < house.length; i++) {
            if(house[i] == null){
                break;
            }else{
                System.out.println(house[i]);

            }
        }

        System.out.println("==============加载完毕==============");

    }
    public void exit(){
        System.out.println("要退出吗(y/n)");
        char c = Utility.readChar();
        if(c == 'Y'){
            loop = false;
        }

    }
    public void mainMenu(){
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
