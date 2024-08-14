package prectice;

import basic.loop.WhileExample1;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
 /*
         1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
          지속적으로 문제를 출제한 후 정답을 입력받으세요.
          사용자가 0을 입력하면 반복문을 탈출시키세요.
         2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("***연산 퀴즈***");
        System.out.println("#종료하시려면 0을 입력해주세요.");

        int cCount = 0;
        int iCount = 0;

        while(true){

            int rn1 = (int) ((Math.random()*100)+ 1);
            int rn2 = (int) ((Math.random()*100)+ 1);
            int operator = (int)(Math.random()*2); // 0 or 1

            int correct;
            if (operator == 0){
                System.out.printf("%d + %d = ???\n", rn1, rn2);
                correct = rn1 + rn2;
            }else {
                System.out.printf("%d - %d = ???\n", rn1, rn2);
                correct = rn1 +rn2;
            }

            System.out.println(" > ");
            int answer = sc.nextInt();

            if(answer == correct){
                System.out.println("정답입니다!");
                cCount++;
            } else if (answer == 0) {
                System.out.println("종료합니다!");
                break;
            }else {
                System.out.println("틀렸습니다!");
                iCount++;
            }

        }
        System.out.println("=======================================");
        System.out.println("정답횟수는  " + cCount + "회");
        System.out.println("오답횟수는  " + iCount + "회");

        sc.close();











    /*
		 - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
		  가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.
		 ex)
		 입력받은 수 -> 30
		 소수: 2 3 5 7 11 13 17 19 23 29
		 소수의 개수: 10개
	   */







            /*
        1. 정수를 두개 입력받으세요. (x, y)
        2. x부터 y까지의 누적합계를 while을 사용하여 구하는 코드를 작성하세요.
        ex) 입력: 3, 7 -> "3부터 7까지의 누적합계: 25"
        처음에는 x에 무조건 작은 값이 들어올 것이라고 예상하고 작성하겠습니다.
        다 하신 분은 만약 x에 큰 값이 들어왔을 경우에는
        어떻게 대처할 지 생각해 보세요.
        (x에 큰 값이 들어와도 정상적으로 출력이 되었으면 좋겠습니다.
        입력: 7, 3 -> "3부터 7까지의 누적합계: 25")
        - while문을 if else 로 나눠서 두번 쓰는 것은 지양하겠습니다.
       */
    }
}
