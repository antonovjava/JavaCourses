public class Calculate{

    public static void main(String[] args) {
        System.out.println("Calculate...");
        double first = Double.parseDouble(args[0]);
        double second = Double.parseDouble(args[1]);

        double result=0;
        if (args[2].equals("+")) {result = first + second;}
        if (args[2].equals("-")) {result = first - second;}
        if (args[2].equals("*")) {result = first * second;}
        if (args[2].equals("/")) {result = first / second;}
        System.out.println("Result: " + result);
    }
}