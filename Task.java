package task1;
import java.util.Scanner;
public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int number1 = number/10000;
		int number2 = number%10000/1000;
		int number3 = number%1000/100;
		int number4 = number%100/10;
		int number5 = number%10;
		System.out.println(number1+"\n"+number2+"\n"+number3+"\n"+number4+"\n"+number5);
		sc.close();

	}

}
