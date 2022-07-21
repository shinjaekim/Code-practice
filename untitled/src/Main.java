import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        int[] head = Arrays.copyOfRange(arr,0,1);
        System.out.println(head[0]);
        int[] mid = Arrays.copyOfRange(arr,1,arr.length-2);
        System.out.println(mid);
        int[] tail = Arrays.copyOfRange(arr, arr.length-2, arr.length-1);
        System.out.println(tail);

        ArrayUtils.addAll
    }
}
1 2 3 4 5 6

6 1 2 3 4 5
  5 1 2 3 4
    4 1 2 3
      3 1 2
        2 1


int head = arr[0]

int[] head = reverseAll( 1 2 3 4 5 )
int[] tail = 6

int[] temp = tail + head

System.arraycopy

return temp