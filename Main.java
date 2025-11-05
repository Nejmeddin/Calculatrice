public class Main {
    public static void main(String[] args) {
        int a = 2, b = 3;
        System.out.println("Bienvenue");
        Operation op = new Operation();
        System.out.println(a + " * " + b + " = " + op.multiplication(a, b));
        System.out.println(a + " - " + b + " = " + op.soustraction(a, b));
        System.out.println(a + " + " + b + " = " + op.addition(a, b));
        System.out.println(a+" / "+b+" = "+ op.division(a,b));
    }
}
