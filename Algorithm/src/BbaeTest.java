import java.util.*;

public class BbaeTest {
    public static void main(String[] args) {

        int m = 7;
        int n = 21;

        ArrayList<Integer[]> list = new ArrayList<>();

        Bt b = new Bt();
        list = b.divideChocolateStick(m,n);

        int i = 0;
        for(Integer[] s : list){
            System.out.printf("%d", i++);
            System.out.println(Arrays.toString(s));
        }

    }
}
class Bt{
    public ArrayList<Integer[]> divideChocolateStick(int M, int N) {
        // TODO:
        int person = 1;
        int min = 0;
        ArrayList<Integer[]> result = new ArrayList<>();


        if(M>N) min = N;
        else min = M;

        for( ; person <= min ; person++){
            Integer[] caseNum =new Integer[3];
            caseNum[0] = person;

            if(M % person != 0) continue;
            else caseNum[1] = M/person;

            if(N % person != 0) continue;
            else caseNum[2] = N/person;

            result.add(caseNum);
        }

        return result;
    }
}