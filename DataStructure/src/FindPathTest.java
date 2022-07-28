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
        // TODO:
        System.out.println("!!!");
        if(matrix[from][to] == 1) return true;

            // 직접 연결이 안된다면 중간단계를 구한다.
        else if(matrix[from][to] != 1){

            for(int i = 0 ; i < matrix[0].length ;  i++){

                if(matrix[from][i] == 1){

                    matrix[from][i] = 0;
                    System.out.println("!!!");
                    getDirections(matrix, i, to);

                }
            }
        }
        return false;
    }
}