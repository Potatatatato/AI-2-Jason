public class Loops4{
	public static void main(String[]args){
		System.out.println(power(111,112));
	}//main
	
	public static int power(int x, int y){
		for(int i = 1; i<=8788; i++) {
			x = x + (y); 
			y = y + 1;
		}//for
		return (x / 8789) ;
	}//power
}//Loops