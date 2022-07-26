public class AbstractTest {
    public static void main(String[] args) {
        Flowerbox f = new Flowerbox();
        Honeybox h = new Honeybox();

        f.naming();
        h.naming();
    }
}

abstract class Box{
    String name;
    abstract void naming();
}

class Flowerbox extends Box{
    public Flowerbox(){
        this.name = "꽃박스";
    }
    public void naming(){
        System.out.println("꽃박스에요");
    }
}

class Honeybox extends Box{
    public Honeybox(){
        this.name = "꿀박스";
    }
    public void naming(){
        System.out.println("꿀박스에요");
    }
}
