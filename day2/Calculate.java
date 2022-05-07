package week1.day2;

public class Calculate {

	public void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void sub(int b, int c) {
		int d=b+c;
		System.out.println(d);
	}
	public static void main(String[] args) {
		Calculate cal=new Calculate();
		cal.add(25,50);
		cal.sub(20, 10);
	}
}



