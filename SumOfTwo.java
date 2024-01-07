import java.io.DataInputStream;
class SumOfTwo{
    public static void main(String args[]){
    try{
    DataInputStream in=new DataInputStream(System.in);
    int a=Integer.parseInt(in.readLine());
    int b=Integer.parseInt(in.readLine());
    int sum=0;
    sum=a+b;
    System.out.println("Sum="+sum);
}catch(Exception e){}
}
}