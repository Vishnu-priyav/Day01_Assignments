package week1.day01;

public class Fibonacci_series {

	public static void main(String[] args) {

		//initialization
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;

		//print the first number
		System.out.println(firstNum + "\n" + secNum);

		//loop to iterate from 1 to 11
		for(int i=1; i <11; i++) {
			sum= firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			
			//To print the series 
			System.out.println(sum);

		}

	}

}