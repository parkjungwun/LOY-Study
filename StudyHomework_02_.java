package JavaStudy;

import java.util.Scanner;
import java.util.Random;

public class StudyHomework_02_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;

        while (playAgain) {
            int score = 0;

            for (int i = 0; i < 10; i++) {
                int number1 = random.nextInt(90) + 10;
                int number2 = random.nextInt(90) + 10;

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
            System.out.println("------------------------------");
            System.out.println("게임을 다시 하시겠습니까? (Y/N)");

            char playChoice = scanner.next().charAt(0);
            if (!(playChoice == 'Y' || playChoice == 'y')) {
                playAgain = false;
            }
        }
        System.out.println("게임을 종료합니다.");
    }
}
