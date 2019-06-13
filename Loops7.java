public class Loops7{
	public static void main(String[]args){
		System.out.println(Fib(1,0));
	}//main
	
	public static int Fib(int x, int y){
		for(int i = 1; i <= 10; i++) {
		x = x + y;
		System.out.println(x);
		y = x + y;
		System.out.println(y);
		
		}//for
		return (x+y);
	}//power
}//Loops