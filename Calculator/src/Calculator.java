import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Calculator {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] number = s.split(" ");

        try {

            if (isNumber(number[0]) && isNumber(number[2])) {
                //работа с арабскими
                Arabic arab = new Arabic(number);
                arab.action();

            } else {
                //работа с римскими
                RomCalculation roma = new RomCalculation(number);
                roma.action();
            }
        }
        catch(Exception e){
            System.out.println("Ошибка ввода");
        }
    }

    static boolean isNumber(String a){
        for (char c : a.toCharArray())
        {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
}