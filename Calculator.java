//NAME : APOTIADE JOSEPH
//MATRIC_NO : IFT/22/9201

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add two integers: " + calc.add(2, 3));
        System.out.println("Add three integers: " + calc.add(1, 2, 3));
        System.out.println("Add two doubles: " + calc.add(2.5, 3.5));
    }
}
