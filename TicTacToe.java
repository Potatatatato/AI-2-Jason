import java.util.Scanner;
import java.util.Arrays;

public class TicTacToe{
	static String [][] aa = {{"A","_","_","_"},{"B", "_","_","_"},{"C","_","_","_"}};
	
	public static void main (String [] args){
		String input;
		String x = "x";
		String y = "o";
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("  1 2 3");
		for(int i = 0; i < aa.length; i++){
			for(int j = 0; j < aa[i].length; j++){
				System.out.print(aa[i][j] + " ");
			}//for
			System.out.println();
		}//for
		for(int p = 0; p <=16; p++){
			input = keyboard.nextLine();
			if( input.equalsIgnoreCase("A1")){
				if(aa[0][1] != x && aa[0][1] != y){
					if(p%2 ==0){
						aa[0][1] = "x";
					}else{
						aa[0][1] = "o";
					}//else
					if(win() == true){
						System.out.println();
						System.out.println(" Winner!!!");
						p = 16;
					}else if (tie() == true){
						System.out.println();
						System.out.println(" Tie!!!");
						p = 16;
					}//else if
					for(int i = 0; i < aa.length; i++){
						for(int j = 0; j < aa[i].length; j++){
							System.out.print(aa[i][j] + " ");
						}//for
					System.out.println();
					}//for
				}else{
					System.out.println("Error");
				}//else
			}else if(input.equalsIgnoreCase("A2")){
				if(aa[0][2] != x && aa[0][2] != y){
					if(p%2 ==0){
						aa[0][2] = "x";
					}else{
					aa[0][2] = "o";
					}//else
					if(win() == true){
						System.out.println();
						System.out.println(" Winner!!!");
						p = 16;
					}else if (tie() == true){
						System.out.println();
						System.out.println(" Tie!!!");
						p = 16;
					}//else if
					for(int i = 0; i < aa.length; i++){
						for(int j = 0; j < aa[i].length; j++){
							System.out.print(aa[i][j] + " ");
						}//for
					System.out.println();
					}//for
				}else{
					System.out.println("Error");
				}
			}else if(input.equalsIgnoreCase("A3")){
				if(aa[0][3] != x && aa[0][3] != y){
					if(p%2 ==0){
					aa[0][3] = "x";
					}else{
					aa[0][3] = "o";
					}//else	
					if(win() == true){
						System.out.println();
						System.out.println(" Winner!!!");
						p = 16;
					}else if (tie() == true){
						System.out.println();
						System.out.println(" Tie!!!");
						p = 16;
					}//else if
					for(int i = 0; i < aa.length; i++){
						for(int j = 0; j < aa[i].length; j++){
						System.out.print(aa[i][j] + " ");
						}//for
					System.out.println();
					}//for
				}
				else{
					System.out.println("Error");
				}//else
			}else if(input.equalsIgnoreCase("B1")){
				if(aa[1][1] != x && aa[1][1] != y){
					if(p%2 ==0){
					aa[1][1] = "x";
					}else{
					aa[1][1] = "o";
					}//else
					if(win() == true){
						System.out.println();
						System.out.println(" Winner!!!");
						p = 16;
					}else if (tie() == true){
						System.out.println();
						System.out.println(" Tie!!!");
						p = 16;
					}//else if
					for(int i = 0; i < aa.length; i++){
						for(int j = 0; j < aa[i].length; j++){
						System.out.print(aa[i][j] + " ");
					}//for
					System.out.println();
				}//for
				}else{
					System.out.println("Error");
				}//else
			}else if(input.equalsIgnoreCase("B2")){
				if(aa[1][2] != x && aa[1][2] != y){
					if(p%2 ==0){
					aa[1][2] = "x";
					}else{
					aa[1][2] = "o";
					}//else
					if(win() == true){
						System.out.println();
						System.out.println(" Winner!!!");
						p = 16;
					}else if (tie() == true){
						System.out.println();
						System.out.println(" Tie!!!");
						p = 16;
					}//else if
				for(int i = 0; i < aa.length; i++){
					for(int j = 0; j < aa[i].length; j++){
						System.out.print(aa[i][j] + " ");
				}//for
				System.out.println();
			}//for
				}else{
					System.out.println("Error");
				}
			}else if(input.equalsIgnoreCase("B3")){
				if(aa[1][3] != x && aa[1][3] != y){
				if(p%2 ==0){
				aa[1][3] = "x";
				}else{
				aa[1][3] = "o";
				}//else
				if(win() == true){
					System.out.println();
					System.out.println(" Winner!!!");
					p = 16;
				}else if (tie() == true){
					System.out.println();
					System.out.println(" Tie!!!");
					p = 16;
				}//else if
				for(int i = 0; i < aa.length; i++){
				for(int j = 0; j < aa[i].length; j++){
					System.out.print(aa[i][j] + " ");
				}//for
				System.out.println();
			}//for
				}else{
					System.out.println("Error");
				}
			}else if(input.equalsIgnoreCase("C1")){
				if(aa[2][1] != x && aa[2][1] != y){
				if(p%2 ==0){
				aa[2][1] = "x";
				}else{
				aa[2][1] = "o";
				}//else
				if(win() == true){
					System.out.println();
					System.out.println(" Winner!!!");
					p = 16;
				}else if (tie() == true){
					System.out.println();
					System.out.println(" Tie!!!");
					p = 16;
				}//else if
				for(int i = 0; i < aa.length; i++){
				for(int j = 0; j < aa[i].length; j++){
					System.out.print(aa[i][j] + " ");
				}//for
				System.out.println();
			}//for
				}else{
					System.out.println("Error");
				}
			}else if(input.equalsIgnoreCase("C2")){
				if(aa[2][2] != x && aa[2][2] != y){
				if(p%2 ==0){
				aa[2][2] = "x";
				}else{
				aa[2][2] = "o";
				}//else
				if(win() == true){
					System.out.println(" Winner!!!");
					p = 16;
				}else if (tie() == true){
					System.out.println(" Tie!!!");
					p = 16;
				}//else if
				for(int i = 0; i < aa.length; i++){
				for(int j = 0; j < aa[i].length; j++){
					System.out.print(aa[i][j] + " ");
				}//for
				System.out.println();
			}//for
				}else{
					System.out.println("Error");
				}
			}else if(input.equalsIgnoreCase("C3")){
				if(aa[2][3] != x && aa[2][3] != y){
				if(p%2 ==0){
				aa[2][3] = "x";
				}else{
				aa[2][3] = "o";
				}//else
				if(win() == true){
					System.out.println(" Winner!!!");
					p = 16;
				}else if (tie() == true){
					System.out.println(" Tie!!!");
					p = 16;
				}//else if
				for(int i = 0; i < aa.length; i++){
				for(int j = 0; j < aa[i].length; j++){
					System.out.print(aa[i][j] + " ");
				}//for
				System.out.println();
			}//for
				}else{
					System.out.println("Error");
				}
			}else{
				System.out.println("Error! That coordinate is not within the grid");
			}//else
		}//for
	}//main
	
	public static boolean win(){
		boolean w = false;
		if(aa[0][1].equals("x") && aa[0][2].equals("x") && aa[0][3].equals("x")){
		  w = true;
		}
		if(aa[0][1].equals("x") && aa[1][1].equals("x") && aa[2][1].equals("x")){
		  w = true;
		}
		if (aa[0][1].equals("x") && aa[1][2].equals("x") && aa[2][3].equals("x")){
		  w = true;
		}
		if (aa[0][2].equals("x") && aa[1][2].equals("x") && aa[2][2].equals("x")){
		  w = true;
		}
		if (aa[0][3].equals("x") && aa[1][3].equals("x") && aa[2][3].equals("x")){
		  w = true;
		}
		if (aa[1][1].equals("x") && aa[1][2].equals("x") && aa[1][3].equals("x")){
		  w = true;
		}
		if (aa[2][1].equals("x") && aa[2][2].equals("x") && aa[2][3].equals("x")){
		  w = true;
		}
		if (aa[0][3].equals("x") && aa[1][2].equals("x") && aa[2][1].equals("x")){
		  w = true;
		}
		if(aa[0][1].equals("o") && aa[0][2].equals("o") && aa[0][3].equals("o")){
		  w = true;
		}
		if(aa[0][1].equals("o") && aa[1][1].equals("o") && aa[2][1].equals("o")){
		  w = true;
		}
		if (aa[0][1].equals("o") && aa[1][2].equals("o") && aa[2][3].equals("o")){
		  w = true;
		}
		if (aa[0][2].equals("o") && aa[1][2].equals("o") && aa[2][2].equals("o")){
		  w = true;
		}
		if (aa[0][3].equals("o") && aa[1][3].equals("o") && aa[2][3].equals("o")){
		  w = true;
		}
		if (aa[1][1].equals("o") && aa[1][2].equals("o") && aa[1][3].equals("o")){
		  w = true;
		}
		if (aa[2][1].equals("o") && aa[2][2].equals("o") && aa[2][3].equals("o")){
		  w = true;
		}
		if (aa[0][3].equals("o") && aa[1][2].equals("o") && aa[2][1].equals("o")){
		  w = true;
		}	
		return w;
	}//win
	
	public static boolean tie(){
		boolean z = false;
		int c = 0;
		for(int g = 0; g < aa.length; g++){
			for(int v = 0; v < aa[g].length; v++){
				if(aa[g][v].equals("x") || aa[g][v].equals("o")){
					c = c + 1;
				}//if
			}//for
		}//for
		
		if(c == 9){
			z = true;
		}//if
		return z;
	}
}//class	