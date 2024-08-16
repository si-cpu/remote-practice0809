package oop.static_.singleton;

public class Main {



    public static void main(String[] args) {

        Singletone s = Singletone.getInstance();
        Singletone s1 = Singletone.getInstance();
        Singletone s2 =  Singletone.getInstance();
        Singletone s3 =  Singletone.getInstance();
        s.method1();
        s.method2();
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
