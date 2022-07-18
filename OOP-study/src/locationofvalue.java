//  클래스, 인스턴스, 지역변수의 생성과 소멸

public class locationofvalue {
    public static void main(String[] args){
        System.out.println(MyIns.habbit); // 인스턴스 생성 전에도 호출 가능

        MyIns first = new MyIns();

       first.age = 17;
       MyIns.habbit="러닝";                 // 클래스 변수는 클래스이름.변수이름으로 호출

        System.out.println(MyIns.habbit);
        System.out.println(first.age);
    }
}

class MyIns{
    int age;
    double healthStauts;    // 인스턴스 변수로 인스턴스 생성시에 메모리에
    static String habbit = "없음";   // 클래스 변수로 로드할때 메모리에

    public MyIns(){

    }
    public double percentage(int age, double healthStauts){
        double perc = age * healthStauts;  // 지역변수로 메서드가 실행될때
        return perc;
    }
}


/*
클래스 설계시에
공통으로 가져야 하는 속성과 기능
고유하게 가져야 하는 속성과 기능을
잘 구별하도록 하자.
 */