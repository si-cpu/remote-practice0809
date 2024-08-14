package basic.method;

import java.util.Arrays;

public class MethodQuiz01 {

	static String[] foods = {"chicken", "pasta", "beef", "fork"};

	// 배열 내부 한눈에 보기
	static void printFoods() {
		System.out.println(Arrays.toString(foods));
	}

	// 특정요소가 배열에 포함되어 있는지 확인
	static boolean isInclude(String searchTarget) {
//		int idx = indexOf(searchTarget);
//		if(idx == -1) return false;
//		else return true;
		return indexOf(searchTarget) != -1;
	}

	// foods 배열에서 특정 데이터의 인덱스를 반환
	static int indexOf(String searchFood){
		for (int i = 0; i < foods.length; i++) {
			if (searchFood.equals(foods[i])){
				return i;
			}
		}
		return -1;
	}

	// foods 배열에 데이터를 끝에 추가하는 함수
	static void push(String newFood){
		String[] temp = makeNewArray();
		String[] temp = copy(size : 1);
		temp[temp.length-1]=newFood;
		foods = temp;
	}

	// 푸쉬 인터뷰
	 static String[] copy(int size) {
		String[] temp = makeNewArray(size);
		int loopCount = (size >= 0) ? foods.length : temp.length;
		for (int i = 0; i < foods.length; i++) {
			temp[i]=foods[i];
		}// 추출: 드래그후  ctrl + alt + M
		return temp;

		static void pop(){
		String[] tmp = copy(size:1);
		}
	}






	public static void main(String[] args) {


		printFoods();
		if (isInclude("bread")){
			System.out.println("존재함!");
		}else{
			System.out.println("존재하지 않음!");
		}


}











