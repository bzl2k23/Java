import pack.Prime;
import java.io.DataInputStream;

class MatrixPrime {
    public static void main(String args[]) {
        try {
            DataInputStream in = new DataInputStream(System.in);
            int sum = 0;
            Prime p = new Prime();
            System.out.println("enter the no of rows of the matrix:");
            int m = Integer.parseInt(in.readLine());
            System.out.println("enter the no of columns of the matrix:");
            int n = Integer.parseInt(in.readLine());
            int a[][] = new int[m][n];
            System.out.println("enter matrix elements:");

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = Integer.parseInt(in.readLine());
                }
            }
            
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum=sum+a[i][j];
                }
            }
        }


            int F = p.PrimeCheck(sum);

            if (F == 1) {
                System.out.println(sum + " is not a prime");
            } else {
                System.out.println(sum + " is a prime");
            }
        } catch (Exception e) {}
    }
    }

