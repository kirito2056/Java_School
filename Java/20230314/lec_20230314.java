import java.util.Scanner;

class lec_20230314 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Calculator calculator = new Calculator();

        calculator.multiply(a, b);
        /*
        calculator.add(a, b);
        calculator.minus(a, b);
        calculator.divide(a, b);
        */
        System.out.println("Hello world");
    }

}

class Calculator {
    void multiply(float a, int b) {
        System.out.println(a * b);
    }

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void minus(int a, int b) {
        System.out.println(a - b);
    }

    void divide(int a, int b) {
        System.out.println(a / b);
    }

}