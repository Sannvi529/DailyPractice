package com.zss.io;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author 张英琪
 */
public enum enumTest implements Testenum02{
    SPRING{
        @Override
        public void show() {
            System.out.println("这时春天");
        }
    },
    SUMMER{
        @Override
        public void show() {
            System.out.println("这是夏天");
        }
    },
    AUTUMN{
        @Override
        public void show() {
            System.out.println("这时秋天");
        }
    },
    WINTER{
        @Override
        public void show() {
            System.out.println("这是冬天");
        }
    };

    @Override
    public void show() {
        System.out.println("这是季节");
    }
}
