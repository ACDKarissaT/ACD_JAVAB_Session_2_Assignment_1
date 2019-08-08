import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Input 3 numbers:");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		sc.close();
		
		if (a >= b && a >= c) {
			System.out.println(a + " is Max.");
		} else if (b >= a && b >= c) {
			System.out.println(b + " is Max.");
		} else {
			System.out.println(c + " is Max.");
		}
	}

}
