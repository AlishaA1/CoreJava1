package classesAndObjs_Exp;

public class CustInfo {
int cno;
String cname;

public CustInfo()
{
	System.out.println("Default Constructor invoked..");
	cno=1;
	cname="jack";
}
public CustInfo(int cno1)
{
	System.out.println("Parameterized Constructor invoked..");
	cno=cno1;
	
}
public CustInfo(int cno1,String cname1)
{
	System.out.println("Parameterized Constructor invoked..");
	cno=cno1;
	cname=cname1;
}
public void dispCustInfo()
{
	System.out.println("cno="+cno+"\t"+"cname="+cname);
}
	
}
