public class Arabic extends Calculation {
    private final int numOne;
    private final int numTwo;
    private final String str;
    private int result;

    public Arabic(String[] number) {
        if(sim.contains(number[1])){
            this.numOne = Integer.parseInt(number[0]);
            this.numTwo = Integer.parseInt(number[2]);
            this.str = number[1];
            if(numOne > 10 || numTwo > 10){
                System.out.println("Числа не могут быть больше 10");
                System.exit(0);
            }

        }
        else{
            numOne = 0;
            numTwo = 0;
            str = "";
            System.out.println("Неверный знак");
            System.exit(0);
        }

    }

    //Ввыполняем действие
    @Override
    public void action(){
        switch (str){
            case "+": result = plus(numOne, numTwo);
                break;
            case "-": result = minus(numOne, numTwo);
                break;
            case "*": result = multi(numOne, numTwo);
                break;
            case "/": result = div(numOne, numTwo);
                break;
            default:
                break;
        }
        System.out.println(result);
    }
}
