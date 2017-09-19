package task2;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 0.5;
		double b = 0.7;
		double c = 0.4;
		double p = (a+b+c)/2; //Half of perimeter
		double Square = Math.sqrt(p*(p-a)*(p-b)*(p-c)); //Herons formula
		System.out.println("Square of the triangle is:" +Square);
	}

}
