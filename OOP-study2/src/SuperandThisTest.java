public class SuperandThisTest {
    public static void main(String[] args) {
        Computer c = new Computer(15, 2000000, true);
        Laptop l = new Laptop(true, 80);

        System.out.println("사이즈는 "+ l.size);
        System.out.println("가격은 " + l.price);
        System.out.println("전원 상태 " + l.power);
        System.out.println("휴대성 여부 " + l.portable);
        System.out.println("남은 배터리 " + l.battery);

        l.onoff();

        System.out.println("전원 상태 " + l.power);

        l.bstatus();
    }
}

class Computer{
    boolean power;
    int size;
    int price;

    public Computer(){

    }
    public Computer(int size, int price){
        this.size = size;        // this는 Computer를 뜻함
        this.price = price;
    }
    public Computer(int size, int price, boolean power){
        this(size,price);       // 바로 위의 생성자를 호출
        this.power = power;
    }

    public boolean onoff(){
        return power = !power;
    }
}
class Laptop extends Computer{  // Computer를 상속받는 Laptop클래스
    boolean portable;
    int price;   // 이 경우 멤버를 구별하기 위해서는 super 와 this 사용
    int battery;

    public Laptop(){

    }
    public Laptop(boolean portable, int battery){
        super();            // 부모 클래스(Computer)의 생성자 호출
        this.portable = portable;
        this.battery = battery;
    }

    public void bstatus(){
        System.out.println("현재 배터리는 " + battery);
    }
}

/*
super와 this는 상속관계를 빼면 사실성 의미하는 기능은 같다.

오버라이딩 메서드 구분할때도 효과적이다.
    오버라이딩이 추가내용 작성인 경우에는 super로 호출하고 덧대자.
 */