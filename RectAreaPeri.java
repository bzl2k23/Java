/*program to find area,perimeter of rectangle
 using classes and objects.*/
 import java.io.DataInputStream;
 class Rectangle{
    int l,b;
    void getData(int x,int y)
    {
        l=x;
        b=y;
    }
    int rectArea()
    {
        return(l*b);
    }
    int rectPeri()
    {
        return(2*(l+b));
    }
    }
 class RectAreaPeri{
    public static void main(String args[]){
        try{
            DataInputStream in=new DataInputStream(System.in);
            Rectangle r=new Rectangle();
            System.out.println("Enter the length and breadth");
            int m=Integer.parseInt(in.readLine());
            int n=Integer.parseInt(in.readLine());
            r.getData(m,n);
            int a=r.rectArea();
            int p=r.rectPeri();
            System.out.println("Area of rectangle= "+a);   
            System.out.println("Perimeter of rectangle= "+p);
           }catch(Exception e){}
    }
 }