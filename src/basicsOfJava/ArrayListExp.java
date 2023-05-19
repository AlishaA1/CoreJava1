package basicsOfJava;

import java.util.ArrayList;

public class ArrayListExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cNames=new ArrayList<String>();
		System.out.println("Array List size before storing elements="+cNames.size());
		cNames.add("jack");  //0
		cNames.add("pooja");  //1
		cNames.add("George");  //2
		System.out.println("Array List size after storing elements="+cNames.size());
		System.out.println("Array Elements=");
		for(int i=0;i<cNames.size();i++)
		{
			System.out.println(cNames.get(i));
		}
		cNames.add("tani");
		cNames.add(2, "riya");
		cNames.set(0, "Roopali");
		System.out.println("Array Elements after Updating...");
		for(int i=0;i<cNames.size();i++)
		{
			System.out.println(cNames.get(i));
		}
		if(cNames.contains("tani123"))
		{
			System.out.println("Item exists");
		}
		else
		{
			System.out.println("Item not exists");
		}
		
	}

}
