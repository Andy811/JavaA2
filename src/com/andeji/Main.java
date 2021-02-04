package com.andeji;

import other.JavaA2;
import other.MyInterface;

public class Main extends JavaA2 {

    public static void main(String[] args) {
        JavaA2 javaA2 = new JavaA2();
        Main main = new Main();


        System.out.println(MyInterface.IndefString);//不同package interface 裡的 default 屬性可以呼叫
        //System.out.println(main.proString);//interface裡的default方法在implements後可以呼叫


    }


}
