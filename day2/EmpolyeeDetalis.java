package week1.day2;

public class EmpolyeeDetalis {
	
public void printEmpolyeeName(String empName,int empid) {
	System.out.println("Empolyeename:"+empName+" "+"Empid:"+empid);
}

public void printempolyeeAddress(String empaddress) {
	System.out.println("empolyeeAddress:"+empaddress);
}

public void printempolyeesalary(double empsalary) {
	System.out.println("empolyeesalary:"+empsalary);
}

public void printemployeephoneNumber(long empphonenumber) {
	System.out.println("employeephoneNumber:"+empphonenumber);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpolyeeDetalis empolyee=new EmpolyeeDetalis();
empolyee.printEmpolyeeName("sai",2000);
empolyee.printempolyeeAddress("chennai");
empolyee.printempolyeesalary(25000);
empolyee.printemployeephoneNumber(9988664231l);

	}

}
