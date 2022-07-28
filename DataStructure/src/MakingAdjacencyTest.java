public class MakingAdjacencyTest {
    public static void main(String[] args) {
        S hey = new S();

        int[][] edges = {
                {0, 3, 0},
                {0, 2, 0},
                {1, 3, 0},
                {2, 1, 0},
        };
        int max = 0;


    }
}

class S {
    public int[][] createMatrix(int[][] edges) {
        // TODO:

        int max = 0;
        // 최대값을 구하면 사이즈를 알 수 있다.
        for(int i = 0 ; i < edges.length ; i++){
            for(int j = 0 ; j < edges[0].length ; j++){
                if(edges[i][j] > max) max = edges[i][j];
            }
        }
        int size = max +1;

        int[][] result = new int[size][size];

        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < size ; j++){
                result[i][j] = 0;
            }
        }

        // 간선 추가
        for(int i = 0 ; i < edges.length ; i++){
            if(edges[i][2] == 0){
                result[edges[i][0]][edges[i][1]] = 1;
            }
            else if(edges[i][2] == 1){
                result[edges[i][0]][edges[i][1]] = 1;
                result[edges[i][1]][edges[i][0]] = 1;
            }
        }
        return result;
    }
}

