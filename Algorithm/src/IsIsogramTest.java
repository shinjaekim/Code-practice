public class IsIsogramTest {
    public static void main(String[] args) {
        Iit i = new Iit();
        i.isIsogram("abcdefghii");
    }
}
class Iit{
    public boolean isIsogram(String str) {
        // TODO:
        String newStr = str.toUpperCase();
        System.out.println(newStr);
        String[] strArr =newStr.split("");

        for(int i = 0 ; i < strArr.length ; i++){
            System.out.println(strArr[i]);
            for(int j = 0 ; j < strArr.length ; j++){
                System.out.println(strArr[j]);
                if(strArr[i] == strArr[j]) return false;
            }
        }
        return true;
    }
}

