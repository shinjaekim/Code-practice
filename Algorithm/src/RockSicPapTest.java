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
        ArrayList<String[]> result = new ArrayList<>(); // 편하게 삽입 삭제 하려고 만들었다.

        return result;
    }

    public ArrayList<String[]> calculator (int rounds, String[] save,  ArrayList<String[]> list){ // rounds를 그대로 받아오면 좋겠다.

        String[] rsp = {"rock", "paper", "scissors"};
//        String[] s = new String[rounds];  // (라운드수만큼 가위바위보 경우의 수를 담을 배열) // 이거를 포문 안으로 옮기자.
//        String[] save = {" "}; // 낸 값을 저장할 배열    // 매개변수로 넣어줘야한다. 여기서 넣어주면 계속 초기화된다.
        String[] nextRound = {" "}; // 라운드를 늘려줄 배열

        // 재귀함수 탈출구
        if(rounds == 0){   // 인덱스가 라운드수랑 같아진다면 0 ~ 라운드-1 인덱스까지는 다 담은거니까
            System.out.println(Arrays.toString(save));
            list.add(save);         // 리스트에 추가한다.
            return list;         // 그리고 리스트를 반환하면
        }

        for(int i = 0 ; i < rsp.length ; i++){
            String current = rsp[i];   // 이번 라운드에서 값을 냈으니까

            save = Arrays.copyOf(nextRound, nextRound.length+1);  // 다음 라운드를 준비하기위해 (다음 라운드의 값을 넣어줄 배열을 만들기 위해)

            save[save.length-1] = current; // 길이보다 1 작은 인덱스라 함은 이전에 늘려줬는데 아무것도 들어가지 않은 배열이다.

            list = calculator(rounds-1, save, list);
        }
        return list;
    }
}
