import java.io.DataInputStream;

class InvalidNumberException extends Exception {
    public InvalidNumberException() {
        super();
    }
}

class MultipleException {
    static void readData(int a, int b) throws InvalidNumberException {
        try {
            if (a == 0 || b == 0)
                throw new InvalidNumberException();
        } catch (InvalidNumberException e) {
            System.out.println("Answer is zero");
            System.exit(0);
        }
    }

    static void product(int x, int y) {
        int z = x * y;
        System.out.println("The product=" + z);
    }

    public static void main(String args[]) {
        try {
            DataInputStream in = new DataInputStream(System.in);
            System.out.println("Enter two numbers:");
            int a = Integer.parseInt(in.readLine());
            int b = Integer.parseInt(in.readLine());
            readData(a, b);
            product(a, b);
        } catch (Exception e) {
        }
    }
}
