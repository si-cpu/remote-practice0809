package basic.loop;

import java.util.Scanner;

public class LoopNestingQuiz {
    public static void main(String[] args) {
       /*
		 - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
		  가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.
		 ex)
		 입력받은 수 -> 30
		 소수: 2 3 5 7 11 13 17 19 23 29
		 소수의 개수: 10개
	   */
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력해주세요! :");
        int num = sc.nextInt();

        int count =0; // 소수의 개수가 몇개 인지를 기억할 변수. 반복문 내에 선언되면 x

        for (int i=1; i<=num; i++){
            int cnt = 0;// 소수판별을 위해 나누어 떨어진 횟수를 세줄 변수이자 반복문 내부에 선언을 해서 i++이 될때마다 0으로 초기화 해야함.
            for (int j = 1; j<=i; j++){
                if (i%j ==0){
                    cnt++;
                }
            }
            if (cnt == 2){
                System.out.print(i + " ");
                count++;
            }

        }
        System.out.println("\n소수의 개수는" + count + "개이다.");

        sc.close();
        // 변수는 자기가 태어난 곳에서만 사용이 가능하다. 블록에서 나오면 소멸해버린다.













    }
}
