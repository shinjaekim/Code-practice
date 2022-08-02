import java.sql.SQLOutput;
import java.util.*;

public class DeleteMaxMinTest {
    public static void main(String[] args) {
        Dmnt d = new Dmnt();
        String[] output = d.removeExtremes(new String[]{"where", "is", "the", "longest", "word","me"});

        System.out.print(Arrays.toString(output));
    }
}
class Dmnt{
    public String[] removeExtremes(String[] arr) {
        // TODO:
        if(arr.length == 0) return null;

        String max = "";
        String min = "akdkfkskdk";

        ArrayList<String> list = new ArrayList<>();

        for(int i = 0 ; i < arr.length ; i++){
            list.add(arr[i]);
        }
        System.out.println(Arrays.toString(list.toArray()));

        for(String s : list){
            if(s.length() >= max.length()) max = s;
            if(s.length() <= min.length()) min = s;
        }
        System.out.println(max);
        System.out.println(min);

        list.remove(list.indexOf(max));
        list.remove(list.indexOf(min));

        String[] result = new String[arr.length-2];
        for(int i = 0 ; i<list.size() ; i++){
            result[i] = list.get(i);
        }

        return result;
    }
}