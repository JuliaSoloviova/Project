package task3;
import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r;
		System.out.println("Enter the radius of the circle");
		r = sc.nextInt();
		double l = 2*Math.PI*r;
		System.out.println("Length of the circle is: " + l);
		sc.close();
	}

}
