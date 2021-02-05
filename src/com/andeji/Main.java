package com.andeji;

import other.JavaA2;
import other.MyInterface;

public class Main extends JavaA2 {

    public static void main(String[] args) {
        //嘗試直接用JavaA2物件呼叫該物件的屬性
        JavaA2 javaA2 = new JavaA2();
        String a2PublicString = javaA2.a2PublicString;
        //String a2ProtectedString = javaA2.a2ProtectedString;
        //String a2DefaultString = javaA2.a2DefaultString;
        //String a2PriString = javaA2.a2PriString;



        //嘗試用子類別物件呼叫JavaA2的屬性
        Main main = new Main();
        String PublicString = main.a2PublicString;
        String ProtectedString = main.a2ProtectedString;
        //String DefaultString = main.a2DefaultString;
        //String priString = main.a2PriString;


        String inDefString = MyInterface.inDefString;//interface的預設屬性

        //main.deMethod();//interface裡的default方法在implements後可以呼叫
        //MyInterface.inPubMethod();//不能直接呼叫實體方法
        main.inPubMethod();//因Main extends JavaA2，且JavaA2 implements MyInterface

        javaA2.overloadMethod();
        javaA2.overloadMethod(1);





    }


}
