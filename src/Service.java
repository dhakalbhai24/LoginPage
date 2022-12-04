
public class Service implements Operation{
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        return a/b;
    }

    @Override
    public void displayMenu() {
        System.out.println("***********************");
        System.out.println("***Simple Calculator***");
        System.out.println("***********************");

        System.out.println("1. Add" +"\n2. Subtract" +
                "\n3. Multiply" + "\n4. Divide");

        System.out.println("\nChoose your option:");
    }
}
