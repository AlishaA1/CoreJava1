package classesAndObjs_Exp;

public class MainStudInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student obj=new Student();
//		obj.getStudInfo();
//		obj.dispStudInfo();
		StudMarks objChild=new StudMarks();
		objChild.getStudInfo();
		objChild.dispStudInfo();
		objChild.demo();
		objChild.getMarks();
		int totRes=objChild.returnTot();
		System.out.println("total Marks="+totRes);
		
	}

}
