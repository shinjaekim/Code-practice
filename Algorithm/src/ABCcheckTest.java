import java.util.*;

public class ABCcheckTest {
    public static void main(String[] args) {
        Abso a = new Abso();
        String s = "TgDrnjAz6kAbdEaxFkrKIsa";


        System.out.println(a.ABCheck(s));
    }
}
class Abso{
    public boolean ABCheck(String str) {
        // TODO:
        str = str.toLowerCase();
        String[] s = str.split("");
        System.out.println(Arrays.toString(s));

        for(int i = 0 ; i < s.length-4 ; i++){   // -4를 안해줬을때  java.lang.StringIndexOutOfBoundsException 발생.
                                                // 이유는 뒤에서 4칸사이에서 찾았을경우 밑 조건을 부합해 4를 더하면 넘어간다.
            System.out.println(i);

            if(s[i].charAt(0) == 'a'){  // 왜 s[i] = "a"는 안되는거지??
                System.out.println("a일경우 : " + i);
                if(s[i+4].charAt(0) == 'b') return true;
                else continue;
            }
            else if(s[i].charAt(0) == 'b'){

                System.out.println("b일경우 : " + i);
                if(s[i+4].charAt(0) == 'a') return true;
                else continue;
            }
        }
        return false;
    }
}
