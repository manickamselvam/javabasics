package basic;

public class Amstrong {

	public static void main(String[] args) {
int number=371,originalNumber,remainder,result=0;
originalNumber=number;
while(originalNumber !=0) {
	remainder = originalNumber % 10;
	result += Math.pow(remainder,3);
	originalNumber /= 10;
	if(result==number) {
		System.out.println(number+"is a amstrong number");
	}
	else
		System.out.println(number+"is a not amstrong number");
	
}

	}

}
