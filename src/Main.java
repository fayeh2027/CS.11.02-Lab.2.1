/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int sum = add(12, 20);
        System.out.println(sum);
        int sum2 = add(12, 15, 18, 20);
        System.out.println(sum2);
        System.out.println(morningGreeting("John"));
        System.out.println(afternoonGreeting("Alysha"));
        System.out.println(triple("lilly"));
        System.out.println(half(17));
        System.out.println(roundPositiveValueToNearestInteger(3.7));
        System.out.println(roundNegativeValueToNearestInteger(-8.5));
    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d) {
        return add(add(a, b), add(c, d));
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple(String variable) {
        return variable + variable + variable;
    }

    // 6. half
    public static double half(int number) {
        return number / 2.0;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double number) {
        return (int) Math.round(number);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double number) {
        return (int) Math.round(number - 0.5);
    }
}