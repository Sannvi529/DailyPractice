package com.zss.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 张英琪
 */
public class Test01 {
    public static void main(String[] args) throws UnknownHostException {
        //被default修饰
        InetAddress ia = InetAddress.getByName("172.17.222.28");
        System.out.println(ia);

        InetAddress ia1 = InetAddress.getByName("localHost");
        System.out.println(ia1);

        InetAddress ia2 = InetAddress.getByName("小叮当");
        System.out.println(ia2);
        System.out.println(ia2.getHostAddress());
        System.out.println(ia2.getHostName());

    }
}
