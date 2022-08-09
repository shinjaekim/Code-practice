public class MakingModuloTest {
    public static void main(String[] args) {
        Mmt m = new Mmt();
        m.modulo(4, 4);
    }
}
class Mmt{
    public Integer modulo(int num1, int num2) {
        // TODO:
        if(num2 == 0) {
            return null;
        }

        while (num1 >= num2) {
            num1 = num1 - num2;
        }

        return num1;
    }
}
