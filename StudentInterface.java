import java.io.DataInputStream;
class Student{
	int rollno;
 void getRoll(int x){
	rollno=x;
}
 void putRoll(){
	System.out.println("Roll Number="+rollno);
}
}

class Test extends Student{
	int mark1,mark2;
 void getMark(int a,int b){
	mark1=a;
	mark2=b;
}
 void putMark(){
	System.out.println("Mark 1="+mark1);
	System.out.println("Mark 2="+mark2);
}
}

interface Sports{
final float spmrk=6.5f;
void putSMark();
}

class Score extends Test implements Sports{
public void putSMark(){
	System.out.println("Sports Mark="+spmrk);
}
void totalMark(){
	float total=mark1+mark2+spmrk;
	System.out.println("Total Mark="+total);

}	
}

class StudentInterface{
	public static void main(String args[]){
	try{
	DataInputStream in= new DataInputStream(System.in);
	Score s=new Score();
	System.out.println("Enter Roll NUmber");
	int rn=Integer.parseInt(in.readLine()); 
	s.getRoll(rn);
	System.out.println("Enter Mark 1 and Mark 2");
	int mk1=Integer.parseInt(in.readLine()); 
	int mk2=Integer.parseInt(in.readLine()); 
	s.getMark(mk1,mk2);
	s.putRoll();
	s.putMark();
	s.putSMark();
	s.totalMark();
}catch(Exception e){}
}
}
	
	