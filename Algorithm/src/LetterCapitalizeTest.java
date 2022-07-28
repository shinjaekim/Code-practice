public class LetterCapitalizeTest {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.letterCapitalize("hello world");
    }
}
class Solution {
    public String letterCapitalize(String str) {
        // TODO:
        if(str.length() == 0) return "";

        String[] arr = str.split(" ");
        String result = " ";

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].isEmpty()){
                arr[i] = arr[i];
            }
            else{
                arr[i] = String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1);
            }
        }

        result = String.join(" ",arr);
        return result;
    }
}