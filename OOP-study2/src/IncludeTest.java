//  포함 - 클래스 재사용 - ~~을 가지고 있다.
public class IncludeTest {
    public static void main(String[] args) {
        Animal am = new Animal();
        am.wingNum = 0;
        am.lp = "house";
        am.dog = new Dog(4,false);

        System.out.println(am.wingNum);
        System.out.println(am.lp);
        System.out.println(am.dog.legNum);
        System.out.println(am.dog.feather);
    }
}
class Animal{
//    int legNum;
    int wingNum;
//    boolean featehr        주석처리한 멤버변수 대신 Dog dog 의 참조변수를 만들어서 포함관게
    String lp;
    Dog dog;
}

class Dog{
    int legNum;
    boolean feather;

    public Dog(int a, boolean tf){
        legNum = a;
        feather = tf;
    }
}

/*
상속이나 포함이나 코드의 재사용을 위해 클래스 설계시 공통 변수와 메서드들을 한번만 쓰게 해준다.
상속은 ~이다
포함은 ~을 가지고 있다. 로 생각해보자
아직 익숙하지는 않다.
 */