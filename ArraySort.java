import java.io.DataInputStream;
class ArraySort
{
static int[] readArray()
{
int a[]={};
try
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("enter the length of array");
int n=Integer.parseInt(in.readLine());
a=new int[n];
System.out.println("enter the array elements:");
for(int i=0;i<n;i++)
a[i]=Integer.parseInt(in.readLine());
}
catch(Exception e){ }
return a;
}
static int[] sortArray(int[] a)
{
for(int i=0;i<a.length-1;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
return a;
}
static void printArray(int[] a)
{
for(int i=0;i<a.length;i++)
System.out.println(a[i]);
}
public static void main(String args[])
{
int arr[]=readArray();
int s[]=sortArray(arr);
System.out.println("sorted array is:");
printArray(s);
}
}