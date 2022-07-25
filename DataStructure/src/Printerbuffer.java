import java.util.*;

public class Printerbuffer {
    public static void main(String[] args) {
        int bufferSize = 2;
        int capacities = 10;
        int[] documents = new int[]{7, 4, 5, 6};

        Solution2 s = new Solution2();
        s.queuePrinter(bufferSize, capacities, documents);
    }
}
class Solution2 {
    public int queuePrinter(int bufferSize, int capacities, int[] documents) {
        // TODO:
        int second = 0;     //걸리는 시간
        int sum = 0; // capacities랑 비교할거
        Queue<Integer> queue = new LinkedList<>(); //큐생성해서 - 큐 역할. 작업공간목록

        int qSize = capacities / bufferSize; // 작업목록 한 칸의 크기 구하기

        for(int i = 0 ; i < documents.length ; i++) {

            sum += documents[i];
            while(sum > capacities){         // 용량보다 크게 될 시에 앞에 덜어내는 작업
                if(queue.peek() > qSize){
                    sum -= queue.peek();
                    queue.poll();
                    queue.poll();
                }
                else{
                    sum -= queue.peek();
                    queue.poll();
                }
            }

            if(queue.size() == bufferSize) {    // 1. 꽉 찬 경우
                if (queue.peek() > qSize) {     // a. 맨 앞이 목록 크기보다 크면
                    queue.poll();
                    queue.poll();               // 앞 요소 빼주고
                    if (documents[i] > qSize) { //ㄱ. 그리고 넣을 요소가 q사이즈보다 크면
                        queue.add(documents[i]);
                        queue.add(0);               // 넘친만큼 어차피 이애가 차지하기때문
                        second++;
                        second++;               // 두칸 옮긴거 한번에 계산함
                    }
                    else { //ㄴ. 그리고 넣을 요소가 q사이즈보다 작으면
                        queue.add(documents[i]);
                        second++;
                    }
                if(queue.peek() < qSize){ // b. 맨 앞이 목록 크기보다 작으면
                        if (documents[i] > qSize) { //ㄱ. 그리고 넣을 요소가 q사이즈보다 크면
                            queue.poll();
                            queue.poll();
                            queue.add(documents[i]);
                            queue.add(0);  // 넘친만큼 어차피 이애가 차지하기때문
                            second++;
                            second++;  // 두칸 옮긴거 한번에 계산함
                        } else { //ㄴ. 그리고 넣을 요소가 q사이즈보다 작으면
                            queue.add(documents[i]);
                            second++;
                        }
                    }
            if (queue.size() == bufferSize - 1) {  // 2. 꽉 안찼는데 한칸 남은 경우
                        if (documents[i] > qSize) {

                        } else {

                        }
                    } else {  // 3. 꽉 안차고 두칸이상 남은 경우
                        if (documents[i] > qSize) {

                        } else {

                        }
                    }
                }
            }
        }

        return second;
    }
}
//System.out.println("2. queue : " + queue);
//        System.out.println("2. second : " + second);
//        System.out.println("2. qSize: " + qSize);
//        System.out.println(" ");

//    작업목록의 크기, 최대 용량
//        칸으로 이루어짐
//        한개의 문서만
//        2           10
//        1초 0001111111
//        2초 1111111000
//        3초 0000001111
//        4초 1111011111
//        5초 1111100000
//        6초 0000111111
//        7초 1111110000
//        8초 0000000000 완료.

// 꽉 찬 경우
//      맨 앞이 qSize보다 큰 경우
//          qSize보다 작은 경우
// 꽉 안 찬 경우
//      한칸 남은 경우
//          넣을 것이 qSize보다 큰 경우
//          넣을 것이 qSize보다 작은 경우
