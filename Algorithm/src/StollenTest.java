// 다시 풀어볼것!!

import java.util.*;

public class StollenTest {
    public static void main(String[] args) {
        STsolution s = new STsolution();
        int target = 50;
        int[] type = {10, 20, 50};

        s.ocean(target, type);
    }
}
class STsolution{
    public long ocean(int target, int[] type) {
        // TODO:

        // 훔치고자 하는 목표액 -> target(parameter)
        // 목표액에 도달하는 경우의 수  -> count
        int count = 0;

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0 ; i < type.length ; i++){
            arr.add(type[i]);
        }  // 쓰기 편하게 Arraylist

        if(arr.size() == 0) return count; // 재귀 탈출

        System.out.println("1. count : " + count);

        for(int i = 0 ; i < type.length ; i++){
            if( target % type[i] == 0){
                count++;
                System.out.println("1. count : " + count);
            }
            else if ( target % type[i] != 0 ){
                target = target % type[i];
                arr.remove(i);
                int[] temp = arr.stream().mapToInt(j->j).toArray();
                ocean(target, temp);
            }
        }
        return count;
    }
}

/* 내 사고 과정
오름차순 정렬시킴
1. 경우의 수를 세야함
2. target머니가 있음 이걸가지고 두가지를 검사해야함
    for문 통해서 다 한번에 나뉘어지는지 여부를 돌려본다.

이건 다시하자

 */
