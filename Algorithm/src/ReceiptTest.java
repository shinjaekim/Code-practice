import java.util.*;

public class ReceiptTest {
    public static void main(String[] args) {
        Rt r = new Rt();

        ArrayList<Integer[]> output1 = r.newChickenRecipe(new int[]{1, 10, 1100, 1111}, 2);
    }
}
class Rt{
    public static ArrayList<Integer[]> newChickenRecipe(int[] stuffArr, int choiceNum) {
        // TODO:

        //stuffarr.length < choiceNum return null

        ArrayList<Integer> stuffList = new ArrayList<>();

        for(int i = 0 ; i< stuffArr.length ; i++){
            stuffList.add(stuffArr[i]);
        }

        Collections.sort(stuffList);

        for(int i = 0; i < stuffList.size(); i++){

            String s = String.valueOf(stuffList.get(i));
            int count = 0;

            for(int j = 0; j < s.length() ; j++)
                if(s.charAt(j) == '0') count++;

            if(count >= 3) stuffList.remove(i);
        }


        if(stuffList.size() == 0 || stuffList.size() < choiceNum) return null;

        int index = 0;

        Integer[] caseNum = new Integer[choiceNum];

        ArrayList<Integer[]> result = new ArrayList<>();

        boolean[] visitied = new boolean[stuffList.size()];

        return calculator(stuffList, result, caseNum, choiceNum, index, visitied);

    }
    public static ArrayList<Integer[]> calculator(ArrayList<Integer> stuffList, ArrayList<Integer[]> result, Integer[] caseNum, int choiceNum, int index, boolean[] visited){

        if(index == choiceNum){
            Integer[] input = new Integer[choiceNum];
            for(int i = 0 ; i < caseNum.length ; i++){
                input[i] = caseNum[i];
            }
            result.add(input);
            return result;            // 리스트를 반환해주고
        }

        for(int i = 0 ; i < stuffList.size() ; i++){

            if(!visited[i]) {
                visited[i] = true;
                caseNum[index] = stuffList.get(i);
                calculator(stuffList, result, caseNum, choiceNum, index + 1, visited);
                visited[i] = false;
            }
        }
        return result;
    }
}