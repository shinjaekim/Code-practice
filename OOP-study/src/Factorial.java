// 재귀호출
public class Factorial {
    public static void main(String[] args){
        int result = factorial(7);
        System.out.println(result);
    }
    static int factorial(int a){
        int result = 0;
        if(a == 1)
            result = 1;
        else
            result =  a * factorial(a-1);
        return result;
    }
}
/*
반복문보다 참조하고 메모리 올리고 하는 일련의 과정으로 더 오래걸리지만
논리적으로 파악하기가 편하기 때문에 쓴다.
 */
