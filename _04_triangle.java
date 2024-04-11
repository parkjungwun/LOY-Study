package Java_Study;

/* 밑변괴 높이를 입력 박아 삼각형의 면적을 출력하는 프로그램을 작성하시오.
면적을 계산하는 로직은 함수로 만들어야 함*/

import java.util.Scanner;

public class _04_triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("밑변을 입력하세요: ");
        double baseline = scanner.nextDouble();

        System.out.print("높이를 입력하세요: ");
        double height = scanner.nextDouble();

        double area = 0.5 * (baseline * height);
        System.out.println("삼각형의 면적은: " + area);
    }
}
