public class Loops2{
	public static void main(String[]args){
		System.out.println(power(4, 5));
	}//main
	
	public static int power(int x, int y){
		for(int i = 1; i <= 4; i++){
		x = x * 4;
		}//for
		return x;
	}//power
}//Loops