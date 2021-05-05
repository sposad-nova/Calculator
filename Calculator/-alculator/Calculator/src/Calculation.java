import java.util.ArrayList;
import java.util.Arrays;

public abstract class Calculation {

    protected ArrayList<String> sim = new ArrayList<>(Arrays.asList("+", "-", "*", "/"));

    protected int plus(int a, int b) {

        return a + b;
    } // сложение

    protected int minus(int a, int b) {

        return a - b;
    } // вычитание

    protected int multi(int a, int b) {

        return a * b;
    } // умножение

    protected int div(int a, int b) {
        if(b > 0) return a / b;
        else {
            System.out.println("На ноль делить нельзя!");
            System.out.println("Ноль выглядит так:");
            System.exit(0);
            return 0;
        }


    } // деделние



    //Ввыполняем действие

    public abstract void action();

}
