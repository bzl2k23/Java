import java.io.DataInputStream;

class GreaterException extends Exception {
    public GreaterException() {
        super();
    }
}

class ExGreater {
    static void checkNumbers(int num1, int num2) throws GreaterException {
        if (num1 > num2) {
            throw new GreaterException();
        }
    }

    public static void main(String args[]) {
        try {
            DataInputStream in = new DataInputStream(System.in);
            System.out.println("Enter the first number: ");
            int num1 = Integer.parseInt(in.readLine());

            System.out.println("Enter the second number: ");
            int num2 = Integer.parseInt(in.readLine());

            try {
                checkNumbers(num1, num2);
                System.out.println("The first number is not greater than the second number.");
            } catch (GreaterException ge) {
                System.out.println("First number is greater than the second number.");
            }

        } catch (Exception e) {
            
        }
    }
}
