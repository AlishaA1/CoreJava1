package classesAndObjs_Exp;

public class StudMarks extends Student{
int m1,m2,tot;
public void getMarks()
{
	m1=60;
	m2=70;
	
}
public int returnTot()
{
	return(m1+m2);
}
public void demo()
{
	System.out.println("Student Marks...");
}
}
