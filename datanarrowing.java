package day2;

public class datanarrowing {
	public static void main(String[] args) {
	int i = 88; 
	double d = 23.7;

	System.out.println("i="+i);
	System.out.println("d="+d);
	System.out.println("After primitive data type conversion");
	i=(int) d;
	System.out.println("i="+i);
	System.out.println("d="+d);
}
}
