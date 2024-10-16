package assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
	System.out.println("---Fibonacci Series---");	// TODO Auto-generated method stub
int a=0;
int b=1;
int c;
int range=8;
System.out.println(a);//first number
System.out.println(b);// secondnumber
for (int i = 2; i < 8; i++) 
{
	c=a+b; //Fibonacci series is a sum of two preceding numbers..Third number =first number + second number
	a=b;
	b=c;
	System.out.println(c);
}
	}

}
