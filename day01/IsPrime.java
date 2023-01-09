package week1.day01;

public class IsPrime {

	public static void main(String[] args) {
		int num= 13;
		boolean isPrime= true;

		for(int i=2; i<num; i++) {
			if (num%i==0) {
				System.out.println(num + " is Not a  Prime Number");
				isPrime=false;
				break;
			}
		}
		if(isPrime==true) {
			System.out.println(num + " is a Prime Number");
		}


	}
}