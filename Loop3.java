public class Loop3{
	public static void main(String[]args){
		System.out.println(power(1,2));
	}//main
	
	public static int power(int x, int y){
		for(int i = 1; i<=99; i++) {
			x = x + (y); 
			y = y + 1;
		}//for
		return x;
	}//power
}//Loops
