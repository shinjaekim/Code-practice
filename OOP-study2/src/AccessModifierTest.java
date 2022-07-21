public class AccessModifierTest {
    public static void main(String[] args) {
       Parent p = new Parent();

       p.printall(); // 메서드를 통해서 호출했기 때문에 a까지 출력된다
        // System.out.println(p.a); -> 다른 클래스에서 접근했기 때문에 오류가 뜬다.

        System.out.println(p.b);   //다른 패키지였다면 불가했을 것이다.
        System.out.println(p.c);
        System.out.println(p.d);   // 모두 가능하다.

    }
}
class Parent{
    private int a = 1;   // 동일 클래스에서만 접근
    protected int b = 2;  // 동일 패키지에서만 접근
    int c = 3; //  동일 패키지, 다른 패키지 하위 클래스에서 접근
    public int d = 4; // 모두 가능

    public void printall(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}