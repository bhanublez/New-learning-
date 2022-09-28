package helloworld;

import java.util.Scanner;
interface CALC_DEMO{
    public void add();
    public void multiply();
}
class com implements CALC_DEMO
{
    double x,y,z,add;
    public void add()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three number: ");
        x= sc.nextDouble();
        y= sc.nextDouble();
        z= sc.nextDouble();
        add= x+y+z;
        System.out.println("the addition of three number=" +add);
    }
    public void multiply()
    {
        System.out.println("The multiplicatuion of three numbers is "+(x*y*z));
    }
}
class interdemo
{
    public static void mai(String[] args){
        com c=new com();
        c.add();
        c.multiply();
    }
}