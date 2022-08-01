import java.util.*;

public class BlackJackTest {
    public static void main(String[] args) {
        Bjt b = new Bjt();

        int[] cards = new int[]{1, 2, 3, 4};

        System.out.println(b.boringBlackjack(cards));
    }
}
class Bjt{
    public int boringBlackjack(int[] cards) {
        // TODO:
        ArrayList<int[]> list = new ArrayList<>();
        int count = 0;

        for(int i = 0; i < cards.length; i++) {
            for(int j = i + 1; j < cards.length; j++) {
                for(int k = j + 1; k < cards.length; k++) {
                    int[] input = {cards[i], cards[j], cards[k]};
                    list.add(input);
                }
            }
        }

        for(int[] x : list) {
            int sum = 0;
            sum = x[0] + x[1] + x[2];

            count+= Isprime(sum);
        }
        return count;
    }
    public int Isprime(int num){
        int count = 0;

        for(int i = 1 ; i <=num ; i++){
            if(num % i == 0) count++;
        }
        if(count == 2) return 1;
        else return 0;
    }
}

