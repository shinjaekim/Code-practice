public class SuperIncreasingTest {
    public static void main(String[] args) {
        Sit s = new Sit();
        int[] arr = {1, 4, 7, 12, 23};
        s.superIncreasing(arr);
    }
}

class Sit{
    public boolean superIncreasing(int[] arr) {
        // TODO:
        int sum = 0;

        for(int i = 1 ; i<arr.length ; i++){
            sum += arr[i-1];
            if(sum >= arr[i]) return false;
        }
        return true;
    }
}