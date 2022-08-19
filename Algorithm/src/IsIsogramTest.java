public class IsIsogramTest {
    public static void main(String[] args) {
        Iit i = new Iit();
        String str = "dropOut";
        i.isIsogram(str);

    }
}
class Iit{
    public boolean isIsogram(String str) {
        // TODO:
        String s = str.toUpperCase();
        System.out.println(s);
        String[] strArr =s.split("");

        for(int i = 0 ; i < strArr.length ; i++){
            System.out.println(" ");
            System.out.println(strArr[i]);
            int count = 0;
            for(int j = 0 ; j < strArr.length ; j++){
                if(String.valueOf(strArr[i]) == String.valueOf(strArr[j])) count++;
                System.out.println(count);
                if(count == 2) return false;
            }
        }
        return true;
    }
}

