import java.util.Arrays;

public class BoardGameTest {
    public static void main(String[] args) {
        Bgtsoultion b = new Bgtsoultion();
        int[][] board =
                {{1, 0, 1},
                {1, 1, 1},
                {0, 1, 0}};

        String operation = "DDRUURDDL";

        b.boardGame(board, operation);

    }
}
class Bgtsoultion{
    public Integer boardGame(int[][] board, String operation) {
        // TODO:

        int point = 0; // 점수 합산할 변수

        int x = 0;  // 행 인덱스
        int y = 0;  // 열 인덱스            // *** xy좌표로 생각했다가 실수함.** xy좌표는 순서대로 가로세로, 인덱스에서 행이 위아래구별 열이 좌우 구별 ->y가 행 x가 열
        System.out.print("0. x = " + x);
        System.out.print(" y = " + y);

        point += board[x][y]; // 첫 좌표로 점수 초기화
        System.out.println(" point " + point);
//        System.out.println(Arrays.deepToString(board));   //deepToString 알았다. 줄 나누려면 for문이 좋겠다.

        for(int i = 0 ; i < board.length ; i++){
            System.out.println(Arrays.toString(board[i]));  // 이런식으로
        }
        System.out.println(operation);

        for(int i = 0 ; i < operation.length() ; i++){ //operation 다 봐야겠다.
            if(operation.charAt(i) == 'U'){            // 업 이면
                if(x == 0) return null;                // y좌표 0 일때 올라가면 보드 아웃
                x--;                                   // y좌표 올리고
                System.out.print("1. x = " + x);
                System.out.print(" y = " + y);

                System.out.print(" point " + point);  // command 아래키는 무엇??
                point += board[x][y];                  // 올린걸 더한다.
                System.out.println(" point " + point);  // command 아래키는 무엇??
            }
            if(operation.charAt(i) == 'D'){
                if(x==board.length - 1) return null;
                x++;
                System.out.print("2. x = " + x);
                System.out.print(" y = " + y);

                System.out.print(" point " + point);  // command 아래키는 무엇??
                point += board[x][y];
                System.out.println(" point " + point);
            }
            if(operation.charAt(i) == 'L'){
                if(y == 0) return null;
                y--;
                System.out.print("3. x = " + x);
                System.out.print(" y = " + y);

                System.out.print(" point " + point);  // command 아래키는 무엇??
                point += board[x][y];
                System.out.println(" point " + point);
            }
            if(operation.charAt(i) == 'R'){
                if(y == board[0].length - 1) return null;
                y++;
                System.out.print("4. x = " + x);
                System.out.print(" y = " + y);

                System.out.print(" point " + point);  // command 아래키는 무엇??
                point += board[x][y];
                System.out.println(" point " + point);
            }
        }
        return point;
    }
}

