public class Loops6{
	public static void main(String[]args){
		System.out.println(sumOdd(1,3));
	}//main
	
	public static int sumOdd(int x, int y){
		for(int i = 1; i<=49; i++) {
			x = x + (y); 
			y = (y + 2);
		}//for
		return (x);
	}//power
}//Loops