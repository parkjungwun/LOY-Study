package Java_Study;

// 아래와 같이 별 피라미드가 출력되는 프로그램을 작성하시오.

public class _05_star {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}


