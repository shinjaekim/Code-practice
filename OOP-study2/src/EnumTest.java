import java.util.*;
enum Cage { BEAR, LION, TIGER, COYOTE }

public class EnumTest {
    public static void main(String[] args) {
        Cage bear = Cage.BEAR;
        System.out.println(bear.ordinal());  // 베어의 번호 리턴
        System.out.println(" ");

        Cage[] arr = Cage.values();    // enums.value() -> 모든 상수들을 배열로 반환
        System.out.println(Arrays.toString(arr));
        System.out.println(" ");
        System.out.println(Cage.BEAR.name());

        for (Cage a : arr) {
            System.out.println(a.ordinal() + " 번 우리입니다.");
            System.out.println(a.compareTo(Cage.BEAR)); // 베어와의 순번차이
        }
        System.out.println(" ");

        switch (bear) {
            case BEAR:
                System.out.println(bear.ordinal());
                break;
            case LION:
                System.out.println("2번 우리");
                break;
            case TIGER:
                System.out.println("3번 우리");
                break;
            case COYOTE:
                System.out.println("4번 우리");
                break;

        }
    }
}

