public class PolymorphismTest {
    public static void main(String[] args) {
        Bottle b = new Bottle(35, "삼다수");
        CokeBottle cb = new CokeBottle(3, "코카콜라", 100);

        Bottle cbb = new CokeBottle(5, "펩시콜라", 200);  // 다형성예시.
//        CokeBottle bd = new Bottle();  // 하위클래스로 상위클래스 다형성사용을 불가능


//        b.gram = 32;   // 하위클래스의 멤버는 사용하지 못함

        cb.gram = 150;
        cb.size = 20;  // 상위 클래스의 멤버 사용 가능

//        cbb.gram = 35; // -> 다형성을 이용해서 참조했다면 하위 클래스의 멤버는 사용 불가능
    }
}
class Bottle{
    int size;
    String brand;

    public Bottle(){};

    public Bottle(int size, String brand){
        this.size = size;
        this.brand = brand;
    }

    public void inner(){
        System.out.println("물이 들어있습니다.");
    }
    public void inner(int i){
        System.out.println("i그람을 주입합니다.");
    }
}

class CokeBottle extends Bottle{
    int gram;

    public CokeBottle(){};
    public CokeBottle(int size, String brand, int gram){
        super(size, brand);
        this.gram = gram;
    }

    public void inner(){
        System.out.println("콜라가 들어있습니다.");  //오버라이딩
    }
}


