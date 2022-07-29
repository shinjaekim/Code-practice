import java.util.*;

public class RockSicPapTest {
    public static void main(String[] args) {
        Rspsolution r = new Rspsolution();

        int rounds = 5;

        r.rockPaperScissors(rounds);
    }
}
class Rspsolution{
    public ArrayList<String[]> rockPaperScissors(int rounds) {
        // TODO:
        ArrayList<String[]> result = new ArrayList<>();

        int i = 0;  // 인덱스용

        result = calculator(rounds, i, result);

        return result;
    }

    public ArrayList<String[]> calculator (int round1, int index, ArrayList<String[]> list){

        String[] rsp = {"rock", "paper", "scissors"};
        String[] s = new String[round1];  // (라운드수만큼 가위바위보 경우의 수를 담을 배열)

        // 재귀함수 탈출구
        if(index == round1){   // 인덱스가 라운드수랑 같아진다면 0 ~ 라운드-1 인덱스까지는 다 담은거니까
            System.out.println(Arrays.toString(s));
            list.add(s);         // 리스트에 추가한다.
            return list;         // 그리고 리스트를 반환하면
        }

        for(int i = 0 ; i < rsp.length ; i++){
            s[index] = rsp[i];
            index++;
            System.out.println(Arrays.toString(s));
            System.out.println(index);
//            calculator(round1, index, list);  // 재귀호출하면 s배열 1번 ~ 라운드 - 1 까지 담고 리스트 리턴
            index = 0;   // 다음 턴에서 인덱스를 다시 쓰기 위해서.
        }
        return list;
    }
}
