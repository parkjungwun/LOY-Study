package Java_Study;

// 실습 2 -  아래와 같이 별 피라미드가 출력되는 프로그램을 작성하시오.

public class _02_test {
    public static void main(String[] args) {

        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
