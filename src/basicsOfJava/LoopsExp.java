package basicsOfJava;

public class LoopsExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Natural Numbers");
		for(int i=1;i<=10;i++)  //11<=10
		{
			System.out.println(i);  //1 2 ...10
		}
		System.out.println("Reverse Numbers");
		for(int i=10;i>=1;i--)   //10<=1
		{
			System.out.println(i);
		}
		System.out.println("Even Numbers");
		int j=2;
		while(j<=10)  //12<=10
		{
			System.out.println(j);  //2 4 6 8 10
			j=j+2;
		}
		
		System.out.println("Odd Numbers");
		int k=1;
		do
		{
			System.out.println(k); 
			k=k+2;
		}while(k<=10);
	}

}
