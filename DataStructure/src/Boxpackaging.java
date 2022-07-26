import java.util.* ;

public class Boxpackaging {
    public static void main(String[] args) {

        Integer[] boxes = new Integer[]{5, 1, 4, 6, 7, 9, 20, 1, 2, 3, 4, 5, 6, 6, 7, 8, 7, 9, 5, 4, 3, 5, 2, 3, 45, 4, 5, 3, 4, 5, 3, 5, 34, 5, 3, 4, 5, 3, 4, 2, 3, 1, 12, 2, 3, 4, 2, 4, 2, 4, 60, 2, 3, 4, 5, 6, 3, 2, 3};
        Solution1 s = new Solution1();


        int output = s.paveBox(boxes);

    }
}
class Solution1 {
    public int paveBox(Integer[] boxes) {
        // TODO:
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;           // 한번에 나갈 사람들 숫자를 저장한.
        int temp = 0;            // 가장 큰 한번에 나갈 사람들
        int first = boxes[0];    //첫 요소를 저장한다

        for(int i = 0 ; i < boxes.length ; i++){    // 큐 복사
            queue.add(boxes[i]);
        }

        for(int i = 0 ; i < boxes.length ; i++){
            if(first >= boxes[i]){          //첫요소보다 다음 요소가 작으면
                count++;                    //한번에 나갈애들 슷자는 플러스 되고
                System.out.println("1.queue : " + queue);
                System.out.println("1.first : " + first);
                System.out.println("1.count : " + count);
                System.out.println("1.temp : " + temp);
                System.out.println(" ");
            }
            else if(first < boxes[i]){  //첫요소보다 다음 요소가 크면
                first = boxes[i];    //그리고 첫요소에 현재 값을 넣어준다.
                if(count > temp){           //지금까지 센개수가 저장된값 보다 크면
                    temp = count;            //지금까지 카운트를 임시 저장하고
                    count = 1;               //카운트를 다시 1로 만들고
                }
                System.out.println("2.queue : " + queue);
                System.out.println("2.first : " + first);
                System.out.println("2.count : " + count);
                System.out.println("2.temp : " + temp);
                System.out.println(" ");
            }
            queue.poll(); //출력문에 넣어도 실행
        }
        if(count >= temp) return count;
        return temp;
    }
}
