public class InsertDashTest {
    public static void main(String[] args) {
        Idt test = new Idt();
        test.insertDash("6734511957679419143");
    }
}
class Idt{
    public String insertDash(String str) {
        // TODO:
        String[] strArr = str.split(" ");
        String result = strArr[0];

        for(int i = 1 ; i < strArr.length ; i++){
            if((int)(Character.getNumericValue(strArr[i].charAt(0))) % 2 != 0){
                System.out.println("발동");
                if((strArr[i-1].charAt(0)-'0') % 2 == 1){
                    result = str.join("-", strArr);
                    System.out.println(result);
                }
            }
            result.concat(strArr[i]);
        }
        return result;
    }
}

