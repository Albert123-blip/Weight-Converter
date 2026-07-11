import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the new weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592; //  formula for calculating the new Weight

            System.out.printf("The new Weight is: %.2fkgs", newWeight);
        }

        else if (choice == 2) {
            System.out.print("Enter the new weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462; // formula for calculating the new Weight

            System.out.printf("The new Weight is: %.2flbs", newWeight);
        }

        else {
            System.out.println("Enter a valid choice!");
        }

        scanner.close();

    }
}