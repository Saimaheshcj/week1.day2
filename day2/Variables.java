package week1.day2;

public class Variables {
String name;
char c;
double value;
boolean isvariable;

public void add() {
	int a=0;
	System.out.println(a);
	int  b=5;
    int c=a+b;
    System.out.println(c);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Variables var=new Variables();
System.out.println(var.name);
System.out.println(var.c);
System.out.println(var.isvariable);
System.out.println(var.value);
var.add();
	}

}
