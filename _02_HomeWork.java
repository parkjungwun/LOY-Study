package Java_Study;
import java.util.Scanner;
import java.util.Random;

public class _02_HomeWork {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int score = 0;

        for (int i = 0; i < 10; i++) {
            int number1 = random.nextInt(90)+10;
            int number2 = random.nextInt(90)+10;

            System.out.println("다음 두 정수를 더하시오.");
            System.out.println(number1 + "+" + number2 + " = ?");

            System.out.println("답을 입력하시오.");
            int answer = scanner.nextInt();

            if ((number1 + number2) == answer) {
                System.out.println("맞았습니다.");
                score++;
            } else {
                System.out.println("틀렸습니다.");

            }
        }
        System.out.println("------------------------------");

        System.out.println("총점은 총 10점 중에서 " + score + "점 입니다.");
    }
}
틀렸습니다.
------------------------------
총점은 총 10점 중에서 score점 입니다.
