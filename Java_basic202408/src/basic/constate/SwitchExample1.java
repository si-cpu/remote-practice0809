package basic.constate;

import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("성별을 입력하세요.(M/F)");
		String gender = sc.next();

		switch (gender) {// 정수 또는 문자열만 가능함.
			// Java 14버전 개선된 switch
			case "m":
			case "M":
				System.out.println("남성입니다.");
				break;// 해당케이스만 실행ㅎ하고 switch문을 종료해라!
			// switch문에서는 break 없이는 순서대로 모두 실행시키는 특성이 있음.

			case "f":
			case "F":
				System.out.println("여성입니다.");
				break;

			default: // case를 설정하지 않은 값들은 모두 default로 빠집니다.
				System.out.println("잘못된 입력입니다!");
		}
	}
}
















