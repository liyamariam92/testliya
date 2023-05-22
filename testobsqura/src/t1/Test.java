package t1;

import java.util.Scanner;

public class Test {
static int a=10,b=20;
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();*/
		int result=sum();
		System.out.println("result="+result);
	}

	public static int sum() {
	
		return a+b;
	}

}
