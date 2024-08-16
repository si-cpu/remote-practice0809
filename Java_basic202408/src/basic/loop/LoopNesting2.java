package basic.loop;

public class LoopNesting2 {

	public static void main(String[] args) {
		/*
		*
		**
		***
		****
		*****
		*/

/*		int star = 1;
		for (int i = 0; i <= 5 ; i++) {
			for (int j = 1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}*/


		/*
		     *
		    **
		   ***
		  ****
		 *****
		 */
		int star = 1;
		for (int i = 0; i <= 5; i++) {
			//공백을 만드는 for문
			for (int k = 4; k >= i ; k--) {
				System.out.print(" ");
			}
			// 별찍는for 문
			for (int j = 1; j <=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
