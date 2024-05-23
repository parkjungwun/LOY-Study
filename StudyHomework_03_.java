package JavaStudy;

import java.util.Scanner;
import java.util.Random;

public class StudyHomework_03_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean playAgain = true;

        while (playAgain) {
            int score = makeGame(scanner);
            printResult(score);

            System.out.print("게임을 다시 하시겠습니까? (Y/N): ");
            char playChoice = scanner.next().charAt(0);
            if (!(playChoice == 'Y' || playChoice == 'y')) {
                playAgain = false;
            }
            System.out.println(); // 게임 종료 또는 재시작 전에 빈 줄 추가
        }
        System.out.println("게임을 종료합니다. 감사합니다!");
    }

    public static int makeGame(Scanner scanner) {
        Random random = new Random();
        int score = 0;

        for (int i = 0; i < 10; i++) {
            int number1 = random.nextInt(90) + 10; // 두 자릿수 정수만 생성
            int number2 = random.nextInt(90) + 10; // 두 자릿수 정수만 생성

            System.out.println("문제 " + (i + 1) + ": " + number1 + " + " + number2 + " = ?");
            System.out.print("답을 입력하세요: ");

            int answer = scanner.nextInt();

            if ((number1 + number2) == answer) {
                System.out.println("정답입니다!");
                score++;
            } else {
                System.out.println("틀렸습니다. 정답은 " + (number1 + number2) + " 입니다.");
            }
            System.out.println(); // 문제 간에 빈 줄 추가
        }

        return score;
    }

    public static void printResult(int score) {
        System.out.println("------------------------------");
        System.out.println("총점은 10점 만점에 " + score + "점 입니다.");
        System.out.println("------------------------------");
    }
}
