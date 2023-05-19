package classesAndObjs_Exp;

public class MainCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube obj=new Cube();
		obj.setData();
		int res=obj.dispCube();
		System.out.println("Cube(Main)="+res);
		obj.acceptDataFrmMain(20, 20, 20);
		res=obj.dispCube();
		System.out.println("Cube(Main)="+res);
		System.out.println("Cube(Main)="+obj.acceptAndDispDatainMain(30, 30, 30));
		obj.demo();
		obj.add();
		obj.add(50, 50);
		obj.add(100, 200, 300);
		
	}

}
