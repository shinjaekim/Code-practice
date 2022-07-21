public class GetterSetterTEST {
    public static void main(String[] args) {
        Do d = new Do();
//        d.a = 10  -> private 때문에 접근 불가하다.
//        d.b = 12 -> 마찬가지이다.

        //근데 값을 변경하고 불러오고 싶다면??? 이때 게터와 세터를 이용하자.

        System.out.println(d.getA());
        System.out.println(d.getB());

        d.setA(10);
        d.setB(12);

        System.out.println(d.getA());
        System.out.println(d.getB());

    }
}
class Do{
    private int a;
    private int b;

    public int getA() {  // getter는 단축기 생성도 가능하지민
        return a;        // 반환타입이 변수와 같다는 것을 생각하자.
    }
    public int getB() {
        return b;
    }

    public void setA(int a) {  //setter는 매개변수로 멤버변수를 받고
        this.a = a;            //this를 이용하는구나
    }
    public void setB(int b) {
        this.b = b;
    }
}
