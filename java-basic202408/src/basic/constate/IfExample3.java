package basic.constate;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		
		/*
		 # if의 중첩문 
		 - else if문이 첫번째 조건식이 false일 경우 분기를 나눴다면
		  if의 중첩문은 첫번째 조건식이 true인 경우 분기를 나누는 방식입니다.
		  
		 # 변수의 사용 범위 (유효 범위)
		 - 변수는 선언된 블록 내에서만 유효합니다.
		  선언된 블록을 벗어나면 메모리에서 자동으로 소멸합니다.
		 - 변수를 선언할 때 사용 범위를 잘 파악해서 
		  전체적으로 사용할 변수라면 미리 선언해 두고,
		  지엽적으로 사용할 변수는 그 블록 범위 내에서만 사용하고
		  소멸시키는 것이 좋습니다.
		 */
 Scanner sc = new Scanner(System.in);

		System.out.println("성별을 입력하세요.(M/F)");
		String gender = sc. next();

		switch (gender){// 정수 또는 문자열만 가능함.
		// Java 14버전 개선된 switch
			case "m":
			case "M":
				System.out.println("남성입니다.");
				break;// 해당케이스만 실행ㅎ하고 switch문을 종료해라!
			          // switch문에서는 break 없이는 순서대로 모두 실행시키는 특성이 있음.

			case "f" : case "F" :
				System.out.println("여성입니다.");
				break;

			default: // case를 설정하지 않은 값들은 모두 default로 빠집니다.
				System.out.println("잘못된 입력입니다!");
		}
	}

}














