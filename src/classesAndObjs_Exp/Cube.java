package classesAndObjs_Exp;

public class Cube {
	
	int l,b,h;
	public void setData()
	{
		l=10;
		b=10;
		h=10;
	}
	public int dispCube()
	{
		//System.out.println("Cube="+(l*b*h));
		return(l*b*h);
	}
	public void acceptDataFrmMain(int x,int y,int z)
	{
		l=x;
		b=y;
		h=z;
		
	}
	public int acceptAndDispDatainMain(int x,int y,int z)
	{
		l=x;
		b=y;
		h=z;
		return(l*b*h);
		
	}
	protected void demo()
	{
		System.out.println("This is protected method...");
		demo1();
	}
	private void demo1()
	{
		System.out.println("This is private method...");
	}
	public void add()
	{
		System.out.println(10+20);
	}
	public void add(int x,int y)
	{
		System.out.println(x+y);
	}
	public void add(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}


}
