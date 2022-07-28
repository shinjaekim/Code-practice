import java.util.*;

public class GreedyCoinTest {
    public static void main(String[] args) {
        SGT s = new SGT();
        int[] arr = {95, 45, 40, 90, 60, 70, 35};
        int limit = 100;

        s.movingStuff(arr, limit);
    }
}
class SGT{
    public int movingStuff(int[] stuff, int limit) {
        // TODO:

        Arrays.sort(stuff);
        System.out.println(Arrays.toString(stuff));
        int maxId = stuff.length - 1;
        int minId = 0;
        int moveCount = 0;





        while(maxId > minId){
            if(stuff[maxId] + stuff[minId] < limit){
                if(maxId == minId + 1) {
                    maxId--;
                    moveCount++;
                }
                else{
                    maxId--;
                    minId++;
                    moveCount++;
                    if(maxId == minId) moveCount++; // 이부분때문에 시간이 더 걸림
                }
                System.out.println("2. maxID : " + maxId);
                System.out.println("   minID : " + minId);
                System.out.println("   stuff[maxId] : " + stuff[maxId]);
                System.out.println("   stuff[minId] : " + stuff[minId]);
                System.out.println("   moveCount : " + moveCount);
                System.out.println("");
            }
            else{
                maxId--;
                moveCount++;
                System.out.println("4. maxID : " + maxId);
                System.out.println("   minID : " + minId);
                System.out.println("   stuff[maxId] : " + stuff[maxId]);
                System.out.println("   stuff[minId] : " + stuff[minId]);
                System.out.println("   moveCount : " + moveCount);
                System.out.println("");
            }

        }
        return moveCount;
    }
}