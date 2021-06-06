package basic;

public class TempUseSwap {

	public static void main(String[] args) {
int first=100,second=200;
System.out.println("befor swapping");
System.out.println("first"+first);
System.out.println("second"+second);
System.out.println("---------------------------------------------");
System.out.println("after swapping");
int temporary=first;
first=second;
second=temporary;
System.out.println("first="+first);
System.out.println("second"+second);
	}

}
