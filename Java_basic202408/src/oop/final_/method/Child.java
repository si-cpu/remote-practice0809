package oop.final_.method;

public class Child extends Parent {

    @Override
    void method2() {
        super.method2();
    }

    @Override
    void method1() {
        super.method1();
    }
}

//    void method3 (){
//      final 매서드는 overriding을 막습니다. (물려주는대로 사용해라~!)
//    }