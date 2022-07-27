//public class GenericTest {
//    public static void main(String[] args) {
//        Something s = new Something(7);
//    }
//}
//class Something{
//    private int item;
//
//    Something(int item){
//        this.item = item;
//    }
//
//    public int getItem() {
//        return item;
//    }
//
//    public void setItem(int item) {
//        this.item = item;
//    }
//}

public class GenericTest {
    public static void main(String[] args) {
        Something<String> s = new Something<String>("꽃");
        Something<Integer> s1 = new Something<Integer>(6);
    }
}
class Something<T>{
    private T item;

    Something(T item){
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}