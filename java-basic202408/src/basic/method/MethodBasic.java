package basic.method;

/*
# 메서드 (method)

- 메서드는 반복되는 코드 블록에 이름을 붙여놓은 것입니다.

- 메서드는 반복되는 코드를 줄여주고
 좀 더 구조화 시켜서 우리가 코드를 알아보기 쉽게 합니다. (코드의 모듈화)

- 메서드는 선언하는 과정과 호출하는 과정으로 나누어집니다.

- 메서드의 선언은 메서드 내부에서는 불가능합니다. 새로운 메서드의 선언은
 반드시 메서드 블록 외부 and 클래스 블록 내부에서만 가능합니다.

- 메서드의 호출은 메서드나 생성자 내부에서만 가능합니다. // 생성자는 객체에서 설명받을 예정.

- 메서드의 호출은 곧 메서드를 사용하는 것을 의미하며,
1. 메서드가 필요로 하는 데이터(매개값)를 호출부에서 전달하면
2. 그 값을 받아서 메서드 내부로 전달하고, 로직이 실행됩니다.
3. 실행 결과값을 메서드를 호출한 곳으로 다시 반환합니다.
4. 반환된 값은 변수에 담아서 저장하거나, 출력하는 등 다양하게 활용합니다.
*/


public class MethodBasic {

    //매서드의 선언!!! (static은 뒤에서 알려줄 예정 객체공부하면서 배울예정!!!)
    static int calcTotal(int end){ // 여기서 end 변수는 매개변수라고 함. 또한 return에서 받는 값의 타입을 적어주어 잘쓰게 해줌.
        int total = 0;
        for (int i = 0; i <= end; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {


        System.out.println("1~100까지의 누적합은 " + calcTotal(100));
        System.out.println("1~100까지의 누적합은 " + calcTotal(200));
        System.out.println("1~100까지의 누적합은 " + calcTotal(300));
        System.out.println("1~100까지의 누적합은 " + calcTotal(400));
        System.out.println("1~100까지의 누적합은 " + calcTotal(500));
        System.out.println("1~100까지의 누적합은 " + calcTotal(600));
        System.out.println("1~100까지의 누적합은 " + calcTotal(700));
        System.out.println("1~100까지의 누적합은 " + calcTotal(800));
        System.out.println("1~100까지의 누적합은 " + calcTotal(900));
        System.out.println("1~100까지의 누적합은 " + calcTotal(1000));



    }
}
