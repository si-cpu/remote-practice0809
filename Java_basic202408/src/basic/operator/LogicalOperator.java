package basic.operator;

public class LogicalOperator {

	public static void main(String[] args) {
		
		//비교(관계) 연산자 (<, <=, >, >=, ==, !=)
		//좌항과 우항의 크기를 비교하여, 결과값으로
		//항상 논리형 타입의 값(yes or no)을 도출합니다.
		int x = 10, y = 20;
		System.out.println(x != y);

		/*
		 # 논리 연산자 (&, &&, |, ||)
		 - 좌항과 우항의 논리값을 연산하여 하나의 논리값을 도출합니다.
		 1. &, &&(and): 양쪽 항의 논리값이 모두 true일 경우에만 true가 도출됩니다.
		 2. |, ||(or): 양쪽 항의 논리값 중 한 쪽만 true여도 true를 도출합니다.

		 &&, || -> 단축 평가 연산 (short circuit operation)
		 - 좌항의 연산 결과가 전체 연산 결과에 영향을 미칠 경우
		  우항의 연산을 진행하지 않습니다.
		 */

		System.out.println(x > 10 && (y / 0 == 10));
		// 좌항이 이미 에러 이므로 우항을 계산하지 않는다.

		System.out.println(x > 10 & (y / 2 == 10));
		// 좌항이 에러 일지라도 우항까지 계산하므로 에러를 표출한다.

		System.out.println(x >= 10 || (y / 0 == 10));
		// 좌항이 이미 true 이므로 우항을 굳이 계산하지 않는다,

		//논리 반전 연산자 (!: 단항)
		//단순히 논리값을 반전시킬 때 사용합니다.
		//true -> false, false -> true
		boolean isLoggedIn = false;
		if (!isLoggedIn){
			System.out.println("if문 실행!");
		}

		int z = 10;
		System.out.println(!(z == 10));


	}

}









