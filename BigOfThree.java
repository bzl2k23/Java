class BigOfThree{
public static void main(String args[]){
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
int big=a;
int small=a;
if(b>big){
big=b;
if(c<small)
small=c;
}
if(c>big){
big=c;
if(b<small)
small=b;
}
System.out.println("biggest number="+big);
System.out.println("smallest number="+small);
}
}