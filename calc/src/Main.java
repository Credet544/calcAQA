import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        System.out.println(calc(expression));
        
    }
    public static String calc(String input) throws Exception {
        String[] elements = input.split(" ");
        String availableNumbers = "1 2 3 4 5 6 7 8 9 10";
        if (elements.length == 3 && availableNumbers.contains(elements[0]) && availableNumbers.contains(elements[2])) {
            int result;
            switch (elements[1]) {
                case "+":
                    result = Integer.valueOf(elements[0]) + Integer.valueOf(elements[2]);
                    return Integer.toString(result);
                case "-":
                    result = Integer.valueOf(elements[0]) - Integer.valueOf(elements[2]);
                    return Integer.toString(result);
                case "*":
                    result = Integer.valueOf(elements[0]) * Integer.valueOf(elements[2]);
                    return Integer.toString(result);
                case "/":
                    result = Integer.valueOf(elements[0]) / Integer.valueOf(elements[2]);
                    return Integer.toString(result);
                default: throw new Exception("Неизвестный оператор");
            }
        } else if (elements.length != 3) {
            throw new Exception("Неверная длина операции");
        } else {
            throw new Exception("Неизвестные операнды");
        }
    }
}
