import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomCalculation extends Calculation{
    private final String numOne;
    private final String numTwo;
    private final String str;
    private int result;

    private ArrayList<String> rom = new ArrayList<>(Arrays.asList("I", "II", "III", "IV","V", "VI", "VII", "VIII", "IX", "X"));
    private ArrayList<String> romOut = new ArrayList<>(Arrays.asList("I", "II", "III", "IV","V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX",  "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"));
    private Map<String, Integer> map = new HashMap<>();

    public RomCalculation(String[] number) {

        if(rom.contains(number[0]) && rom.contains(number[2])){
            if(sim.contains(number[1])) {
                numOne = number[0];
                numTwo = number[2];
                str = number[1];
                for (int i = 0; i < romOut.size(); i++) {
                    map.put(romOut.get(i), i + 1);
                }
            }
            else{
                System.out.println("Ошибка с вводом знака");
                numOne = "";
                numTwo = "";
                str = "";
                System.exit(0);
            }

        }
            else{
                System.out.println("Ошибка с вводом");
                numOne = "";
                numTwo = "";
                str = "";
                System.exit(0);
            }

    }


    @Override
    public void action(){
        switch (str){
            case "+": result = plus(map.get(numOne), map.get(numTwo));
                break;
            case "-":
                if(map.get(numOne) > map.get(numTwo)){
                    result = minus(map.get(numOne), map.get(numTwo));
                }
                else {
                    System.out.println("Результат меньше I быть не может");
                    System.exit(0);
                }
                break;
            case "*": result = multi(map.get(numOne), map.get(numTwo));
                break;
            case "/":
                if(map.get(numOne) >= map.get(numTwo)){
                    result = div(map.get(numOne), map.get(numTwo));
                }
                else {
                    System.out.println("Результат меньше I быть не может");
                    System.exit(0);
                }

                break;
            default:
                break;
        }
        for (String k : map.keySet())
        {
            if (map.get(k).equals(result) )  {
                System.out.println(k);
                break;
            }
        }
    }

}

