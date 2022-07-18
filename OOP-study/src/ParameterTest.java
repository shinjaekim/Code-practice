// 자바의 정석 보고 따라하기 - 인자로 기본변수와 참조변수의 차이는?

public class ParameterTest {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 12;
        System.out.println(d.x);

        change(d.x);                // 2. 여기에 d.x대신 d를 넣어줘야 하고
        System.out.println(d.x);    // 3. 이 경우 1000으로 값이 바뀌어 나온다.
    }

    static void change(int x){      // 1. <-매개변수를 Data d 로 바꾸면 참조변수를 매개변수로 받는데 이 경우에는
        x = 1000;
        System.out.println(x);
    }
}
class Data{int x;}


/*
기본변수는 메서드에서 사용할 리터럴을 줄 뿐이다. 따라서 메서드를 실행 한 후 그 결과는 원래의 기본변수를 바꾸지 않는다.
하지만 참조변수는 주소를 전달한다. 따라서 그 주소에 가서 리터럴을 대입하기 때문에 원래 변수의 값을 변화시킨다.

참조변수를 매개변수로 이용하면 return 없이도 값을 바꿀 수 있겠다.
 -> 하나의 값이 아닌 여러개의 값을 바꾸는 메서드가 가능해질것이다.

메서드는 그저 한 메모리 공간에 있는 코드명령들을 호출하는 것일 뿐!
 */