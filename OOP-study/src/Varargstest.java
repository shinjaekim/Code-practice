// 가변인자 테스트
public class Varargstest {
    public static void main(String[] args){
        ShowString.sample("");
        ShowString.sample("123");
        ShowString.sample("12345");
        ShowString.sample("12352135123");
    }
}
class ShowString{
    static void sample(String... str){
        System.out.println(str.toString());  //이렇게하면 값이 나와야 하지 않나????
    }
}

