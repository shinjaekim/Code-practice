import java.util.*;

public class RockSicPapTest {
    public static void main(String[] args) {
       Rspsolution test = new Rspsolution();

       ArrayList<String[]> list = new ArrayList<>();
       list = test.rockPaperScissors(3);
        int i = 1;
       for(String[] s : list){
           System.out.printf("%d", i++);
           System.out.println(Arrays.toString(s));
       }
    }
}
class Rspsolution{
    public ArrayList<String[]> rockPaperScissors(int rounds) {
        // TODO:
        ArrayList<String[]> result = new ArrayList<>();
        String[] currentCase = new String[rounds];
        int index = 0;

        return caseList(result, currentCase, rounds, index);
    }
    public ArrayList<String[]> caseList (ArrayList<String[]> result, String[] currentCase, int rounds, int index){

        String[] rps = {"rock", "paper", "scissors"};

        if(index == rounds){
            System.out.println(Arrays.toString(currentCase));
            //여기서 문제
            String[] input = new String[rounds];
            for(int i = 0 ; i < currentCase.length ; i++){
                input[i] = currentCase[i];
            }
            result.add(input);

            return result;            // 리스트를 반환해주고
        }

        for(int i = 0 ; i < rps.length ; i++){
            String s = rps[i];
            System.out.println(i);
            System.out.println("값은 : " + s);

            currentCase[index] = rps[i];
            caseList(result, currentCase, rounds, index+1);

        }
        return result;
    }
}

/*
원래 경우를 보자
1. 배열을 생성하고
2. 포문에 들어간 후
3. 객체를 조건에 맞게 만들어 넣어준다.

이러면 리스트에 여러가지의 경우의 수들이 객체로 들어간 것처럼 보이지만
리스트가 참조하는 객체의 주소는 하나로 똑같다.

ex)
1번 주소에 rock rock rock. 이걸 add 해주면
list 1번 주소 객체
2번 주소에 rock rock papaer 이걸 add 해주면
list 1번 주소 객체, 1번 주소 객체

이렇게 결국 같은 객체만 계속 들어가고
수정된 값에 의해 다 똑같은 값들로 바뀐다.

하지만

포문 안에 매번 할때마다 객체를 생성해준다면??
 */