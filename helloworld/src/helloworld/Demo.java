package helloworld;
import java.util.Scanner;
class Box{
	float l,b,h,v;
	public void setvalue() {
		Scanner Sc=new Scanner(System.in);
		System.out.println(" Enter the length of box");
		l=Sc.nextFloat();
		System.out.println(" Enter the Breadth of box");
		b=Sc.nextFloat();
		System.out.println(" Enter the height of box");
		h=Sc.nextFloat();
		}
	public void showdata() {
		System.out.println("The length of box is: "+ l);
		System.out.println("The breadth of box is: "+ b);
		System.out.println("The height of box is: "+ h);
		
	}
	public void volume() {
		v=l*b*h;
		System.out.println("The volume of box is: "+v);
	}
}
	public class Demo{
public static void main(String[] args){
	Box B=new Box();
	B.setvalue();
	B.showdata();
	B.volume();
}
}
