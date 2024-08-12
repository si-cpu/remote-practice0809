package basic.casting;

public class CastingExample3 {

	public static void main(String[] args) {
		
		char c = 'B';
		int i = 2;
		
		// 서로 타입이 다른 기본 데이터의 연산 시에는 데이터 타입이 큰 쪽에
		// 작은 쪽이 맞춰져서 자동으로 형 변환이 진행된 뒤에 연산이 진행됩니다.

		// 서로 다른 타입간의 연산은 작은쪽이 큰쪽을 따라간다.
		int intResult = c + i;
		char charResult = (char) (c + i);
		System.out.println("charResult = " + charResult);
		System.out.println("intResult = " + intResult);
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		
		int k = 10;
		double d = (double) k / 4; // k는 정수형이다. 따라서 10/4는 2.5이지만 정수형이므로 2가 나와야 한다. 따라서 강제로 캐스팅(형변환)을 진행하면 데이터 손실없이 계산이 가능하다.
		System.out.println("d = " + d);
		
		//int보다 작은 크기의 데이터 연산은 자동으로 값이
		//int로 변환되어 처리됩니다. (데이터 손실의 방지)
		// int와 int의 연산은 결과값이 int이다.
		// bouble의 연산을 위해서 직접 형변환을 진행해야 한다.

		byte b1 = 100;
		byte b2 = 70;
		System.out.println(b1 + b2);
		
		
		

	}

}













