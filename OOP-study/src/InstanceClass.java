// 인스턴스 메서드와 클래스 메서드 구별
public class InstanceClass {
        public static void main(String[] args){
                Phone.sort = "스마트폰";
                Phone.sort = "피쳐폰";
                Phone.welcome();         // 클래스 변수와 메서드. 클래스 공간에 저장되기 때문에 인스턴스 생성하지 않아도 호출가능

                Phone ph = new Phone(6,"아이폰",8);
                ph.prize = 200000;
                System.out.println("이 폰의 예상 가격은 " + ph.prz() + "입니다"); // 인스턴스 변수와 메서드는 생성후 사용 가능


        }
}

class Phone{
        int inch;
        String name;
        int number;
        int prize;
        static String sort;

        public Phone(int inch, String name, int number){
                this.inch = inch;
                this.name = name;
                this.number = number;
        }
        public int prz(){      //instance 메서드, 인스턴스 생성해야 호출 가능, 인스턴스 멤버 활용
                return number * prize;
        }
        static void welcome(){                    //class 메서드, 인스턴스 생성하지 않아도 호출 가능
                System.out.println("구입을 환영합니다");
        }
}

/*
공용속성이면 클래스변수
인스턴스멤버를 사용하지 않으면 클래스 메서드

인스턴스메서드는 클래스멤버 사용 가능
클래스메서드는 인스턴스멤버 사용 불가능
 */