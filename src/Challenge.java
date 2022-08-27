import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("First salary: ");
        String value1 = input.next().replace(",",".");
        System.out.println("Second salary: ");
        String value2 = input.next().replace(",",".");
        System.out.println("Third salary: ");
        String value3 = input.next().replace(",",".");

        double salary1 = Double.parseDouble(value1);
        double salary2 = Double.parseDouble(value2);
        double salary3 = Double.parseDouble(value3);

        double sum = (salary1 + salary2 + salary3);
        double average = (salary1 + salary2 + salary3 /3);

        System.out.println("The sum of salary is: " + sum);
        System.out.println("The average is: " + average);

        input.close();
    }
}
