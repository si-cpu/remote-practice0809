package oop.modi.member.pac2;

import oop.modi.member.pac1.A;

public class C {

    public int C1;
    int C2;
    private int C3;

     void test(){

         A a1 = new A(100);// public
//         A a2 = new A(4.44); // default
//         A a3 = new A(false) // private

         a1.f1 = 10;
//         a1.f2 = 10; // default
//         a1.f3 = 10; // private

         a1.m1();
//         a1.m2();
//         a1.m3();



     }

}
