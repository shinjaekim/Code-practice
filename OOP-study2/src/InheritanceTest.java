//  상속 - 클래스 재사용 - ~~이다.

public class InheritanceTest {
    public static void main(String[] args) {
        Human hm = new Human(2,1,2);  // 생성자를 이용한 생성 동시 초기화
        KSJ ksj = new KSJ();
        ksj.age = 29;
        ksj.city = "chuncheon";
        ksj.name = "김신재";

        System.out.println(ksj.armNum);
        System.out.println(ksj.headNum);
        System.out.println(ksj.legNum);  // 위 세줄은 상속을 표현한 것이다.
        System.out.println(ksj.age);
        System.out.println(ksj.city);
        System.out.println(ksj.name);
    }
}
class Human{
    static int armNum;
    static int headNum;
    static int legNum;    // 이 변수들은 하위 클래스도 가져가는 '클래스 공통적인' 변수임과 동시에 -> 상속
                          // static으로 선언되어 생성되는 '인스턴스마다 공통적인' 변수이다. -> 클래스 변수
    public Human(){

    }

    public Human(int armNum, int headNum, int legNum){
        this.armNum = armNum;
        this.headNum = headNum;
        this.legNum = legNum;
    }

    static void run(){
        System.out.println("뛰는 중입니다.");
    }
    static void walk(){
        System.out.println("걷는 중입니다.");
    }
}

class KSJ extends Human{
    String name;
    String city;
    int age;

    void callName(){
        System.out.println("내 이름은 " + name + " 이야");
    }
}



/*
static - 한 클래스에서 인스턴스들이 공통적으로 가지는 기능이나 속성 -> 인스턴스 생성되지 않아도 설정 가능 -> 생성과 관련
상속해서 변수 추가 - 여러 클래스에서 공통적으로 가지는 기능이나 속성 -> 인스턴스가 생성되어야 설정(static이라면 가능) -> 객체 설계와 관련
 */