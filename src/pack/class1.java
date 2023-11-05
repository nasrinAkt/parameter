package pack;

public class class1 {

	public static void main(String[] args) {
		class1 yellow = new class1();
		yellow.night(500, 500);
		yellow.day(45.50, 50);
		yellow.evening(" Nasrin", 'A');
		yellow.noon(1, ". Nazeefah ", 'R', " Laiba");
		
	}
public void night(int a, int b) {
int c = a+b;
System.out.println(c);
}
public void day(double a, int b) {
System.out.println(a+b);	
}	
public void evening(String a, char b) {
System.out.println(b+a);
}	
public void noon(int a,String b, char c,String d) {
System.out.println(a+b+c+d);	
}	
	
}
