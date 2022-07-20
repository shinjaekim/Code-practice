public class OverridingTest {
    public static void main(String[] args) {
        Ship s = new Ship();
        Boat b = new Boat();

        s.navigate();
        b.navigate();  // 호출하면 조상클래스의 메서드가 아닌 자손클래스의 메서드가 실행
    }
}
class Ship{
    int size;

    public void navigate(){
        System.out.println("항해를 시작합니다.");
    }
}

class Boat extends Ship{
    String color;

    public void navigate(){
        System.out.println("고속항해를 시작합니다.");  // 오버라이딩
    }
}

/*
오버라이딩의 조건
1. 같은 메서드 이름
2. 같은 매개변수
3. 같은 반환타입

static메서드는 같은이름으로 해도 오버라이딩이 아니다.
-> 각 클래스명으로 호출하는 것이 바람직하며 클래스에 묶인다.
 */