package basic;

public class SwapTwoNumbers {

	public static void main(String[] args) {
int first=120,second=220;
System.out.println("----before swap----");
System.out.println("first="+first);
System.out.println("second="+second);
first= first-second;
second=first+second;
first=second-first;
 System.out.println("----after swap----");
 System.out.println("first="+first);
 System.out.println("second="+second);

   
	}
}
