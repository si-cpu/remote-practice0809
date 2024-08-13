package basic.constate;


import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {
		
		/*
        - 정수를 3개 입력받아서, 세 정수 중 어느 수가 큰 지
        혹은 같은지를 판별하시면 됩니다.
        ex)
        입력받은 수: 4, 7 -> 7이 큰 수 입니다.
        입력받은 수: 10, 3 -> 10이 큰 수 입니다.
        입력받은 수: 5, 5 -> 같은 수 입니다.
       */
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1 : ");
		int num1 = sc.nextInt();
		System.out.println("정수2 : ");
		int num2 = sc.nextInt();
		System.out.println("정수3 : ");
		int num3 = sc.nextInt();

		int max, mid, min ;

		if (num1 > num2 && num1 > num3) {
			max = num1;
			if (num2 > num3) {
				mid = num2;
				min = num3;
			} else {
				mid = num3;
				min = num2;
			}
		} else if (num2 > num1 && num2 > num3) {
			max = num2;
			if (num1 > num3) {
				mid = num1;
				min = num3;
			} else {
				mid = num3;
				min = num1;
			}

		} else {
			max = num3;
			if (num1 > num2) {
				mid = num1;
				min = num2;
			} else {
				mid = num2;
				min = num1;
			}
		}
		System.out.println("=============================================");
		System.out.println("max = " + max);
		System.out.println("mid = " + mid);
		System.out.println("min = " + min);
	}
}









