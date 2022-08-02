import java.util.Arrays;

public class InsertDashTest {
    public static void main(String[] args) {
        Idt test = new Idt();
        test.insertDash("6734511957679419143");

        System.out.println(test.insertDash("6734511957679419143"));

    }
}
class Idt {
    public String insertDash(String str) {

        if(str.length() == 0){
            return null;
        }

        String result = " " + str.charAt(0);

        for(int i = 1 ; i < str.length() ; i++){
            if((str.charAt(i-1) % 2 == 1) && (str.charAt(i) % 2 == 1)){
                result = result + "-";
            }
            result = result + str.charAt(i);
        }
        return result;
    }
}


