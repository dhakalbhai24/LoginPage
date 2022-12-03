import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        Service service =  new Service();
        System.out.println("***********************");
        System.out.println("***Simple Calculator***");
        System.out.println("***********************");

        System.out.println("1. Add" +"\n2. Subtract" +
                "\n3. Multiply" + "\n4. Divide");

        System.out.println("\nChoose your option:");
        int task = scan.nextInt();

        switch (task)
        {
            case 1:
                System.out.println("Enter the first number");
                int x = scan.nextInt();

                System.out.println("Enter the second number");
                int y = scan.nextInt();
                service.add(x,y);
                break;

            case 2:
                System.out.println("Enter the first number");
                int c = scan.nextInt();

                System.out.println("Enter the second number");
                int d = scan.nextInt();
                service.subtract(c,d);
                break;

            case 3:
                System.out.println("Enter the first number");
                int e = scan.nextInt();

                System.out.println("Enter the second number");
                int f = scan.nextInt();
                service.multiply(e,f);
                break;

            case 4:
                System.out.println("Enter the first number");
                int g = scan.nextInt();

                System.out.println("Enter the second number");
                int h = scan.nextInt();
                service.divide(g,h);
                break;
            default:
                System.out.println("Option not valid");

        }

    }
}
