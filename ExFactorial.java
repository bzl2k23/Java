class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super();
    }
}

public class ExFactorial {
    public static void main(String args[]) {
        try {
            int number = Integer.parseInt(args[0]);

            if (number < 0) {
                throw new NegativeNumberException();
            }

            long factorialResult = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + factorialResult);
        } catch (NegativeNumberException e) {
            System.out.println("Error: Please enter a non-negative number.");
        } catch (Exception e){}
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}
