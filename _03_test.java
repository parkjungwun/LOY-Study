package Java_Study;

// 원의 반지름을 입력 받아 원의 둘레와 면적을 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class _03_test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("반지름을 입력하세요.");

        double radius = scanner.nextDouble();

        double circumference = 3.14 * 2 * radius;

        double area = (radius * radius) * 3.14;

        System.out.println("원의 둘레는" + circumference + "입니다.");
        System.out.println("원의 넓이는" + area + "입니다.");



    }
}
