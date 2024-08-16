package basic.array;

import java.util.Scanner;

public class Arraysearch {

    public static void main(String[] args) {

        String[] foods = {"pizza", "pasta", "chicken", "fork"};

        Scanner sc = new Scanner(System.in);
        System.out.println("찾고 싶은 음식을 입력하세요.: ");
        String name = sc.next();

                    /*
             - 자바에서는 문자열 동등 비교 시 '==' 연산자를
              사용하면 제대로 비교가 되지 않습니다.

             - 문자열 String 타입이 기본 데이터 타입이 아닌
              객체 참조 타입이기 때문입니다.
              객체 참조 타입은 해당 값을 직접 들고 있는 게 아니라
              객체의 주소값을 들고 있기 때문에,
              문자열이 아무리 같더라도 주소가 다르면 false를
              도출합니다.

             - 그러므로 문자열 동등 비교를 진행할 때는
             [비교문자열1.equals(비교문자열2)] 를 사용하여
             진행해야 합니다.
             */
        boolean flag = false; // 불린 매력적인 방법이다. 하나의 스위치를 만들고 싶을 때 사용하자 무조건

        for (int i = 0; i < foods.length; i++) {
            if (name.equals(foods[i])) {//문자열 비교에서 ==는 사용이 불가하다. 따라서 equals 함수를 이용해서 비교해야 한다, equals 함수는 boolen값으로 주기 때문에 !는 사용가능하다.
                System.out.println("탐색완료!");
                System.out.println("인덱스 = " + i + "번");
                flag = true;
                break;
/*            } else if (i == foods.length-1) {
                System.out.println("없는음식입니다.");*/

            }
        }
        if (!flag){
            System.out.println("없는음식입니다.");
        }
    }
}
