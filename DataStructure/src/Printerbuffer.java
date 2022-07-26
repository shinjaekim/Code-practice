import java.util.*;

public class Printerbuffer {
    public static void main(String[] args) {
        int bufferSize = 4;
        int capacities = 12;
        int[] documents = new int[]{7, 10, 6, 2, 9 ,4};

        Solution2 s = new Solution2();
        s.queuePrinter(bufferSize, capacities, documents);
    }
}
class Solution2 {
    public int queuePrinter(int bufferSize, int capacities, int[] documents) {
        // TODO:
        int second = 0;       // 반환할 초
        int sum = 0;          // capacities랑 비교할 것

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0 ; i < bufferSize ; i++) {       // 큐를 0으로 채우고 시작한다.
            queue.add(0);
        }

        sum += documents[0];      // 일단 첫 요소 더해주자  용량과의 비교
        queue.poll();             // 하나 빼고
        queue.add(documents[0]);  // 첫 요소 넣어준다
        documents = Arrays.copyOfRange(documents, 1, documents.length); // 대기열 하나 줄었다.
        second++;

        System.out.println("1. :" + queue);
        System.out.println("sum :" + sum);
        System.out.println("second :" + second);
        System.out.println(documents.length);
        System.out.println(" ");
        // 대기열에 들어갈 수 있는가는 큐의 합 + 첫 대기목록의 합이 용량보다 적으면 된다.

        while(documents.length != 0){ // 대기열이 남아있다면 작업을 시작해보자
            sum += documents[0];      // 첫번째 목록을 더해봤을때 용량이랑 비교해보자

            System.out.println("현재 대기문서 : " + documents[0]);
            System.out.println("중간 sum :" + sum);
            System.out.println(" ");

            if(sum > capacities) {       // 그 값이 용량보다 커졌다면

                sum -= queue.peek();  // 그 상황에서 큐 첫 요소가 빠질경우 목록 진입이 가능한가여부를 확인하기 위해서
                if(sum <= capacities){    // 가능하네??
                    queue.poll();
                    queue.add(documents[0]);
                    second++;
                    documents = Arrays.copyOfRange(documents, 1, documents.length);  //진입시킨다.

                    System.out.println("2. :" + queue);
                    System.out.println("sum :" + sum);
                    System.out.println("second :" + second);
                    System.out.println(documents.length);
                    System.out.println(" ");

                }
                else if(sum > capacities) { // 첫 큐가 빠져도 목록 진입이 불가하다면
                    queue.poll();         // 바로 첫 요소 빼주고
                    queue.add(0);         // 0을 넣어주자
                    second++;             // 1초 추가

                    sum -= documents[0];


                    System.out.println("3. :" + queue);
                    System.out.println("sum :" + sum);
                    System.out.println("second :" + second);
                    System.out.println(documents.length);
                    System.out.println(" ");

                    continue;
                }
            }

            else if(sum <= capacities){  // 용량보다 작으면
                sum -= queue.peek();
                queue.poll();
                queue.add(documents[0]);
                documents = Arrays.copyOfRange(documents, 1, documents.length);
                second++;

                System.out.println("4. :" + queue);
                System.out.println("sum :" + sum);
                System.out.println("second :" + second);
                System.out.println(documents.length);
                System.out.println(" ");
            }
        }
        for(int i = 0 ; i < bufferSize ; i++){
            queue.poll();
            queue.add(0);
            second++;

            System.out.println("5. :" + queue);
            System.out.println("sum :" + sum);
            System.out.println("second :" + second);
            System.out.println(documents.length);
            System.out.println(" ");
        }
        return second;
    }
}

//    public int queuePrinter(int bufferSize, int capacities, int[] documents) {
//        // TODO:
//        int second = 0;       // 반환할 초
//        int sum = 0;          // capacities랑 비교할 것
//
//        Queue<Integer> queue = new LinkedList<>();
//
//        for(int i = 0 ; i < bufferSize ; i++) {       // 큐를 0으로 채우고 시작한다.
//            queue.add(0);
//        }
//
//        sum += documents[0];      // 일단 첫 요소 더해주자
//        queue.poll();             // 하나 빼고
//        queue.add(documents[0]);  // 첫 요소 넣어준다
//        second++;
//
//        System.out.println("1. :" + queue);
//        System.out.println("sum :" + sum);
//        System.out.println("second :" + second);
//        System.out.println(" ");
//
//        for(int i = 1 ; i < documents.length ; i++){     // 배열 길이만큼 -1 만큼 (처음에 하나 추가했으니)
//            sum += documents[i];                          // 바로 들어갈 수 있는지 확인하자
//            if(sum > capacities){                        // 더해서 용량을 초과한다면
//                while(sum > capacities){
//                    sum -= queue.peek();              // sum에서 맨앞 빼주면서
//                    if(sum <= capacities) break;
//                    queue.poll();                     // 바로 내보내고
//                    queue.add(0);                     // 그만큼 0을 채워준다.
//                    second++;                         // 그리고 1초씩 추가
//
//
//                    System.out.println("2. :" + queue);
//                    System.out.println("sum :" + sum);
//                    System.out.println("second :" + second);
//                    System.out.println(" ");
//                }
//                queue.poll();                        //들어갈 공간이 확보가 되면
//                queue.add(documents[i]);             //빼면서 추가
//                second++;
//
//                System.out.println("3. :" + queue);
//                System.out.println("sum :" + sum);
//                System.out.println("second :" + second);
//                System.out.println(" ");
//
//            }
//            else if(sum <= capacities){
//                queue.poll();
//                queue.add(documents[i]);
//                second++;
//                System.out.println("4. :" + queue);
//                System.out.println("sum :" + sum);
//                System.out.println("second :" + second);
//                System.out.println(" ");
//
//            }
//        }
//        for(int i = 0 ; i< bufferSize ; i ++){
//            queue.poll();
//            queue.add(0);
//            second++;
//            System.out.println("5. :" + queue);
//            System.out.println("sum :" + sum);
//            System.out.println("second :" + second);
//            System.out.println(" ");
//
//        }
//        return second;
//    }
//}
// -> 이렇게 한 경우 파일이 용량보다 크면 무한루프를 돌게 됨. while문 때문에
//    따라서 while조건을 확실히 끝낼 수 있는 것이 필요함







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


//package com.codestates.coplit;
//        import java.util.*;
//
//public class Solution {
//    public int queuePrinter(int bufferSize, int capacities, int[] documents) {
//        // TODO:
//        int second = 0;
//        int sum = 0;
//
//        Queue<Integer> queue = new LinkedList<>();
//
//        for(int i = 0 ; i < bufferSize ; i++) {
//            queue.add(0);
//        }
//        for(int i = 0 ; i < documents.length ; i++){
//            sum += documents[i];
//            if(sum > capacities){
//                sum -= queue.peek();
//                queue.poll();
//                queue.add(0);
//                second++;
//
//                if(sum <= capacities){
//                    queue.add(documents[i]);
//                    second++;
//
//                }
//                else if(sum > capacities){
//                    sum -= queue.peek();
//                    queue.poll();
//                    queue.add(documents[i]);
//                    second++;
//                }
//            }
//            else if(sum <= capacities){
//                queue.poll();
//                queue.add(documents[i]);
//                second++;
//            }
//        }
//        for(int i = 0 ; i< bufferSize ; i ++){
//            queue.poll();
//            queue.add(0);
//            second++;
//        }
//        return second;
//    }
//}
