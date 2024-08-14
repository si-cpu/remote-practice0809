package oop.constructor;

public class main {

    public static void main(String[] args) {

        Phone basic = new Phone();
        basic.showSpec();
        System.out.println("==============================");

        Phone galaxy = new Phone("갤럭시 S24", "red",20000000);
        galaxy.showSpec();

        System.out.println("==============================");

        Phone iphone = new Phone("iphone pro14", "white", 140000000);
        iphone.showSpec();

        System.out.println("==============================");

        Phone G7 = new Phone("G7","red_whine",4000000);
        G7.showSpec();


    }
}
