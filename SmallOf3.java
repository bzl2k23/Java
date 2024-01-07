import java.io.DataInputStream;
class SmallOf3{
public static void main(String args[]){
try{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter 3 numbers");
int a=Integer.parseInt(in.readLine());
int b=Integer.parseInt(in.readLine());
int c=Integer.parseInt(in.readLine());
int small=a;
if(a>b)
{
if(b>c)
small=c;
else
small=b;
}
else
{
if(a>c)
small=c;
else
small=a;
}
System.out.println("Smallest="+small);
}catch(Exception e){}
}
}
