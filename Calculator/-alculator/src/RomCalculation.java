import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomCalculation extends Calculation{
    private final String numOne;
    private final String numTwo;
    private final String str;
    private int result;

    private ArrayList<String> rom = new ArrayList<>(Arrays.asList("I", "II", "III", "IV", "VI", "VII", "VIII", "IX", "X"));
    private Map<String, Integer> map = new HashMap<>();

    public RomCalculation(String[] number) {

        if(rom.contains(number[0]) && rom.contains(number[2])){
            if(sim.contains(number[1])) {
                numOne = number[0];
                numTwo = number[2];
                str = number[1];
                for (int i = 0; i < rom.size(); i++) {
                    map.put(rom.get(i), i + 1);
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
            case "-": result = minus(map.get(numOne), map.get(numTwo));
                break;
            case "*": result = multi(map.get(numOne), map.get(numTwo));
                break;
            case "/": result = div(map.get(numOne), map.get(numTwo));
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

