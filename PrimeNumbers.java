class PrimeNumbers {
    public static void main(String args[]) {
        // Input values m and n from command line arguments
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        // Loop through numbers in the range [m, n)
        for (int i = m; i < n; i++) {
            int flag = 0;
            int k = (int) Math.sqrt(i);

            // Check for factors from 2 to sqrt(i)
            for (int j = 2; j <= k; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }

            // If no factors found, print the prime number
            if (flag == 0)
                System.out.println(i);
        }
    }
}
