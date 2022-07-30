import java.util.*;
public class FindPathTest {
    public static void main(String[] args) {
        Solus s = new Solus();


        boolean a = s.getDirections(new int[][]
                {
                        {0, 1, 0, 0, 0},
                        {0, 0, 0, 1, 0},
                        {0, 1, 0, 0, 0},
                        {0, 1, 1, 0, 0},
                        {1, 1, 1, 1, 0}
                }, 1, 4);


    }
}
class Solus {
    public boolean getDirections(int[][] matrix, int from, int to) {

        int[][] tMatrix = new int[matrix.length][];

        for (int i = 0; i < matrix.length; i++) {  // 앞서 만든 임시배열에 matrix값 복사.
            tMatrix[i] = Arrays.copyOf(matrix[i], matrix[i].length);
        }

        if (from == to) return true; // 재귀의 탈출부

        // 입력된 출발지점의 1차원 배열을 순회합니다.
        for (int i = 0; i < tMatrix[from].length; i++) {
            //길이 존재한다면
            if (tMatrix[from][i] == 1) {
                tMatrix[from][i] = 0;
                if (getDirections(tMatrix, i, to)) return true; //메서드가 진정 반환하고자하는값
            }
        }
        //길을 찾을수 없는 경우 false를 반환합니다.
        return false;
    }
}