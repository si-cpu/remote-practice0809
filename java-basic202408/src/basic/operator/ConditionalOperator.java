package basic.operator;

public class ConditionalOperator {

	public static void main(String[] args) {
		
		/*
		 # 3항 연산자
		 - 피 연산자(연산을 당하는 값)가 3개인 연산자를 말합니다.
		 - (조건식 ? 좌항 : 우항);
		 - 조건식을 비교하여 true일 경우에는 좌항이,
		  false일 경우에는 우항의 값이 도출됩니다.
		 */
		
		int x = 10, y = 20;
		
		String result = (x > y ? "x는 y보다 큽니다." : "x는 y보다 작습니다.");

		// 연산자의 우선순위 (단, 예외 존재하나 대부분은 풀림)
		// 1순위 괄호
		// 2순위 참조연산자(.)
		// 3순위 단항
		// 4순위 이항
		// 5순위 삼항
		// 6순위 대입
		System.out.println("result = " + result);
		
		//난수(랜덤값)를 발생시키는 메서드 Math.random()
		//0.0 이상 1.0 미만의 실수 난수값을 반환합니다. 0.0 <= x <1.0
		double rn = Math.random();
		System.out.println("rn = " + rn);

		//1~10까지의 정수 난수를 발생시키고 싶어요~		
		int rn2 = (int)(Math.random()*10 + 1);
		System.out.println("rn2 = " + rn2);
		
		//10 ~ 100까지의 정수 난수 발생
		int rn4 = (int) ((Math.random()*91) + 10);
		System.out.println("rn4 = " + rn4);
		
		//34 ~ 176까지의 정수 난수 발생
		int rn5 = (int) ((Math.random()*143) + 34);


		/*
         - 42 ~ 396사이의 난수를 발생시킨 후
         발생한 난수가 홀수인지 짝수인지의 여부를
         3항 연산식으로 출력해 보세요.
         ex)
         발생한 난수: XX
         3항 연산의 결과: 홀수입니다. or 짝수입니다.
        */
		int quiz = (int)(Math.random()*354 +42);
		System.out.println("발생한 난수 =" + quiz);
		//String quizResult = quiz % 2 = 1 ? "quiz는 홀수이다." : "quiz는 짝수이다,.";
		//System.out.println("quizResult = " + quizResult);
	}

}













