package basic.loop;

import java.util.Scanner;


public class ForExample {
	public static void main(String[] args) {


		int total = 0;
		for (int i = 1; i <= 10; i++) {
			total += i;
			// int i =1 이 1순위, i<=10이 2순위, i++이 4순위, total += 1이 3순위 이다

		}// 1~200 정수 중 6의 배수 이면서 12의 배수는 아닌수를 가로로 출력 (for)
		for (int i = 0; i < 200; i++) {
			if (i % 6 == 0 && i % 12 != 0) {
				System.out.print(i + " ");
			}//for 문은 범위가 명확할 떄 사용하는 것을 지향한다. 쉽기 때문에 ㅎㅎ
			// , 반면 while문은 범위가 명확하지 않을 때 사용한다.


		}
	// 정수를 하나 입력받아서
	// 입력받은 정수까지의 팩토리얼 값을 구하세요.
	Scanner sc = new Scanner(System.in);
	System.out.println("정수입력 : ");
	int num	= sc.nextInt();
		int fac = 1;// 팩토리얼 최종 값을 담을 변수
		for (int i = num; i >= 1 ; i--) {
			fac *= i;
		}
		System.out.printf("%d! = %d/n", num, fac);

	}
}















