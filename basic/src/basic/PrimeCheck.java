package basic;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
int temp;
boolean isprime=true;
Scanner scan = new Scanner(System.in);
System.out.println("enter any number");
int num = scan.nextInt(); 
scan.close();
for(int i= 2;i<= num/2;i++) {
	temp = num % i;
	if (temp==0) {
	isprime=false;
	break;
}
	
	}
if (isprime)
	System.out.println(num+"number is a prime number" );
else
	System.out.println(num +"number is not a prime number");

	}
}
