package basicsOfJava;

import java.util.Scanner;

public class EmpDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaration
		Scanner x=new Scanner(System.in);
		int eno=1;
		String ename="jack";
		float sal=50000;
		System.out.println("enter eno");
		eno=x.nextInt();  //nextInt() is a predefined method
		System.out.println("Enter ename");
		ename=x.next();
		System.out.println("Enter sal");
		sal=x.nextFloat();
		System.out.println("eno="+eno);
		System.out.println("ename="+ename);
		System.out.println("sal="+sal);
	}

}
