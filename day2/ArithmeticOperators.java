package week1.day2;

public class ArithmeticOperators {
public void add() {
	int a=2 , b=4;
	int c=a+b;
	System.out.println("addition:"+c);
}
public void sub() {
	int a=5,b=8;
	int c=a-b;
	System.out.println("subraction:"+c);
}
public void mul() {
	int a=10,b=30;
	int c=a*b;
	System.out.println("multiplication:"+c);
}
public void div() {
	int a=3,b=9;
	int c=a/b;		
	System.out.println("division:"+c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArithmeticOperators op= new ArithmeticOperators();
op.add();
op.sub();
op.mul();
op.div();
	}

}
 