package assignments;

import java.util.Iterator;

public class IsPrime {
public static void main(String[] args) {
	System.out.println("----------Check the given  number is Prime--------");
	int n=13;
	int count=0;
	
//	for(int i=2; i<=n;i++) . This decoded portion is not giving the correct answer. What is the logical-error in this code?
//	{
//		
//		if(n%i==0) 
//		{
//			System.out.println("The number "+n+" is a Prime");
//			break;
//		}else 
//		
//		{
//			System.out.println("The number "+n+ " is not a prime");
//					}
//	}
	for (int i = 2; i < n-1; i++) {
		if(n%2==0)
		{
			count=1;
			break;
		}
		
	}
	if(count==0)
	{System.out.println("The Given number "+n+" is a Prime");
	}else {
		System.out.println("The Given number "+n+" is not a prime");
	}
}
} 


