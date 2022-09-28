package helloworld;
public class String_Operation_Demo {
public static void main(String args[]) {
	String s1="Bhanu",s2=" Pratap";String  s3="";
	// length operator
	System.out.println(s1.length());
	//Sub stribg
	System.out.println(s1.substring(2,5));
	System.out.println(s1.compareTo(s2));
    System.out.println(s3.isEmpty());
    String s4="hello",s5="HELLO";
    System.out.println(s4.toUpperCase());
    System.out.println(s5.toLowerCase());
    int a=50;
    String s=String.valueOf(a);
    System.out.println(s);
	
}
}
