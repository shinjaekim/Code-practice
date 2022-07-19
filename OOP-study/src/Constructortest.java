// 생성자
public class Constructortest {
    public static void main(String[] args) {
        Car.wheelCount = 4;
        Car mycar = new Car();

        System.out.println(mycar.color + mycar.maker);

        Car mySecondCar = new Car("Hyndai", "Black");
        System.out.println(mySecondCar.color + mySecondCar.maker);

        Car myThirdCar = new Car("Perari");
        System.out.println(myThirdCar.color + myThirdCar.maker);

        Car copyCar = new Car(myThirdCar);
        System.out.println(copyCar.color + copyCar.maker); // 인스턴스가 생성자 호출로 복사된 것을 확인할 수 있다.
    }
}
class Car{
    static int wheelCount;
    String maker;
    String color;

    public Car(){} // 기본생성자

    public Car(Car c){      // 인스턴스를 복사한다.
        maker = c.maker;
        color = c.color;
    }

    public Car(String maker){
        this(maker, "White");  //// 여기서 this 는 생성자를 뜻함. 괄호 안에 아무것도 없기 때문에 기본 생성자 호출 & 무조건 첫 줄
    }

    public Car(String maker, String color){  //매개변수 생성자 - 생성과 초기화를 한번에 할 때 용dl
        this.maker = maker; // 여기서 this는 인스턴스를 뜻함.
        this.color = color;
    }
}
/*
기본생성자는 생성자가 없을 경우에만 컴파일러가 자동으로 추가시켜준다.

생성자 this는 더 연습해보자.
 */
