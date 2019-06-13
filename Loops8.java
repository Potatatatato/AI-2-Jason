public class Loops8{
	public static void main(String[]args){
		System.out.println(Fib(1,0));
	}//main
	
	public static int Fib(int x, int y){
		for(int i = 1; i <= 10; i++) {
		x = x + y;
		y = x + y;
		
		}//for
		return (x+y)/20;
	}//power
}//Loops