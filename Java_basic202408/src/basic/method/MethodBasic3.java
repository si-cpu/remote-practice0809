package basic.method;
/*
# 반환값, 반환 유형 (return value, return type)

1. 반환값이란 메서드의 실행 결과값을 의미합니다.

2. 매개변수는 여러 개 존재할 수 있지만, 반환값은 오직 한 개만
존재해야 합니다.
// return 밑에는 코드가 진행될수가 없다.

3. 전달되는 값의 타입을 반환 유형이라고 하며, 메서드를 선언할 때
메서드 이름 앞에 반드시 반환 유형을 명시해야 합니다.

4. return이라는 키워드를 사용하며 return 뒤에 전달할 값을
지정합니다. (변수, 상수, 연산식, 등 가능)

5. 반환값이 있는 메서드는 호출문 자체가 하나의 값으로 처리될 수 있기 때문에
반환값을 다른 변수에 대입할 수도 있고, 다른 메서드의 매개값으로도
처리될 수 있습니다.

6. 모든 메서드가 반환값이 있는 것은 아닙니다. 메서드 실행 후에
반환할 값이 딱히 없다면 return을 생략해도 됩니다.

7. 이 때는 반환유형을 메서드를 선언할 때 비워두지 마시고
void라는 키워드를 작성해 주셔야 합니다.

8. 모든 메서드는 return을 만나면 강제로 메서드가 종료됩니다.
따라서 조건 없이 return문 아래에 코드를 작성할 수 없습니다.
void메서드에서는 return 키워드를 탈출 기능으로 사용할 수 있습니다.

*/

public class MethodBasic3 {

    static int add (int n1, int n2){
        return n1 +n2;
    }

    static int[] operateTotal(int n1, int n2){
        return new int[] {n1+n2, n1-n2 ,n1*n2,n1/ n2 };

    }

    static void multi(int n1, int n2){ // return되는것이 없으면 void를 사용한다.
        int result = n1*n2;
        System.out.printf("%d x %d = %d\n",n1,n2,result);
    }

    static void divide(int n1, int n2){
        if (n2==0){
            System.out.println("0으로 나눌수없습니다.");
            return;
        }
        int result = n1 / n2;
        System.out.printf("%d x %d = %d\n",n1,n2,result);
    }



    public static void main(String[] args) {
        int r1 = add(3,8); // int r1 = 11;
        int r2 = add(10,15);// int r2 = 25;
        int r3 = add(add(3,8),add(4,5)); // int r3 = 20;
        System.out.println("r3 = " + r3);

        int[] result = operateTotal(4,7);
        System.out.println("30-6 = " + result[0]);
        System.out.println("30+6 = " + result[1]);
        System.out.println("30*6 = " + result[2]);
        System.out.println("30-6 = " + result[3]);
        System.out.println("====================================================");

        multi(10,7);// VOid는 단독이용시 대개 사용

        multi(add(3,4), add(4,7));

        divide(20, 0); // void 매서드에서만 return은 탈출기능을 사용할수있다.








    }
}
