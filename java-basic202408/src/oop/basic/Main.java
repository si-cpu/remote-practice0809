package oop.basic;

public class Main {

    public static void main(String[] args) {

        /*
        설계도에 작성한 속성과 기능을 사용하려면
        반드시 실체(객체)를 생성해야 합니다.
        클래스만 제작된 채로는 아무 기능도 수행할 수 없습니다.
         */
        Pen redpen = new Pen();
        Pen bluepen= new Pen();

        // 참조연산자(.)를 통해 객체로 접근한 후
        // 속성을 지정하고 기능을 사용할 수 있습니다.

        redpen.color = "빨강";
        redpen.price = 500;
        bluepen.color = "파랑";
        bluepen.price = 600;

        redpen.write();
        bluepen.write();
        redpen.priceinfo();
        bluepen.priceinfo();
        //주소는 다르지만 결국 객체는 동일하게 움직인다 안정성을 확보할수있다.




    }
}
