/*Author - rsan98k
Output numbers from 1 to x. 
If the number is divisible by 3, replace it with “Fizz”. 
If it is divisible by 5, replace it with “Buzz”. 
If it is divisible by 3 and 5 replace it with “FizzBuzz”.
Example - 
For n=16
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16*/

public class FizzBuzz {
	public static void main(String[] args) {
		FizzBuzz(16);
	}
	static void FizzBuzz(int n) {
		for(int i=1; i<=n; i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}else if(i%3==0) {
				System.out.println("Fizz");
			}else if(i%5==0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
	}
}
