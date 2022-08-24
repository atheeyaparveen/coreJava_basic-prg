package pkg1;

public class Fibonacci_series {

	public static void main(String[] args) {
		//---fibonacci series --- 
		// 0 1 1 2 3 5 8 13 21
		// addition of previous 2 number ve get the next number
		 int num1=0;
		 int num2=1;
		 int num3=0;
		 System.out.println(num1);
		 System.out.println(num2);
		 for(int i=0;i<=20;i++)
		 {
			 num3=num1+num2;
			 System.out.println(num3);
			 num1=num2;
			 num2=num3;
			 
		 }

	}

}
