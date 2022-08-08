public class ReadVerticalTest {
    public static void main(String[] args) {
        RVT r = new RVT();
        String[] input = new String[]{"hey","I","miss","you"};
        r.readVertically(input);

        System.out.println(r.readVertically(input));
    }
}
class RVT{
    public String readVertically(String[] arr) {

        String result = "";
        int maxString = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].length()>maxString) maxString = arr[i].length();
        }
        System.out.println(maxString);

        for(int i = 0 ; i < maxString ; i++){
            for(int j = 0 ; j < arr.length ; j++){
                String str = Character.toString(arr[j].charAt(i));
                if(str.isEmpty()) continue;
                System.out.println(str);
                result = result + arr[j].charAt(i);
            }
        }
        return result;
    }
}
