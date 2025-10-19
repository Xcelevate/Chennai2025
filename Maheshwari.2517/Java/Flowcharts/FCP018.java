import java.util.Scanner;

public class FCP018{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int basicSalary = scanner.nextInt();
        double HRA, DA, grossSalary;

        if (basicSalary <= 10000) {
            HRA = 0.20 * basicSalary;
            DA = 0.80 * basicSalary;
        } else if (basicSalary <= 20000) {
            HRA = 0.25 * basicSalary;
            DA = 0.90 * basicSalary;
        } else {
            HRA = 0.30 * basicSalary;
            DA = 0.95 * basicSalary;
        }

        grossSalary = basicSalary + HRA + DA;

        // Print gross salary as a whole number
        System.out.println((int)grossSalary);
    }
}