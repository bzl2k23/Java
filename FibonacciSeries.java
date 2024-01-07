class FibonacciSeries{
    public static void main(String args[]){
        int n=Integer.parseInt(args[0]);
        System.out.println("Fibonacci Series");
        for(int i=0;i<n;i++)
        System.out.println(fibonacci(i)+"  ");
    }
    public static int fibonacci(int i){
        if(i<=1){
            return i;
        }
        return fibonacci(i-1)+fibonacci(i-2);
    }
    }