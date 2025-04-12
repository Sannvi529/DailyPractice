package com.test01.extends_02.improve;

public class NotePad extends Computer{
    private char color;

    public NotePad(int cpu, double memory, String pan, char color) {
        super(cpu, memory, pan);
        this.color = color;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }
    public void info(){
        System.out.println(getDetails()+" color="+getColor());
    }
}
