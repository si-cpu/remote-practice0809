package basic.array;

import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {

		// 배열의 특징
		// 1. 동종 모음 구조: 같은 데이터 타입 만을 가질수있다.
		// 2. 크기가 불변임 : 크기를 동적으로 늘이거나 줄일 수 없다.

		// 배열의 생성 순서

		// 1. 배열 변수 선언
		int[] numbers;

		// 2. 배열 객체를 생성
		numbers = new int[5];
		System.out.println("numbers = " + numbers); // 주소값

		//3. 배열 내부 초기화
		numbers[0] = 50;
		numbers[1] = 77;
		numbers[2] = (int) 3.14;
		numbers[3] = numbers[0] + 20;
		numbers[4] = 100;
/*
		numbers[5] = 10;
		numbers[6] = 75; // runtime error 실행을 했을때 발생하는 에러 , 문법상 문제가 없다는 것임.
*/

		// 배열의 길이
		System.out.println(numbers.length);

		// 배열 내의 값 출력(반복문 이용)
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("numbers[%d]: %d\n",i,numbers[i]);
		}
		System.out.println("==================================================");

		//배열의 순회 foreach (향상된 for문)
		for (int number : numbers) {
			System.out.println("n = " + number);
		}// 배열내의 값을 반복하는 동작  티언어에서도 많이 사용함. 빈출 구문

		// 배열 내부를 문자열 형태로 간결하게 출력.
		System.out.println(Arrays.toString(numbers));

		//배열 한번에 만들기
		int[] pointList = new int[]{10,20,30,40}; // 배열 선언 후 내부에 기입
		System.out.println(Arrays.toString(pointList));

		// 만약 배열 변수 선언과 동시에 값을 초기화 할때
		// 한번만 가능한 문법
		String[] pets = {"명뭉이", "짹짹이", "야옹이"}; 
		// pets = {"명뭉이", "짹짹이", "야옹이", "춘식이"}; 배열에서 크기가 고정되어 있다.
		pets = new String[] {"명뭉이", "짹짹이", "야옹이", "춘식이"}; // 생성시에만 이렇게 만들어짐.

		System.out.println("===========================================");

		// 배열을 생성만 하고 값을 안 넣으면?
		// -> 각 타입의 기본값으로 미리 초기화 됨.
		// 기본값 : 정수 0, 실수 0.0, 논리 false, 문자(char) 공백, 기타 null


		byte[] bArr = new byte[3];
		double[] dArr = new double[4];
		boolean[] blArr = new boolean[5];
		String[] sArr = new String[8];

		System.out.println(Arrays.toString(bArr));
		System.out.println(Arrays.toString(dArr));
		System.out.println(Arrays.toString(blArr));
		System.out.println(Arrays.toString(sArr));


		String[] week = {"월", "화", "수", "목", "금", "토", "일"};

		/*
			for(int i=0; i<week.length; i++) {
			System.out.println(week[i] + "요일 좋아~!");
			}
		*/

		for(String day : week) {
			System.out.println(day + "요일 좋아~");
		}

























	}
}
















