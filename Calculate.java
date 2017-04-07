import java.util.Scanner;

public class Calculate{

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Calculator calc = new Calculator();
        String exit = "no";
        while (!exit.equals("yes")){
            System.out.println("Enter first arg: ");
            String first = reader.next();
            System.out.println("Enter second arg: ");
            String second = reader.next();
            calc.add(Double.parseDouble(first), Double.parseDouble(second));
            System.out.println("Result: " + calc.getResult());
            calc.cleanResult();
            System.out.println("Exit: yes/no ");
            exit = reader.next();
        }
    }
}