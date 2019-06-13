import java.util.Scanner;
public class SumAv{
	public static void main(String[] args){
		System.out.println("Enter two doubles");
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		double input1, input2;
		input1 = keyboard.nextDouble();
		input2 = keyboard.nextDouble();
		System.out.println(sum(input1, input2));
		System.out.println(avg(input1, input2));
	}// main
	public static double sum(double x, double y){
		return x + y;
		}//sum
		
	public static double avg(double x, double y){
		return ((x+y)/2);
		}//avg
}// SumAv