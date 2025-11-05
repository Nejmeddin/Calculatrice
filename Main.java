public class Main {
    public static void main(String[] args) {
        int a = 2, b = 3;
        Operation op = new Operation();
        System.out.println(a + " * " + b + " = " + Operation.multiplication(a, b));
        System.out.println(a + " - " + b + " = " + Operation.soustraction(a, b));
        System.out.println(a + " + " + b + " = " + Operation.addition(a, b));
    }
}
