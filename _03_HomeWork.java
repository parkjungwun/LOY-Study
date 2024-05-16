interface BaeMin {
    public void deliver(); // 배달을 위한 메서드
}

abstract class Vehicle {

    protected int velocity;    // 속도를 나타내는 변수
    protected int wheelNum;    // 바퀴의 개수를 나타내는 변수
    public String carName;    // 차량의 이름을 나타내는 변수

    public Vehicle() {
        wheelNum = 6; // 기본적으로 바퀴가 6개인 차량
        velocity = 0;       // 초기 속도는 0
    }

    public void setCarName(String name) {
        carName = name; // 차량의 이름 설정
    }

    public abstract void speedUp(); // 속도를 증가시키는 추상 메서드
}

class Car {

    protected int velocity;    // 속도를 나타내는 변수
    protected int wheelNum;    // 바퀴의 개수를 나타내는 변수
    protected String carName;    // 차량의 이름을 나타내는 변수

    public Car() {
        wheelNum = 4; // 기본적으로 바퀴가 4개인 차량
        velocity = 100;       // 초기 속도는 100
    }

    public void speedUp() {
        velocity++;        // 속도를 1 증가시키는 메서드
    }
}

class Cycle implements BaeMin {

    int velocity;    // 속도를 나타내는 변수

    public void deliver() {
        System.out.println("자전거로 배달합니다."); // 배달을 수행하는 메서드
    }

    public void speedUp() {
        velocity++;        // 속도를 1 증가시키는 메서드
    }
}

public class Truck extends Car implements BaeMin {

    public void speedUp() {
        velocity += 30;    // 트럭의 속도를 30 증가시키는 메서드
    }

    public void warn() {
        System.out.println("경적을 울림"); // 경적을 울리는 메서드
    }

    public void deliver() {
        System.out.println("트럭으로 배달합니다."); // 배달을 수행하는 메서드
    }

    public static void main(String args[]) {
        // 일반 클래스에 의한 다형성
        Truck myTruck = new Truck(); // 트럭 객체 생성
        myTruck.speedUp(); // 속도 증가
        System.out.println("트럭의 속도 " + myTruck.velocity); // 속도 출력

        Car myCar = myTruck;    // 다형성을 통해 트럭 객체를 참조하는 차 객체 생성
        myCar.speedUp(); // 속도 증가
        System.out.println("트럭의 속도 " + myCar.velocity); // 속도 출력

        // myCar.warn(); // 컴파일 에러

        // 인터페이스 다형성
        BaeMin myBaeMin = new Cycle(); // 자전거 객체 생성
        myBaeMin.deliver(); // 배달 수행
        myBaeMin = myTruck; // 다형성을 통해 트럭 객체를 참조하는 BaeMin 객체 생성
        myBaeMin.deliver(); // 배달 수행
    }
}
