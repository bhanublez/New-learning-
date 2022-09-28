package helloworld;
import java.util.Scanner;
public class compute {
int a,b,c;
public  int add(int x, int y){
	int a,b;
	a=x;
	b=y;
return(a+b);	
}
public double add(double l,double m, double n) {
	double a, b, c;
	a=l;
	b=m;
	c=n;
	return(a+b+c);
}
public void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	compute obj=new compute();
	int s1=obj.add(5, 8);
	System.out.println("Addition of two integer is: "+s1);
	double s2=obj.add(3.3,5.44, 9.456);
	System.out.println("Addition of three double number is:"+s2);
}


}
