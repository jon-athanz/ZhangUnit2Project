import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("Enter coordinate 1: i.e. (x, y)");
        String first = scan.nextLine();
        System.out.println("Enter coordinate 2: i.e. (x, y)");
        String second = scan.nextLine();

        String x = first.substring(1, first.indexOf(","));
        String y = first.substring(first.indexOf(" ") + 1, first.indexOf(")"));

        String x2 = second.substring(1, second.indexOf(","));
        String y2 = second.substring(second.indexOf(" ") + 1, second.indexOf(")"));

        int firstXAsInt = Integer.parseInt(x);
        int firstYAsInt = Integer.parseInt(y);
        int secondXAsInt = Integer.parseInt(x2);
        int secondYAsInt = Integer.parseInt(y2);

        if (firstXAsInt == secondXAsInt) {
            System.out.println("You have entered coordinates that result in a negative line");
            System.out.println("The equation is x = " + firstXAsInt);
        }

        LinearEquation line = new LinearEquation(firstXAsInt, firstYAsInt, secondXAsInt, secondYAsInt);
        System.out.println(line.slope());
    }
}
