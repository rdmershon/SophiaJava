import java.util.Arrays;
import java.util.Scanner;
 
public class TicTacToe {
 
  public static void main(String[] args) {
    int col;
    int row;
    Scanner input = new Scanner(System.in);
    String[][] board = {{" - ", " - ", " - "},
                        {" - ", " - ", " - "},
                        {" - ", " - ", " - "}};  
    // The leading tab chars (\t) indent the board 
    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    // The \n adds a blank line below the board
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");
	
    // Display prompt text
    System.out.print("X - Select row (1 - 3) & select column (1 - 3) ");
    // Space separates row & column
    System.out.print("separated by a space: "); 
    col = input.nextInt();
    row = input.nextInt();
  }
}
