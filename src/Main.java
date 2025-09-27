import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Calculator ---");
        System.out.println("1) Add");
        System.out.println("2) Subtract");
        System.out.println("3) Multiply");
        System.out.println("4) Divide");
        System.out.println("0) Exit");
        System.out.print("Choose: ");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        System.out.println("You chose: " + choice);

        switch (choice) {
            case 1:
                System.out.println("Enter first number: ");
                double a = input.nextDouble();
                System.out.println("Enter second number:");
                double b = input.nextDouble();
                double sum = a + b;
                System.out.println("Result: " + sum);
                break;

            case 2:
                System.out.println("Enter first number:");
                double c = input.nextDouble();
                System.out.println("Enter second number:");
                double d = input.nextDouble();
                double diff = c - d;
                System.out.println("Result: " + diff);
                break;

            case 3:
                System.out.println("Enter first number: ");
                double f = input.nextDouble();
                System.out.println("Enter second number: ");
                double g = input.nextDouble();
                double prod = f * g;
                System.out.println("Result: " + prod);
                break;

            case 4:
                System.out.println("Enter first number: ");
                double x = input.nextDouble();
                System.out.println("Enter second number");
                double y = input.nextDouble();
                if(y==0){
                    System.out.println("Cannot divide by zero");
                }else{
                    double quot=x/y;
                    System.out.println("Result:"+quot);
                }
                break;

            case 0:
                System.out.println("Exiting..");
                break;
            default:
                System.out.println("Invalid choice");


        }
    }
}
