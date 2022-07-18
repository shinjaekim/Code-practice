//  객체배열을 이해해보자

public class Objectarray {
    public static void main(String[] args){
        /*
        이런식으로 하나의 클래스로 여러 인스턴스를 생성한다면??? 뭐 나쁘지는 않은데 많아질수록 관리 힘들다.
        Dog firstDog = new Dog("CHAO",3);
        Dog secondDog = new Dog("kaek",2);
        Dog thirdDog = new Dog("peka",6;
         */

        Dog[] dog = new Dog[3];         //인스턴스 참조변수의 배열 작성
        for(int i = 0 ; i < 3 ; i++){   //참조변수 배열 초기화 (기본생성자로)
            dog[i] = new Dog();
        }

        dog[0].name = "CHAO";
        dog[1].name = "Kaek";
        dog[2].name = "Peka";

        System.out.println(dog[0].name);
        System.out.println(dog[1].name);
        System.out.println(dog[2].name);
    }
}

class Dog{  // 강아지 객체 설계도
    String name;
    int age;

    public Dog(){

    }
    public Dog(String name, int age){   //생성자에서는 매개변수 타입도 지정해주자
        this.name = name;
        this.age = age;
    }
    public void Bark(){
        System.out.println("wal wal");
    }
    public void aging(){
        age += 1;
    }
}

/*
객체 배열은 배열 메모리상에 인스턴스 하나하나가 저장된 것이 아닌 인스턴스를 가리키는 '참조변수'가 저장된것

프로그래밍 관점에서 클래스 = 데이터 + 함수
    데이터 : 데이터 - 배열 - 구조체 - 클래스

클래스는 이렇게 생각해보자.
1. 자바가 제공하는 기본형들은 기본타입
   내가 만드는 클래스는 사용자정의타입
2. 기본타입은 리터럴자체를 저장하고
   사용자정의타입은 리터럴이 저장된 주소를 저장한다.
 */