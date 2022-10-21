package interview;

import java.util.Scanner;

public class Problem1 {
public static void main(String[] args) {
	double a,b;
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the first number");
	a=sc.nextDouble();
	System.out.println("enter the second number");
	b=sc.nextDouble();
	System.out.println("enter the operator(+,-,*,/)");
	char op=sc.next().charAt(0);
	double result=0;
	switch(op) {
	case '+':
		result=a+b;
		System.out.println(a + "+ " + op + b + " = " + result);
		break;
		
	case '-':
		result=a-b;
		System.out.println(a + "-" + op + b + " = " + result);
		break;
		
	case '*':
		result=a*b;
		System.out.println(a + "*" + op + b + " = " + result);
		break;
		
	case '/':
		result=a/b;
		System.out.println(a + "/" + op + b + " = " + result);
		break;
		
		default:
			System.out.println("enter correct operator ");
			break;
	}
	
}
}
