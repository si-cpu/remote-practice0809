package basic.prectice;

import java.util.Arrays;
import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("#먹고싶은 음식을 입력하세요.");
        System.out.println("# 입력을 중지하려면 <stop> 이라고 입력하세요");

        //음식 이름을 저장할 배열 -> 초기에는 입력값이 없으니 빈배열로 생성
        String[] foodList = {};

        while (true){
            System.out.println("> ");
            String newfood =sc.next();

            if (newfood.equals("stop")) break;

            //기존배열보다 큰 새 배열 생성
            String[] temp = new String[foodList.length + 1];

            // 기존 foodList에 있는 음식들 새 배열로 복사
            for (int i = 0; i < foodList.length; i++){
                temp[i] = foodList[i];
            }

            // 새 음식을 끝 인덱스에 추가하자
            temp[temp.length - 1] = newfood;

            // 주소값 이전
            foodList = temp; temp = null;


        }// end while

        System.out.println("먹고 싶은 음식 리스트 = " + Arrays.toString(foodList));

    }
}
