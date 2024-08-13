package basic.loop;

import java.util.zip.DeflaterOutputStream;

public class ContinueExample {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 5) continue;
			System.out.println(i  + " ");
		}
		System.out.println("\n반목문 종료!");
		System.out.println("===============================");

		int n = 0;
		while (n<10){
			System.out.print(n + " ");
			n++;
		}
		System.out.println("\n 반복문 종료...!");//
	}

}
